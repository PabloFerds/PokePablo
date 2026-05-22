package com.pokepablo.battle;

import com.pokepablo.model.Move;
import com.pokepablo.model.Pokemon;
import com.pokepablo.model.Player;
import java.util.Scanner;

public class Battle {

    private Player player;
    private Pokemon enemyPokemon;

    private Scanner input = new Scanner(System.in);

    public Battle(Player player, Pokemon enemyPokemon) {
        this.player = player;
        this.enemyPokemon = enemyPokemon;
    }

    public void playerTurn(int moveIndex) {

        if (player.getActivePokemon().isFainted()) {
            System.out.println(player.getActivePokemon().getName() + " is fainted!");
            return;
        }
        Move move = player.getActivePokemon().getMove(moveIndex);//seleciona o move
        int damage = move.execute(player.getActivePokemon(), enemyPokemon);//fazert toda a verificacao do execute
        System.out.println(
                player.getActivePokemon().getName()
                + " used "
                + move.getName()
        );//quem atacou e nome do ataque

        System.out.println("Damage: " + damage);//dano causado

        System.out.println(
                enemyPokemon.getName()
                + " HP: "
                + enemyPokemon.getCurrentHp()
                + "/"
                + enemyPokemon.getMaxHp()
        );//vida restante do enemy
    }

    public void enemyTurn() {
        if (enemyPokemon.isFainted()) {
            System.out.println(enemyPokemon.getName() + " is fainted!");
            return;
        }
        int randomIndex = (int) (Math.random() * enemyPokemon.getMoves().size());//aleatoriza o move do pokemon
        Move move = enemyPokemon.getMove(randomIndex);
        int damage = move.execute(enemyPokemon, player.getActivePokemon());

        System.out.println(
                enemyPokemon.getName()
                + " used "
                + move.getName()
        );

        System.out.println(
                "Damage: " + damage
        );

        System.out.println(
                player.getActivePokemon().getName()
                + " HP: "
                + player.getActivePokemon().getCurrentHp()
                + "/"
                + player.getActivePokemon().getMaxHp()
        );
    }

    public boolean isBattleOver() {
        return player.getActivePokemon().isFainted() || enemyPokemon.isFainted();
    }//fim da batalha 

    private void choosePokemon() {//escolhendo pokemon para batalhar 
        System.out.println("\nChoose your Pokemon:");
        for (int i = 0; i < player.getPokemons().size(); i++) {

            Pokemon pokemon = player.getPokemons().get(i);

            System.out.println(
                    i + " - "
                    + pokemon.getName()
                    + " Lv."
                    + pokemon.getLevel()
            );
        }// mostra todos os meus pokemons seu nivel e nome

        int choice = input.nextInt();//escolha feita com o id

        Pokemon selectedPokemon = player.getPokemons().get(choice);

        player.setActivePokemon(selectedPokemon); //pokemon escohido

        System.out.println(
                "\nGo "
                + selectedPokemon.getName()
                + "!"
        );
    }

    public void startBattle() {

        System.out.println(
                "\nA wild "
                + enemyPokemon.getName()
                + " appeared!"
        );//apareceu um pokemon

        choosePokemon();//escolhe o pokemon para a batalha

        while (!isBattleOver()) {

            System.out.println("\n====== BATTLE ======");

            System.out.println(
                    player.getActivePokemon().getName()
                    + " HP: "
                    + player.getActivePokemon().getCurrentHp()
                    + "/"
                    + player.getActivePokemon().getMaxHp()
            );

            System.out.println(
                    enemyPokemon.getName()
                    + " HP: "
                    + enemyPokemon.getCurrentHp()
                    + "/"
                    + enemyPokemon.getMaxHp()
            );

            System.out.println("\n1 - Attack");
            System.out.println("2 - Run");

            int choice = input.nextInt();

            if (choice == 1) {

                for (int i = 0; i < player.getActivePokemon().getMoves().size(); i++) {

                    Move move = player.getActivePokemon().getMove(i);

                    System.out.println(
                            i + " - "
                            + move.getName()
                            + " PP: "
                            + move.getCurrentPP()
                            + "/"
                            + move.getMaxPP()
                    );
                }

                int moveChoice = input.nextInt();

                playerTurn(moveChoice);

                if (!enemyPokemon.isFainted()) {
                    enemyTurn();
                }
            } else if (choice == 2) {

                System.out.println("You ran away!");

                return;
            } else {

                System.out.println("Invalid option!");
            }
        }

        if (player.getActivePokemon().isFainted()) {

            System.out.println("\nYou lost the battle!");
        } else {

            System.out.println("\nYou won the battle!");
        }
    }
}
