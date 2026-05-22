package com.pokepablo.world;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private String name;

    private List<Integer> wildPokemons =
            new ArrayList<>();

    public Route(String name) {

        this.name = name;
    }

    public void addWildPokemon(int pokemonId) {

        wildPokemons.add(pokemonId);
    }

    public int getRandomPokemon() {

        int randomIndex =
                (int) (Math.random() * wildPokemons.size());

        return wildPokemons.get(randomIndex);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getWildPokemons() {
        return wildPokemons;
    }
}