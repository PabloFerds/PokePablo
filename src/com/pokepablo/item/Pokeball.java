package com.pokepablo.item;

import com.pokepablo.model.Player;
import com.pokepablo.model.Pokemon;

public class Pokeball extends Item {

    public Pokeball(int quantity) {
        super("Pokeball", quantity);
    }

    @Override
    public boolean use(Player player, Pokemon target) {

        if (isEmpty()) {
            System.out.println("No Pokeballs left!");
            return false;
        }

        // chance baseada no HP atual
        double hpPercent =
                (double) target.getCurrentHp() / target.getMaxHp();

        double chance = (1 - hpPercent) * 100;

        if (chance < 5) chance = 5;
        if (chance > 90) chance = 90;

        double roll = Math.random() * 100;

        boolean caught = roll < chance;

        decrease();

        System.out.println("Pokeballs left: " + quantity);

        if (caught) {

            System.out.println(target.getName() + " was caught!");

            player.addPokemon(target);
        } else {

            System.out.println(target.getName() + " escaped!");
        }

        return caught;
    }
}