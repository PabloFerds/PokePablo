package com.pokepablo.model;

import com.pokepablo.enums.PokemonType;

import java.util.List;

public class Pokemon {

    private int id;

    private String name;

    private PokemonType type;

    private int level;

    private int maxHp;
    private int currentHp;

    private int attack;
    private int defense;

    private List<Move> moves;

    public Pokemon(int id,
            String name,
            PokemonType type,
            int level,
            int maxHp,
            int attack,
            int defense,
            List<Move> moves) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;

        this.maxHp = maxHp;
        this.currentHp = maxHp; //pokemon nasce com a vida maxima

        this.attack = attack;
        this.defense = defense;

        this.moves = moves;
    }

    public void takeDamage(int damage) {

        currentHp -= damage;

        if (currentHp < 0) {
            currentHp = 0;
        }
    }

    public boolean isFainted() {
        return currentHp <= 0;
    }

    public Move getMove(int index) {
        return moves.get(index);//pega o movimento escolhido 
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public List<Move> getMoves() {
        return moves;
    }
}
