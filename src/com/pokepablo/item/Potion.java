package com.pokepablo.item;

import com.pokepablo.model.Player;
import com.pokepablo.model.Pokemon;

public class Potion extends Item {

    private int healAmount;

    public Potion(int quantity, int healAmount) {
        super("Potion", quantity);
        this.healAmount = healAmount;
    }

    @Override
    public boolean use(Player player, Pokemon target) {

        if (isEmpty()) {
            System.out.println("No Potions left!");
            return false;
        }

        if (target.isFainted()) {
            System.out.println("Cannot heal a fainted Pokémon!");
            return false;
        }

        // cura parcial (melhor que heal full)
        int newHp = target.getCurrentHp() + healAmount;

        if (newHp > target.getMaxHp()) {
            newHp = target.getMaxHp();
        }

        // aplica vida manualmente (melhor depois criar setHp ou heal(amount))
        target.takeDamage(target.getCurrentHp() - newHp);

        decrease();

        System.out.println(target.getName() + " was healed!");
        System.out.println("Potions left: " + quantity);

        return true;
    }
}