package com.pokepablo.game;

import com.pokepablo.battle.Battle;
import com.pokepablo.factory.PokemonFactory;
import com.pokepablo.model.Player;
import com.pokepablo.model.Pokemon;
import com.pokepablo.world.Route;

import java.util.Scanner;

public class GameEngine {

    private Player player;
    private Route currentRoute;

    private Scanner input = new Scanner(System.in);

    public GameEngine(Player player, Route route) {
        this.player = player;
        this.currentRoute = route;
    }

    public void start() {

        System.out.println("=== POKEPABLO GAME START ===");

        while (true) {

            System.out.println("\nVocê está em: " + currentRoute.getName());
            System.out.println("1 - Explorar");
            System.out.println("2 - Ver pokemons");
            System.out.println("3 - Sair");

            int choice = input.nextInt();

            if (choice == 1) {

                explore();

            } else if (choice == 2) {

                showPokemons();

            } else if (choice == 3) {

                System.out.println("Saindo do jogo...");
                break;

            } else {

                System.out.println("Opção inválida!");
            }
        }
    }

    private void explore() {

        System.out.println("Explorando a rota...");

        int chance = (int) (Math.random() * 100);

        if (chance < 60) {

            int pokemonId = currentRoute.getRandomPokemon();
            Pokemon wild = PokemonFactory.createPokemon(pokemonId);

            System.out.println("\nUm " + wild.getName() + " apareceu!");

            Battle battle = new Battle(player, wild);
            battle.startBattle();

        } else {

            System.out.println("Nada encontrado...");
        }
    }

    private void showPokemons() {

        System.out.println("\n=== SEUS POKEMONS ===");

        for (Pokemon p : player.getPokemons()) {

            System.out.println(
                    p.getId() + " - " +
                    p.getName() + " Lv." +
                    p.getLevel() + " HP " +
                    p.getCurrentHp() + "/" +
                    p.getMaxHp()
            );
        }
    }
}