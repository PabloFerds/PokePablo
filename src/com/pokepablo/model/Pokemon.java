package com.pokepablo.model;

import com.pokepablo.enums.PokemonType;
import com.pokepablo.factory.EvolutionFactory;
import com.pokepablo.factory.PokemonFactory;

import java.util.List;

public class Pokemon {

    private int id;

    private String name;

    private PokemonType type;

    private int level;

    private int experience;

    private int experienceToNextLevel;

    private int maxHp;

    private int currentHp;

    private int attack;

    private int defense;

    private List<Move> moves;

    public Pokemon(
            int id,
            String name,
            PokemonType type,
            int level,
            int maxHp,
            int attack,
            int defense,
            List<Move> moves
    ) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;

        this.experience = 0;
        this.experienceToNextLevel = 100;

        this.maxHp = maxHp;
        this.currentHp = maxHp;

        this.attack = attack;
        this.defense = defense;

        this.moves = moves;
    }

    // =========================
    // DAMAGE SYSTEM
    // =========================
    public void takeDamage(int damage) {
        currentHp -= damage;

        if (currentHp < 0) {
            currentHp = 0;
        }
    }

    public void heal() {
        currentHp = maxHp;
    }

    public boolean isFainted() {
        return currentHp <= 0;
    }

    // =========================
    // MOVES
    // =========================
    public Move getMove(int index) {
        return moves.get(index);
    }

    public List<Move> getMoves() {
        return moves;
    }

    // =========================
    // XP SYSTEM
    // =========================
    public void gainExperience(int xp) {

        System.out.println(
                name + " gained " + xp + " XP!"
        );

        experience += xp;

        while (experience >= experienceToNextLevel) {
            levelUp();
        }
    }

    // =========================
    // LEVEL UP SYSTEM
    // =========================
    private void levelUp() {

        experience -= experienceToNextLevel;

        level++;

        experienceToNextLevel = (int) (experienceToNextLevel * 1.2);

        maxHp += 10;
        attack += 5;
        defense += 5;

        currentHp = maxHp;

        System.out.println("\n" + name + " leveled up!");
        System.out.println(name + " is now level " + level);
        System.out.println("Stats increased!");

        // =========================
        // EVOLUTION CHECK
        // =========================
        EvolutionFactory.Evolution evo =
                EvolutionFactory.checkEvolution(id, level);

        if (evo != null) {
            evolve(evo.nextId);
        }
    }

    // =========================
    // EVOLUTION
    // =========================
    private void evolve(int newId) {

        Pokemon evolved = PokemonFactory.createPokemon(newId);

        System.out.println("\n" + name + " is evolving!");

        this.id = evolved.getId();
        this.name = evolved.getName();
        this.type = evolved.getType();

        this.maxHp = evolved.getMaxHp();
        this.attack = evolved.getAttack();
        this.defense = evolved.getDefense();

        this.moves = evolved.getMoves();

        this.currentHp = this.maxHp;

        System.out.println("Evolved into " + name + "!");
    }

    // =========================
    // GETTERS
    // =========================
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

    public int getExperience() {
        return experience;
    }

    public int getExperienceToNextLevel() {
        return experienceToNextLevel;
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
}