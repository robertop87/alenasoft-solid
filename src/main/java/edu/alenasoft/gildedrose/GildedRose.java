package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

  public static List<Item> items = new ArrayList<>();

  private static final String AGED = "Aged Brie";
  private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
  private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

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

  public static void updateQuality() {
    for (Item item : items) {
      if ((!AGED.equals(item.getName())) && !BACKSTAGE.equals(item.getName()) && item.getQuality() > 0 && !SULFURAS.equals(item.getName())) {
        item.setQuality(item.getQuality() - 1);
      } else
      if (item.getQuality() < 50) {
        item.setQuality(item.getQuality() + 1);

        if (BACKSTAGE.equals(item.getName()) && item.getSellIn() < 11) {
          item.setQuality(item.getQuality() + 1);
          if (item.getSellIn() < 6) {
            item.setQuality(item.getQuality() + 1);
          }
        }
      }

      if (!SULFURAS.equals(item.getName())) {
        item.setSellIn(item.getSellIn() - 1);
      }

      if (item.getSellIn() < 0) {
        if (!BACKSTAGE.equals(item.getName()) && item.getQuality() > 0 && !SULFURAS.equals(item.getName()) && !AGED.equals(item.getName())) {
          item.setQuality(item.getQuality() - 1);
        } else {
          item.setQuality(0);
        }
      }
    }
  }
}