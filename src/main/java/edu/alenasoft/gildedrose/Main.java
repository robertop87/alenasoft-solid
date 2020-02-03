package edu.alenasoft.gildedrose;

public class Main {
    public static void main(String[] args) {
        GildedRose gilderRose = new GildedRose();

        gilderRose.loadItems();
        gilderRose.updateQuality();
        gilderRose.showItems();
    }
}
