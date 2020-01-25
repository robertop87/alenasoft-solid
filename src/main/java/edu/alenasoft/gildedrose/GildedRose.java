package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

  private static List<Item> items = new ArrayList<>();

  public static void main(String[] args) {

    System.out.println("OMGHAI!");

    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 3, 6));

    updateQuality();

    System.out.println(items);
  }

  private static void updateQuality() {
    for (Item item : items) {
      if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")
              && !item.getName().equals("Sulfuras, Hand of Ragnaros") && item.getQuality() > 0) {
        item.setQuality(item.getQuality() - 1);
      } else
      if (item.getQuality() < 50) {
        item.setQuality(item.getQuality() + 1);
        if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert") && item.getSellIn() < 11 && item.getQuality() < 50) {
          item.setQuality(item.getQuality() + 1);
        }
      }

      if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
        item.setSellIn(item.getSellIn() - 1);
      }

      if (item.getSellIn() < 0 && !item.getName().equals("Aged Brie")) {
        if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert") && item.getQuality() > 0
                && !item.getName().equals("Sulfuras, Hand of Ragnaros")) {
          item.setQuality(item.getQuality() - 1);
        } else {
          item.setQuality(0);
        }
      }
    }
  }
}
