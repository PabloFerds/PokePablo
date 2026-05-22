package com.pokepablo.item;

import com.pokepablo.model.Player;
import com.pokepablo.model.Pokemon;

public abstract class Item {

    protected String name;
    protected int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isEmpty() {
        return quantity <= 0;
    }

    public void decrease() {
        if (quantity > 0) {
            quantity--;
        }
    }

    // ⭐ NOVO: comportamento do item
    public abstract boolean use(Player player, Pokemon target);
}