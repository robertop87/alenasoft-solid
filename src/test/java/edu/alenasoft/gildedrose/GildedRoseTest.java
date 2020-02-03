package edu.alenasoft.gildedrose;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void testNormalItemDecrementQuality() {
    int inputQuality = 20;
    int expectedQuality = inputQuality - 1;

    Item item = new Item("+5 Dexterity Vest", 10, inputQuality, "MEDIUM");

    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testNormalItemDoubleDecrementQuality() {
    int inputQuality = 20;
    int expectedQuality = inputQuality - 2;

    Item item = new Item("+5 Dexterity Vest", 0, inputQuality, "MEDIUM");

    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testNormalItemZeroQuality() {
    int inputQuality = 0;
    int expectedQuality = 0;

    Item item = new Item("+5 Dexterity Vest", 0, inputQuality, "MEDIUM");

    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testItemSufurasLegendary() {
    int inputQuality = 80;
    int expectedQuality = 80;

    Item item = new Item("Sulfuras, Hand of Ragnaros", 15, inputQuality, "SPECIAL");

    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testItemNoGreaterThan50() {
    int inputQuality = 50;
    int expectedQuality = 50;

    Item item = new Item("Aged Brie", 20, inputQuality, "HIGH");

    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testbackstageIncrementsQuality() {
    int inputQuality = 20;
    int expectedQuality = inputQuality + 1;

    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, inputQuality, "PREMIUM");

    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testbackstageDoubleIncrementQuality() {
    int inputQuality = 20;
    int expectedQuality = inputQuality + 2;

    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, inputQuality, "PREMIUM");

    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testBackstageTripleIncrementQuality() {
    int inputQuality = 20;
    int expectedQuality = inputQuality + 3;

    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, inputQuality, "PREMIUM");

    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testBackstageZeroQuality() {
    int inputQuality = 20;
    int expectedQuality = 0;

    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, inputQuality, "PREMIUM");

    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredDecrementQuality() {
    int inputQuality = 20;
    int expectedQuality = inputQuality - 2;
    int degradationVelocity = 2;

    Item item = new Item("Conjured Mana Cake", 15, inputQuality, "MEDIUM");

    item.changeDegradationVelocity(degradationVelocity);
    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredNonZeroQuality() {
    int inputQuality = 0;
    int expectedQuality = 0;
    int degradationVelocity = 2;

    Item item = new Item("Conjured Mana Cake", 15, inputQuality, "MEDIUM");

    item.changeDegradationVelocity(degradationVelocity);
    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredAlternativeNonZeroQuality() {
    int inputQuality = 1;
    int expectedQuality = 0;
    int degradationVelocity = 2;

    Item item = new Item("Conjured Mana Cake", 15, inputQuality, "MEDIUM");

    item.changeDegradationVelocity(degradationVelocity);
    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }


  @Test
  public void testConjuredQualityWhenSellInZero() {
    int inputQuality = 10;
    int expectedQuality = inputQuality - 4;
    int degradationVelocity = 2;

    Item item = new Item("Conjured Mana Cake", 0, inputQuality, "MEDIUM");

    item.changeDegradationVelocity(degradationVelocity);
    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredAlternativeQualityWhenSellInZero() {
    int inputQuality = 3;
    int expectedQuality = 0;
    int degradationVelocity = 2;
    Item item = new Item("Conjured Mana Cake", 0, inputQuality, "MEDIUM");

    item.changeDegradationVelocity(degradationVelocity);
    item.updateQuality();
    assertEquals(expectedQuality, item.getQuality());
  }
}
