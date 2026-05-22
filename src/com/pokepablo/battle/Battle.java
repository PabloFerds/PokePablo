package com.pokepablo.battle;

import com.pokepablo.model.Move;
import com.pokepablo.model.Player;
import com.pokepablo.model.Pokemon;

import java.util.Scanner;

public class Battle {

    private Player player;
    private Pokemon enemyPokemon;

    private Scanner input = new Scanner(System.in);

    public Battle(Player player, Pokemon enemyPokemon) {
        this.player = player;
        this.enemyPokemon = enemyPokemon;
    }

    // =========================
    // PLAYER TURN
    // =========================
    public void playerTurn(int moveIndex) {

        if (player.getActivePokemon().isFainted()) {
            System.out.println(player.getActivePokemon().getName() + " is fainted!");
            return;
        }

        if (moveIndex < 0 ||
            moveIndex >= player.getActivePokemon().getMoves().size()) {
            System.out.println("Invalid move!");
            return;
        }

        Move move = player.getActivePokemon().getMove(moveIndex);

        int damage = move.execute(
                player.getActivePokemon(),
                enemyPokemon
        );

        System.out.println(
                player.getActivePokemon().getName()
                + " used "
                + move.getName()
        );

        System.out.println("Damage: " + damage);

        System.out.println(
                enemyPokemon.getName()
                + " HP: "
                + enemyPokemon.getCurrentHp()
                + "/"
                + enemyPokemon.getMaxHp()
        );
    }

    // =========================
    // ENEMY TURN
    // =========================
    public void enemyTurn() {

        if (enemyPokemon.isFainted()) {
            System.out.println(enemyPokemon.getName() + " is fainted!");
            return;
        }

        int randomIndex = (int) (
                Math.random() * enemyPokemon.getMoves().size()
        );

        Move move = enemyPokemon.getMove(randomIndex);

        int damage = move.execute(
                enemyPokemon,
                player.getActivePokemon()
        );

        System.out.println(
                enemyPokemon.getName()
                + " used "
                + move.getName()
        );

        System.out.println("Damage: " + damage);

        System.out.println(
                player.getActivePokemon().getName()
                + " HP: "
                + player.getActivePokemon().getCurrentHp()
                + "/"
                + player.getActivePokemon().getMaxHp()
        );
    }

    // =========================
    // BATTLE STATE
    // =========================
    public boolean isBattleOver() {

        return enemyPokemon.isFainted()
                || !player.hasAvailablePokemon();
    }

    // =========================
    // CHOOSE POKEMON
    // =========================
    private void choosePokemon() {

        System.out.println("\nChoose your Pokemon:");

        for (int i = 0; i < player.getPokemons().size(); i++) {

            Pokemon pokemon = player.getPokemons().get(i);

            System.out.println(
                    i + " - " +
                    pokemon.getName() +
                    " Lv." + pokemon.getLevel() +
                    " HP: " + pokemon.getCurrentHp() +
                    "/" + pokemon.getMaxHp()
            );
        }

        int choice = input.nextInt();

        Pokemon selected = player.getPokemons().get(choice);

        if (selected.isFainted()) {
            System.out.println("This Pokémon is fainted! Choose another one.");
            choosePokemon();
            return;
        }

        player.setActivePokemon(selected);

        System.out.println("\nGo " + selected.getName() + "!");
    }

    // =========================
    // SHOW MOVES
    // =========================
    private void showMoves() {

        System.out.println("\nChoose a move:");

        for (int i = 0; i < player.getActivePokemon().getMoves().size(); i++) {

            Move move = player.getActivePokemon().getMove(i);

            System.out.println(
                    i + " - " +
                    move.getName() +
                    " PP: " +
                    move.getCurrentPP() +
                    "/" +
                    move.getMaxPP()
            );
        }
    }

    // =========================
    // CATCH POKEMON
    // =========================
    private boolean tryCatchPokemon() {

        if (!player.usePokeball()) {
            System.out.println("No Pokeballs left!");
            return false;
        }

        double hpPercent =
                (double) enemyPokemon.getCurrentHp()
                        / enemyPokemon.getMaxHp();

        double catchChance = 1 - hpPercent;

        if (Math.random() < catchChance) {

            System.out.println(
                    enemyPokemon.getName() + " was caught!"
            );

            player.addPokemon(enemyPokemon);

            return true;
        }

        System.out.println(
                enemyPokemon.getName() + " escaped!"
        );

        return false;
    }

    // =========================
    // START BATTLE
    // =========================
    public void startBattle() {

        System.out.println(
                "\nA wild " +
                enemyPokemon.getName() +
                " appeared!"
        );

        choosePokemon();

        while (!isBattleOver()) {

            // 🔥 checagem de derrota do player
            if (player.getActivePokemon().isFainted()) {

                System.out.println("\nYour Pokémon fainted!");

                if (!player.hasAvailablePokemon()) {
                    System.out.println("You lost the battle!");
                    return;
                }

                choosePokemon();
            }

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
            System.out.println("2 - Catch");
            System.out.println("3 - Run");

            int choice = input.nextInt();

            if (choice == 1) {

                showMoves();

                int moveChoice = input.nextInt();

                playerTurn(moveChoice);

                if (!enemyPokemon.isFainted()) {
                    enemyTurn();
                }

            } else if (choice == 2) {

                if (tryCatchPokemon()) {
                    return;
                }

                enemyTurn();

            } else if (choice == 3) {

                System.out.println("You ran away!");
                return;

            } else {

                System.out.println("Invalid option!");
            }
        }

        if (enemyPokemon.isFainted()) {
            System.out.println("\nYou won the battle!");
        }
    }
}