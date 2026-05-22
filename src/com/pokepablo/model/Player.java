package com.pokepablo.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;

    private List<Pokemon> pokemons =
            new ArrayList<>();

    private Pokemon activePokemon;

    private int pokeballs;

    private int wins;

    public Player(String name) {

        this.name = name;

        this.pokeballs = 5;

        this.wins = 0;
    }

    public void addPokemon(Pokemon pokemon) {

        if (pokemons.size() >= 6) {

            System.out.println(
                    "Your team is full!"
            );

            return;
        }

        pokemons.add(pokemon);

        System.out.println(
                pokemon.getName()
                + " was added to your team!"
        );
    }

    public boolean hasAvailablePokemon() {

        for (Pokemon pokemon : pokemons) {

            if (!pokemon.isFainted()) {

                return true;
            }
        }

        return false;
    }

    public boolean usePokeball() {

        if (pokeballs <= 0) {

            System.out.println(
                    "No Pokeballs left!"
            );

            return false;
        }

        pokeballs--;

        return true;
    }

    public void addPokeballs(int amount) {

        pokeballs += amount;

        System.out.println(
                "You received "
                + amount
                + " Pokeballs!"
        );
    }

    public void addWin() {

        wins++;
    }

    public void rewardPokeballs() {

        if (wins % 3 == 0) {

            addPokeballs(2);
        }
    }

    public void chooseActivePokemon(int index) {

        if (index < 0 || index >= pokemons.size()) {

            System.out.println(
                    "Invalid Pokemon!"
            );

            return;
        }

        Pokemon selectedPokemon =
                pokemons.get(index);

        if (selectedPokemon.isFainted()) {

            System.out.println(
                    selectedPokemon.getName()
                    + " is fainted!"
            );

            return;
        }

        activePokemon = selectedPokemon;

        System.out.println(
                selectedPokemon.getName()
                + " is now your active Pokemon!"
        );
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public Pokemon getActivePokemon() {
        return activePokemon;
    }

    public void setActivePokemon(Pokemon activePokemon) {
        this.activePokemon = activePokemon;
    }

    public int getPokeballs() {
        return pokeballs;
    }

    public int getWins() {
        return wins;
    }
}