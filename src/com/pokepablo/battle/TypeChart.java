package com.pokepablo.battle;

import com.pokepablo.enums.PokemonType;

import java.util.HashMap;
import java.util.Map;

public class TypeChart {

    private static final Map<PokemonType, Map<PokemonType, Double>> chart = new HashMap<>();

    static {

        // FIRE
        chart.put(PokemonType.FIRE, Map.of(
                PokemonType.GRASS, 2.0,
                PokemonType.BUG, 2.0,
                PokemonType.ICE, 2.0,
                PokemonType.ROCK, 0.5,
                PokemonType.WATER, 0.5,
                PokemonType.FIRE, 1.0
        ));

        // WATER
        chart.put(PokemonType.WATER, Map.of(
                PokemonType.FIRE, 2.0,
                PokemonType.ROCK, 2.0,
                PokemonType.GROUND, 2.0,
                PokemonType.GRASS, 0.5,
                PokemonType.ELECTRIC, 0.5,
                PokemonType.WATER, 1.0
        ));

        // GRASS
        chart.put(PokemonType.GRASS, Map.of(
                PokemonType.WATER, 2.0,
                PokemonType.GROUND, 2.0,
                PokemonType.ROCK, 2.0,
                PokemonType.FIRE, 0.5,
                PokemonType.BUG, 0.5,
                PokemonType.FLYING, 0.5,
                PokemonType.POISON, 0.5,
                PokemonType.GRASS, 1.0
        ));

        // ELECTRIC
        chart.put(PokemonType.ELECTRIC, Map.of(
                PokemonType.WATER, 2.0,
                PokemonType.FLYING, 2.0,
                PokemonType.GROUND, 0.0,
                PokemonType.ELECTRIC, 1.0
        ));

        // ROCK
        chart.put(PokemonType.ROCK, Map.of(
                PokemonType.FIRE, 2.0,
                PokemonType.FLYING, 2.0,
                PokemonType.BUG, 2.0,
                PokemonType.ICE, 2.0,
                PokemonType.FIGHTING, 0.5,
                PokemonType.GROUND, 0.5,
                PokemonType.WATER, 0.5,
                PokemonType.ROCK, 1.0
        ));

        // GHOST
        chart.put(PokemonType.GHOST, Map.of(
                PokemonType.PSYCHIC, 2.0,
                PokemonType.NORMAL, 0.0,
                PokemonType.FIGHTING, 0.0,
                PokemonType.GHOST, 2.0
        ));

        // FIGHTING
        chart.put(PokemonType.FIGHTING, Map.of(
                PokemonType.NORMAL, 2.0,
                PokemonType.ROCK, 2.0,
                PokemonType.ICE, 2.0,
                PokemonType.PSYCHIC, 0.5,
                PokemonType.FLYING, 0.5,
                PokemonType.BUG, 0.5,
                PokemonType.FIGHTING, 1.0
        ));

        // GROUND
        chart.put(PokemonType.GROUND, Map.of(
                PokemonType.FIRE, 2.0,
                PokemonType.ELECTRIC, 2.0,
                PokemonType.POISON, 2.0,
                PokemonType.ROCK, 2.0,
                PokemonType.GRASS, 0.5,
                PokemonType.ICE, 0.5,
                PokemonType.WATER, 0.5,
                PokemonType.GROUND, 1.0
        ));

        // DRAGON
        chart.put(PokemonType.DRAGON, Map.of(
                PokemonType.DRAGON, 2.0,
                PokemonType.ICE, 0.5,
                PokemonType.FLYING, 1.0
        ));

        // DEFAULT (neutro)
        for (PokemonType attacker : PokemonType.values()) {
            chart.putIfAbsent(attacker, new HashMap<>());

            for (PokemonType defender : PokemonType.values()) {
                chart.get(attacker)
                        .putIfAbsent(defender, 1.0);
            }
        }
    }

    public static double getMultiplier(PokemonType attacker, PokemonType defender) {
        return chart
                .getOrDefault(attacker, Map.of())
                .getOrDefault(defender, 1.0);
    }
}
