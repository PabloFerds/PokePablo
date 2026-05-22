package com.pokepablo.model;

import com.pokepablo.enums.PokemonType;
import com.pokepablo.battle.TypeChart;

public class Move {

    private String name;
    private PokemonType type;
    private int power;

    int maxPP;
    int currentPP;

    public Move(String name, PokemonType type, int power, int maxPP) {

        this.name = name;
        this.type = type;
        this.power = power;

        this.maxPP = maxPP;

        this.currentPP = maxPP;
    }

    //verificando se podemos usar o move
    public boolean canUse() {
        return currentPP > 0;
    }

    //gastando o PP
    public void use() {
        if (!canUse()) {
            throw new IllegalStateException("No PP left for " + name);
        }
        currentPP--;
    }

    //toda logica para executar o movimento
    public int execute(Pokemon attacker, Pokemon defender) {
        if (!canUse()) {
            return 0;// para a aplicacao
        }
        use();
        double multiplier = TypeChart.getMultiplier(
                this.type,
                defender.getType()
        );

        int damage = (int) ((this.power + attacker.getAttack()) * multiplier) - defender.getDefense();
        if (damage < 1) {
            damage = 1;
        }
        defender.takeDamage(damage);
        return damage;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getCurrentPP() {
        return currentPP;
    }

    public int getMaxPP() {
        return maxPP;
    }
}
