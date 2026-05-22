package com.pokepablo.model;

import com.pokepablo.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Item> items = new ArrayList<>();

    // =========================
    // ADD ITEM
    // =========================
    public void addItem(Item item) {
        items.add(item);
    }

    // =========================
    // SHOW ITEMS
    // =========================
    public void showItems() {

        System.out.println("\n=== INVENTORY ===");

        for (int i = 0; i < items.size(); i++) {

            Item item = items.get(i);

            System.out.println(
                    i + " - "
                    + item.getName()
                    + " x" + item.getQuantity()
            );
        }
    }

    // =========================
    // GET ITEM
    // =========================
    public Item getItem(int index) {
        return items.get(index);
    }

    // =========================
    // USE ITEM (NOVO)
    // =========================
    public boolean useItem(int index) {

        if (index < 0 || index >= items.size()) {
            System.out.println("Invalid item!");
            return false;
        }

        Item item = items.get(index);

        if (item.isEmpty()) {
            System.out.println(item.getName() + " is out of stock!");
            return false;
        }

        item.decrease();

        if (item.isEmpty()) {
            items.remove(index);
        }

        return true;
    }
}
