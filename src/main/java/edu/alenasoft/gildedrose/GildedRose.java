package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

class GildedRose {

    private List<Item> items = new ArrayList<>();

    void loadItems() {
        for (Data data : Data.values()) {
            items.add(new Item(data.getName(), data.getSellIn(), data.getQuality(), data.getItemType()));
        }
    }

    void showItems() {
        System.out.println(items);
    }

    void updateQuality() {
        for (Item item: items) {
            item.updateQuality();
        }
    }
}
