package edu.alenasoft.gildedrose;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void testNormalItemDecrementQuality() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("+5 Dexterity Vest", 10, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = inputQuality - 1;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testNormalItemDoubleDecrementQuality() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("+5 Dexterity Vest", 0, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = inputQuality - 2;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testNormalItemZeroQuality() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 0;
    Item item = new Item("+5 Dexterity Vest", 0, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = 0;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testItemSufurasLegendary() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 80;
    Item item = new Item("Sulfuras, Hand of Ragnaros", 15, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = 80;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testItemNoGreaterThan50() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 50;
    Item item = new Item("Aged Brie", 20, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = 50;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testbackstageIncrementsQuality() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = inputQuality + 1;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testbackstageDoubleIncrementQuality() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = inputQuality + 2;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testBackstageTripleIncrementQuality() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = inputQuality + 3;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testBackstageZeroQuality() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = 0;

    assertEquals(expectedQuality, item.getQuality());
  }

  /* Tests for the new requirement
  @Test
  public void testConjuredDecrementQuality() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("Conjured Mana Cake", 15, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = inputQuality - 2;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredNonZeroQuality() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 0;
    Item item = new Item("Conjured Mana Cake", 15, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = 0;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredAlternativeNonZeroQuality() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 1;
    Item item = new Item("Conjured Mana Cake", 15, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = 0;

    assertEquals(expectedQuality, item.getQuality());
  }


  @Test
  public void testConjuredQualityWhenSellInZero() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 10;
    Item item = new Item("Conjured Mana Cake", 0, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = inputQuality - 4;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredAlternativeQualityWhenSellInZero() {
    GildedRose.items = new ArrayList<>();
    int inputQuality = 3;
    Item item = new Item("Conjured Mana Cake", 0, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = 0;

    assertEquals(expectedQuality, item.getQuality());
  }
  */
}
