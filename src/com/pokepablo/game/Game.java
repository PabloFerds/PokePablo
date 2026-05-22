package com.pokepablo.game;

import com.pokepablo.battle.Battle;
import com.pokepablo.factory.PokemonFactory;
import com.pokepablo.model.Player;
import com.pokepablo.model.Pokemon;
import com.pokepablo.world.Route;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private Player player;

    private List<Route> routes = new ArrayList<>();
    private int currentRouteIndex = 0;

    private Scanner input = new Scanner(System.in);

    // =========================
    // START GAME
    // =========================
    public void start() {

        System.out.println("===== POKE PABLO =====");

        player = new Player("Pablo");

        createWorld();
        chooseStarter();
        gameLoop();
    }

    // =========================
    // WORLD SYSTEM
    // =========================
    private void createWorld() {

        // ROUTE 1 - iniciante
        Route route1 = new Route("Route 1", 1, 5);
        route1.addWildPokemon(1); // Bulbasaur line
        route1.addWildPokemon(4); // Charmander line
        route1.addWildPokemon(7); // Squirtle line

        // ROUTE 2 - médio
        Route route2 = new Route("Route 2", 5, 10);
        route2.addWildPokemon(16); // Pidgey
        route2.addWildPokemon(19); // Rattata
        route2.addWildPokemon(21); // Spearow

        // ROUTE 3 - avançado
      Route route3 = new Route("Route 3", 10, 20);
        route3.addWildPokemon(25); // Pikachu
        route3.addWildPokemon(37); // Vulpix
        route3.addWildPokemon(58); // Growlithe

        routes.add(route1);
        routes.add(route2);
        routes.add(route3);

        System.out.println("World created!");
    }

    private Route getCurrentRoute() {
        return routes.get(currentRouteIndex);
    }

    private void nextRoute() {

        if (currentRouteIndex < routes.size() - 1) {

            currentRouteIndex++;

            System.out.println(
                    "\nYou moved to " +
                    getCurrentRoute().getName()
            );

        } else {

            System.out.println("\nYou are at the final route!");
        }
    }

    // =========================
    // STARTER CHOICE
    // =========================
    private void chooseStarter() {

        System.out.println("\nChoose your starter:");

        System.out.println("1 - Bulbasaur");
        System.out.println("4 - Charmander");
        System.out.println("7 - Squirtle");

        int choice = input.nextInt();

        Pokemon starter =
                PokemonFactory.createPokemon(choice);

        if (starter == null) {

            System.out.println("Invalid pokemon!");
            chooseStarter();
            return;
        }

        player.addPokemon(starter);
        player.setActivePokemon(starter);

        System.out.println(
                "You chose " + starter.getName()
        );
    }

    // =========================
    // GAME LOOP
    // =========================
    private void gameLoop() {

        while (true) {

            System.out.println("\n===== MENU =====");

            System.out.println("1 - Explore");
            System.out.println("2 - Show Team");
            System.out.println("3 - Show Pokeballs");
            System.out.println("4 - Exit");

            int option = input.nextInt();

            switch (option) {

                case 1:
                    explore();
                    break;

                case 2:
                    showTeam();
                    break;

                case 3:
                    showPokeballs();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    // =========================
    // EXPLORE SYSTEM
    // =========================
    private void explore() {

        Route route = getCurrentRoute();

        System.out.println(
                "\nExploring " + route.getName()
        );

        int chance = (int) (Math.random() * 100);

        if (chance < 60) {

            int pokemonId = route.getRandomPokemon();

            Pokemon wildPokemon =
                    PokemonFactory.createPokemon(pokemonId);

            System.out.println(
                    "\nA wild " +
                    wildPokemon.getName() +
                    " appeared!"
            );

            Battle battle =
                    new Battle(player, wildPokemon);

            battle.startBattle();

            if (wildPokemon.isFainted()) {

                player.addWin();
                player.rewardPokeballs();
            }

        } else {

            System.out.println("Nothing found...");
        }

        // chance de avançar rota
        if (Math.random() < 0.3) {
            nextRoute();
        }
    }

    // =========================
    // TEAM
    // =========================
    private void showTeam() {

        System.out.println("\n===== YOUR TEAM =====");

        for (Pokemon pokemon : player.getPokemons()) {

            System.out.println(
                    pokemon.getId()
                    + " - "
                    + pokemon.getName()
                    + " | Lv: "
                    + pokemon.getLevel()
                    + " | HP: "
                    + pokemon.getCurrentHp()
                    + "/"
                    + pokemon.getMaxHp()
            );
        }

        System.out.println(
                "\nActive: " +
                player.getActivePokemon().getName()
        );
    }

    // =========================
    // POKEBALLS
    // =========================
    private void showPokeballs() {

        System.out.println(
                "\nPokeballs: " +
                player.getPokeballs()
        );
    }
}