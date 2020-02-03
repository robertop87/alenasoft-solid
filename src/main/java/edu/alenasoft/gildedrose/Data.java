package edu.alenasoft.gildedrose;

public enum Data {
    DEXTERITY_VEST("+5 Dexterity Vest", 10, 20, "MEDIUM"),
    AGED_BRIE("Aged Brie", 2, 0, "HIGH"),
    SULFURAS_HAND_RAGNAROS("Sulfuras, Hand of Ragnaros", 0, 80, "SPECIAL"),
    BACKSTAGE_PASSES("Backstage passes to a TAFKAL80ETC concert", 15, 20, "PREMIUM"),
    CONJURED_MANA_CAKE("Conjured Mana Cake", 3, 6, "MEDIUM"),
    ELIXIR_MONGOOSE("Elixir of the Mongoose", 5, 7, "MEDIUM");

    private String name;
    private int sellIn;
    private int quality;
    private String itemType;

    private Data(String name, int sellIn, int quality, String itemType) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public String getItemType() { return itemType; }
}
