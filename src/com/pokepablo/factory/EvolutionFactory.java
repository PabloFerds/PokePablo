package com.pokepablo.factory;

import java.util.*;

public class EvolutionFactory {

    private static final Map<Integer, List<Evolution>> evolutions = new HashMap<>();

    static {

        // =========================
        // STARTERS (3 STAGES)
        // =========================
        add(1, 2, 16);   // Bulbasaur -> Ivysaur
        add(2, 3, 32);   // Ivysaur -> Venusaur

        add(4, 5, 16);   // Charmander -> Charmeleon
        add(5, 6, 36);   // Charmeleon -> Charizard

        add(7, 8, 16);   // Squirtle -> Wartortle
        add(8, 9, 36);   // Wartortle -> Blastoise

        // =========================
        // BUG LINE (3 STAGES)
        // =========================
        add(10, 11, 7);  // Caterpie -> Metapod
        add(11, 12, 10); // Metapod -> Butterfree

        add(13, 14, 7);  // Weedle -> Kakuna
        add(14, 15, 10); // Kakuna -> Beedrill

        // =========================
        // EARLY BIRDS
        // =========================
        add(16, 17, 18); // Pidgey -> Pidgeotto
        add(17, 18, 36); // Pidgeotto -> Pidgeot

        add(21, 22, 20); // Spearow -> Fearow

        // =========================
        // RODENTS
        // =========================
        add(19, 20, 20); // Rattata -> Raticate

        add(29, 30, 16); // Nidoran F -> Nidorina
        add(30, 31, 32); // Nidorina -> Nidoqueen

        add(32, 33, 16); // Nidoran M -> Nidorino
        add(33, 34, 32); // Nidorino -> Nidoking

        // =========================
        // ELECTRIC
        // =========================
        add(25, 26, 22); // Pikachu -> Raichu
        add(100, 101, 30); // Voltorb -> Electrode

        // =========================
        // GRASS
        // =========================
        add(43, 44, 21); // Oddish -> Gloom
        add(44, 45, 36); // Gloom -> Vileplume

        add(69, 70, 21); // Bellsprout -> Weepinbell
        add(70, 71, 36); // Weepinbell -> Victreebel

        // =========================
        // WATER
        // =========================
        add(60, 61, 25); // Poliwag -> Poliwhirl
        add(61, 62, 40); // Poliwhirl -> Poliwrath

        add(72, 73, 30); // Tentacool -> Tentacruel

        add(79, 80, 37); // Slowpoke -> Slowbro

        add(86, 87, 34); // Seel -> Dewgong

        add(98, 99, 28); // Krabby -> Kingler

        add(116, 117, 32); // Horsea -> Seadra

        add(118, 119, 30); // Goldeen -> Seaking

        add(120, 121, 38); // Staryu -> Starmie

        add(129, 130, 20); // Magikarp -> Gyarados

        add(133, 134, 36); // Eevee -> Vaporeon
        add(133, 135, 36); // Eevee -> Jolteon
        add(133, 136, 36); // Eevee -> Flareon

        // =========================
        // ROCK / GROUND
        // =========================
        add(74, 75, 25); // Geodude -> Graveler
        add(75, 76, 40); // Graveler -> Golem

        add(27, 28, 22); // Sandshrew -> Sandslash

        add(50, 51, 26); // Diglett -> Dugtrio

        add(104, 105, 28); // Cubone -> Marowak

        add(111, 112, 42); // Rhyhorn -> Rhydon

        // =========================
        // PSYCHIC
        // =========================
        add(63, 64, 16); // Abra -> Kadabra
        add(64, 65, 36); // Kadabra -> Alakazam

        add(96, 97, 32); // Drowzee -> Hypno

        // =========================
        // GHOST
        // =========================
        add(92, 93, 25); // Gastly -> Haunter
        add(93, 94, 40); // Haunter -> Gengar

        // =========================
        // FIGHTING (sem evolução)
        // =========================
        // 106, 107 não evoluem
        // =========================
        // ICE / LEGENDÁRIOS (sem evolução)
        // =========================
        // 124, 131, 144 não evoluem
        // =========================
        // DRAGON
        // =========================
        add(147, 148, 30); // Dratini -> Dragonair
        add(148, 149, 55); // Dragonair -> Dragonite

        // =========================
        // LEGENDÁRIO FINAL
        // =========================
        // 150 (Mewtwo) não evolui
    }

    private static void add(int from, int to, int level) {
        evolutions
                .computeIfAbsent(from, k -> new ArrayList<>())
                .add(new Evolution(to, level));
    }

    public static Evolution checkEvolution(int id, int level) {
        List<Evolution> list = evolutions.get(id);

        if (list == null) {
            return null;
        }

        for (Evolution e : list) {
            if (level >= e.levelRequired) {
                return e;
            }
        }
        return null;
    }

    public static class Evolution {

        public int nextId;
        public int levelRequired;

        public Evolution(int nextId, int levelRequired) {
            this.nextId = nextId;
            this.levelRequired = levelRequired;
        }
    }
}
