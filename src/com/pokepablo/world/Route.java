package com.pokepablo.world;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private String name;

    // nível recomendado da rota
    private int minLevel;
    private int maxLevel;

    private List<Integer> wildPokemons =
            new ArrayList<>();

    public Route(String name, int minLevel, int maxLevel) {

        this.name = name;
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
    }

    // =========================
    // ADD POKEMON
    // =========================
    public void addWildPokemon(int pokemonId) {
        wildPokemons.add(pokemonId);
    }

    // =========================
    // RANDOM ENCOUNTER
    // =========================
    public int getRandomPokemon() {

        if (wildPokemons.isEmpty()) {
            throw new IllegalStateException(
                    "No wild pokemons in route: " + name
            );
        }

        int randomIndex =
                (int) (Math.random() * wildPokemons.size());

        return wildPokemons.get(randomIndex);
    }

    // =========================
    // INFO
    // =========================
    public String getName() {
        return name;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public List<Integer> getWildPokemons() {
        return wildPokemons;
    }

    // =========================
    // UTIL (IMPORTANTE PARA O FUTURO)
    // =========================
    public boolean isSuitableLevel(int playerLevel) {
        return playerLevel >= minLevel && playerLevel <= maxLevel;
    }
}