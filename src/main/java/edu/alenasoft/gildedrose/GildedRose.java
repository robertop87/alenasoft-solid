package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

  public static List<Item> items = new ArrayList<>();

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
    for (int i = 0; i < items.size(); i++) {
      updateItem(items.get(i)).update(items.get(i));
    }
  }

  public static ItemUpdater updateItem(Item item) {
      if (improvesOverTime(item)) return new ImproveOverTimeUpdater();
      if (isLegendary(item)) return new LegendaryUpdater();
      if (isBackstagePasses(item)) return new BackstagePassesUpdater();

      return new CommonUpdater();
  }

  private static boolean isBackstagePasses(Item item) {
    return item.getName().contains("Backstage");
  }

  private static boolean improvesOverTime(Item item) {
    return item.getName().contains("Aged Brie");
  }

  private static boolean isLegendary(Item item) {
    return item.getName().contains("Sulfuras");
  }
}
