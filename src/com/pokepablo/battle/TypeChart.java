package com.pokepablo.battle;

import com.pokepablo.enums.PokemonType;

import java.util.HashMap;
import java.util.Map;

public class TypeChart {

    private static final Map<PokemonType, Map<PokemonType, Double>> chart =
            new HashMap<>();

    static {

        for (PokemonType attacker : PokemonType.values()) {
            chart.put(attacker, new HashMap<>());
        }

        // FIRE
        chart.get(PokemonType.FIRE).put(PokemonType.GRASS, 2.0);
        chart.get(PokemonType.FIRE).put(PokemonType.BUG, 2.0);
        chart.get(PokemonType.FIRE).put(PokemonType.ICE, 2.0);
        chart.get(PokemonType.FIRE).put(PokemonType.ROCK, 0.5);
        chart.get(PokemonType.FIRE).put(PokemonType.WATER, 0.5);
        chart.get(PokemonType.FIRE).put(PokemonType.FIRE, 1.0);

        // WATER
        chart.get(PokemonType.WATER).put(PokemonType.FIRE, 2.0);
        chart.get(PokemonType.WATER).put(PokemonType.ROCK, 2.0);
        chart.get(PokemonType.WATER).put(PokemonType.GROUND, 2.0);
        chart.get(PokemonType.WATER).put(PokemonType.GRASS, 0.5);
        chart.get(PokemonType.WATER).put(PokemonType.ELECTRIC, 0.5);
        chart.get(PokemonType.WATER).put(PokemonType.WATER, 1.0);

        // GRASS
        chart.get(PokemonType.GRASS).put(PokemonType.WATER, 2.0);
        chart.get(PokemonType.GRASS).put(PokemonType.GROUND, 2.0);
        chart.get(PokemonType.GRASS).put(PokemonType.ROCK, 2.0);
        chart.get(PokemonType.GRASS).put(PokemonType.FIRE, 0.5);
        chart.get(PokemonType.GRASS).put(PokemonType.BUG, 0.5);
        chart.get(PokemonType.GRASS).put(PokemonType.FLYING, 0.5);
        chart.get(PokemonType.GRASS).put(PokemonType.POISON, 0.5);
        chart.get(PokemonType.GRASS).put(PokemonType.GRASS, 1.0);

        // ELECTRIC
        chart.get(PokemonType.ELECTRIC).put(PokemonType.WATER, 2.0);
        chart.get(PokemonType.ELECTRIC).put(PokemonType.FLYING, 2.0);
        chart.get(PokemonType.ELECTRIC).put(PokemonType.GROUND, 0.0);
        chart.get(PokemonType.ELECTRIC).put(PokemonType.ELECTRIC, 1.0);

        // ROCK
        chart.get(PokemonType.ROCK).put(PokemonType.FIRE, 2.0);
        chart.get(PokemonType.ROCK).put(PokemonType.FLYING, 2.0);
        chart.get(PokemonType.ROCK).put(PokemonType.BUG, 2.0);
        chart.get(PokemonType.ROCK).put(PokemonType.ICE, 2.0);
        chart.get(PokemonType.ROCK).put(PokemonType.FIGHTING, 0.5);
        chart.get(PokemonType.ROCK).put(PokemonType.GROUND, 0.5);
        chart.get(PokemonType.ROCK).put(PokemonType.WATER, 0.5);
        chart.get(PokemonType.ROCK).put(PokemonType.ROCK, 1.0);

        // GHOST
        chart.get(PokemonType.GHOST).put(PokemonType.PSYCHIC, 2.0);
        chart.get(PokemonType.GHOST).put(PokemonType.NORMAL, 0.0);
        chart.get(PokemonType.GHOST).put(PokemonType.FIGHTING, 0.0);
        chart.get(PokemonType.GHOST).put(PokemonType.GHOST, 2.0);

        // FIGHTING
        chart.get(PokemonType.FIGHTING).put(PokemonType.NORMAL, 2.0);
        chart.get(PokemonType.FIGHTING).put(PokemonType.ROCK, 2.0);
        chart.get(PokemonType.FIGHTING).put(PokemonType.ICE, 2.0);
        chart.get(PokemonType.FIGHTING).put(PokemonType.PSYCHIC, 0.5);
        chart.get(PokemonType.FIGHTING).put(PokemonType.FLYING, 0.5);
        chart.get(PokemonType.FIGHTING).put(PokemonType.BUG, 0.5);
        chart.get(PokemonType.FIGHTING).put(PokemonType.FIGHTING, 1.0);

        // GROUND
        chart.get(PokemonType.GROUND).put(PokemonType.FIRE, 2.0);
        chart.get(PokemonType.GROUND).put(PokemonType.ELECTRIC, 2.0);
        chart.get(PokemonType.GROUND).put(PokemonType.POISON, 2.0);
        chart.get(PokemonType.GROUND).put(PokemonType.ROCK, 2.0);
        chart.get(PokemonType.GROUND).put(PokemonType.GRASS, 0.5);
        chart.get(PokemonType.GROUND).put(PokemonType.ICE, 0.5);
        chart.get(PokemonType.GROUND).put(PokemonType.WATER, 0.5);
        chart.get(PokemonType.GROUND).put(PokemonType.GROUND, 1.0);

        // DRAGON
        chart.get(PokemonType.DRAGON).put(PokemonType.DRAGON, 2.0);
        chart.get(PokemonType.DRAGON).put(PokemonType.ICE, 0.5);
        chart.get(PokemonType.DRAGON).put(PokemonType.FLYING, 1.0);
    }

    public static double getMultiplier(PokemonType attacker, PokemonType defender) {

        Map<PokemonType, Double> inner = chart.get(attacker);

        if (inner == null) {
            return 1.0;
        }

        return inner.getOrDefault(defender, 1.0);
    }
}