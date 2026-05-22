package com.pokepablo.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;

    private List<Pokemon> pokemons = new ArrayList<>();

    private Pokemon activePokemon;

    private int potions;

    private int pokeballs;

    public Player(String name) {

        this.name = name;

        this.potions = 5;

        this.pokeballs = 5;
    }

    public void addPokemon(Pokemon pokemon) {//adicionando pokemons a sua lista

        pokemons.add(pokemon);

        if (activePokemon == null) {
            activePokemon = pokemon;
        }
    }

    public boolean hasAvailablePokemons() {//verifica se ainda temos pokemons

        for (Pokemon pokemon : pokemons) {

            if (!pokemon.isFainted()) {
                return true;
            }
        }

        return false;
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

    public int getPotions() {
        return potions;
    }

    public int getPokeballs() {
        return pokeballs;
    }

    public void setActivePokemon(Pokemon activePokemon) {
        this.activePokemon = activePokemon;
    }
    
    
}


