package com.pokepablo.factory;

import com.pokepablo.model.Pokemon;

public class PokemonFactory {

    public static Pokemon createPokemon(int id) {

        for (PokemonData data : PokemonData.values()) {

            if (data.getId() == id) {

                return new Pokemon(
                        data.getId(),
                        data.getName(),
                        data.getType(),
                        data.getLevel(),
                        data.getMaxHp(),
                        data.getAttack(),
                        data.getDefense(),
                        MoveFactory.createMoves(data.getId())
                );
            }
        }

        return null;
    }
}