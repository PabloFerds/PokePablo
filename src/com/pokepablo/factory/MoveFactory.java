package com.pokepablo.factory;

import com.pokepablo.enums.PokemonType;
import com.pokepablo.model.Move;

import java.util.ArrayList;
import java.util.List;

public class MoveFactory {

    public static List<Move> createMoves(int pokemonId) {

        List<Move> moves = new ArrayList<>();

        switch (pokemonId) {

            // =========================
            // BULBASAUR LINE
            // =========================
            case 1:
            case 2:
            case 3:

                moves.add(new Move("Tackle", PokemonType.NORMAL, 35, 35));
                moves.add(new Move("Vine Whip", PokemonType.GRASS, 45, 25));
                moves.add(new Move("Razor Leaf", PokemonType.GRASS, 55, 20));
                moves.add(new Move("Solar Beam", PokemonType.GRASS, 120, 10));
                break;

            // =========================
            // CHARMANDER LINE
            // =========================
            case 4:
            case 5:
            case 6:

                moves.add(new Move("Scratch", PokemonType.NORMAL, 35, 35));
                moves.add(new Move("Ember", PokemonType.FIRE, 40, 25));
                moves.add(new Move("Flamethrower", PokemonType.FIRE, 90, 15));
                moves.add(new Move("Fire Blast", PokemonType.FIRE, 120, 5));
                break;

            // =========================
            // SQUIRTLE LINE
            // =========================
            case 7:
            case 8:
            case 9:

                moves.add(new Move("Tackle", PokemonType.NORMAL, 35, 35));
                moves.add(new Move("Water Gun", PokemonType.WATER, 40, 25));
                moves.add(new Move("Bubble Beam", PokemonType.WATER, 65, 20));
                moves.add(new Move("Hydro Pump", PokemonType.WATER, 120, 5));
                break;

            // =========================
            // BUGS
            // =========================
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:

                moves.add(new Move("Tackle", PokemonType.NORMAL, 35, 35));
                moves.add(new Move("Bug Bite", PokemonType.BUG, 50, 20));
                moves.add(new Move("Poison Sting", PokemonType.POISON, 30, 25));
                moves.add(new Move("Signal Beam", PokemonType.BUG, 75, 15));
                break;

            // =========================
            // BIRDS
            // =========================
            case 16:
            case 17:
            case 18:
            case 21:
            case 22:
            case 83:
            case 84:
            case 85:

                moves.add(new Move("Peck", PokemonType.FLYING, 35, 35));
                moves.add(new Move("Wing Attack", PokemonType.FLYING, 60, 20));
                moves.add(new Move("Quick Attack", PokemonType.NORMAL, 40, 30));
                moves.add(new Move("Drill Peck", PokemonType.FLYING, 90, 10));
                break;

            // =========================
            // NORMAL TYPES
            // =========================
            case 19:
            case 20:
            case 39:
            case 40:
            case 52:
            case 53:
            case 108:
            case 113:
            case 115:
            case 128:
            case 132:
            case 133:
            case 137:
            case 143:

                moves.add(new Move("Tackle", PokemonType.NORMAL, 35, 35));
                moves.add(new Move("Quick Attack", PokemonType.NORMAL, 40, 30));
                moves.add(new Move("Body Slam", PokemonType.NORMAL, 85, 15));
                moves.add(new Move("Hyper Beam", PokemonType.NORMAL, 150, 5));
                break;

            // =========================
            // POISON
            // =========================
            case 23:
            case 24:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 41:
            case 42:
            case 88:
            case 89:
            case 109:
            case 110:

                moves.add(new Move("Bite", PokemonType.NORMAL, 60, 25));
                moves.add(new Move("Poison Sting", PokemonType.POISON, 30, 25));
                moves.add(new Move("Sludge", PokemonType.POISON, 65, 20));
                moves.add(new Move("Acid", PokemonType.POISON, 80, 10));
                break;

            // =========================
            // ELECTRIC
            // =========================
            case 25:
            case 26:
            case 81:
            case 82:
            case 100:
            case 101:
            case 125:
            case 135:
            case 145:

                moves.add(new Move("Thunder Shock", PokemonType.ELECTRIC, 40, 30));
                moves.add(new Move("Spark", PokemonType.ELECTRIC, 65, 20));
                moves.add(new Move("Thunderbolt", PokemonType.ELECTRIC, 90, 15));
                moves.add(new Move("Thunder", PokemonType.ELECTRIC, 120, 5));
                break;

            // =========================
            // GROUND / ROCK
            // =========================
            case 27:
            case 28:
            case 50:
            case 51:
            case 74:
            case 75:
            case 76:
            case 95:
            case 104:
            case 105:
            case 111:
            case 112:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:

                moves.add(new Move("Scratch", PokemonType.NORMAL, 35, 35));
                moves.add(new Move("Rock Throw", PokemonType.ROCK, 50, 20));
                moves.add(new Move("Earthquake", PokemonType.GROUND, 100, 10));
                moves.add(new Move("Stone Edge", PokemonType.ROCK, 110, 5));
                break;

            // =========================
            // FIRE
            // =========================
            case 37:
            case 38:
            case 58:
            case 59:
            case 77:
            case 78:
            case 126:
            case 136:
            case 146:

                moves.add(new Move("Ember", PokemonType.FIRE, 40, 25));
                moves.add(new Move("Flame Wheel", PokemonType.FIRE, 60, 20));
                moves.add(new Move("Flamethrower", PokemonType.FIRE, 90, 15));
                moves.add(new Move("Fire Blast", PokemonType.FIRE, 120, 5));
                break;

            // =========================
            // WATER
            // =========================
            case 54:
            case 55:
            case 60:
            case 61:
            case 62:
            case 72:
            case 73:
            case 79:
            case 80:
            case 86:

            case 90:

            case 98:
            case 99:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 129:
            case 130:

            case 134:

                moves.add(new Move("Water Gun", PokemonType.WATER, 40, 25));
                moves.add(new Move("Bubble Beam", PokemonType.WATER, 65, 20));
                moves.add(new Move("Surf", PokemonType.WATER, 90, 15));
                moves.add(new Move("Hydro Pump", PokemonType.WATER, 120, 5));
                break;

            // =========================
            // GRASS
            // =========================
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 69:
            case 70:
            case 71:
            case 102:
            case 103:
            case 114:

                moves.add(new Move("Absorb", PokemonType.GRASS, 30, 25));
                moves.add(new Move("Vine Whip", PokemonType.GRASS, 45, 25));
                moves.add(new Move("Razor Leaf", PokemonType.GRASS, 55, 20));
                moves.add(new Move("Solar Beam", PokemonType.GRASS, 120, 10));
                break;

            // =========================
            // FIGHTING
            // =========================
            case 56:
            case 57:
            case 66:
            case 67:
            case 68:
            case 106:
            case 107:

                moves.add(new Move("Karate Chop", PokemonType.FIGHTING, 50, 25));
                moves.add(new Move("Low Kick", PokemonType.FIGHTING, 65, 20));
                moves.add(new Move("Brick Break", PokemonType.FIGHTING, 75, 15));
                moves.add(new Move("Close Combat", PokemonType.FIGHTING, 120, 5));
                break;

            // =========================
            // PSYCHIC
            // =========================
            case 63:
            case 64:
            case 65:
            case 96:
            case 97:
            case 122:

                moves.add(new Move("Confusion", PokemonType.PSYCHIC, 50, 25));
                moves.add(new Move("Psybeam", PokemonType.PSYCHIC, 65, 20));
                moves.add(new Move("Psychic", PokemonType.PSYCHIC, 90, 15));
                moves.add(new Move("Future Sight", PokemonType.PSYCHIC, 120, 5));
                break;

            // =========================
            // ICE
            // =========================
            case 124:
            case 144:
            case 87:
            case 91:
            case 131:

                moves.add(new Move("Powder Snow", PokemonType.ICE, 40, 25));
                moves.add(new Move("Ice Beam", PokemonType.ICE, 90, 15));
                moves.add(new Move("Blizzard", PokemonType.ICE, 120, 5));
                moves.add(new Move("Aurora Beam", PokemonType.ICE, 65, 20));
                break;

            // =========================
            // GHOST
            // =========================
            case 92:
            case 93:
            case 94:

                moves.add(new Move("Lick", PokemonType.GHOST, 30, 30));
                moves.add(new Move("Shadow Punch", PokemonType.GHOST, 60, 20));
                moves.add(new Move("Shadow Ball", PokemonType.GHOST, 90, 15));
                moves.add(new Move("Night Shade", PokemonType.GHOST, 100, 10));
                break;

            // =========================
// DRAGON
// =========================
            case 147:
            case 148:
            case 149:

                moves.add(new Move("Twister", PokemonType.DRAGON, 40, 20));
                moves.add(new Move("Dragon Breath", PokemonType.DRAGON, 60, 20));
                moves.add(new Move("Dragon Claw", PokemonType.DRAGON, 90, 15));
                moves.add(new Move("Hyper Beam", PokemonType.NORMAL, 150, 5));

                break;

            case 150:

                moves.add(new Move("Confusion", PokemonType.PSYCHIC, 50, 25));
                moves.add(new Move("Psybeam", PokemonType.PSYCHIC, 65, 20));
                moves.add(new Move("Psychic", PokemonType.PSYCHIC, 90, 15));
                moves.add(new Move("Future Sight", PokemonType.PSYCHIC, 120, 5));

                break;

// =========================
// DEFAULT
// =========================
            default:

                moves.add(new Move("Tackle", PokemonType.NORMAL, 35, 35));
                moves.add(new Move("Quick Attack", PokemonType.NORMAL, 40, 30));
                moves.add(new Move("Body Slam", PokemonType.NORMAL, 85, 15));
                moves.add(new Move("Hyper Beam", PokemonType.NORMAL, 150, 5));

                break;

        }
        return moves;
    }
}
