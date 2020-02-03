package edu.alenasoft.gildedrose;

public class Item {

    private String name;
    private int sellIn;
    private int quality;
    private String itemType;
    private int MAX_QUALITY = 50;
    private int MIN_AMOUNT = 0;
    private int DEGRADATION_VELOCITY = 1;
    private int MAXIMUM_DAYS = 11;
    private int MINIMUN_DAYS = 6;

    public Item(String name, int sellIn, int quality, String itemType) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
        this.setItemType(itemType);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getSellIn() {
        return sellIn;
    }

    private void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    private void setQuality(int quality) {
        this.quality = quality;
    }

    private void setItemType(String itemType) {
        this.itemType = itemType;
    }

    private String getItemType() {
        return itemType;
    }

    public void changeDegradationVelocity(int velocity) {
        DEGRADATION_VELOCITY = velocity;
    }

    private void addQuality() {
        int quality = getQuality() + DEGRADATION_VELOCITY;
        quality = (quality < MAX_QUALITY) ? quality : MAX_QUALITY;
        setQuality(quality);
    }

    private void reduceQuality() {
        int quality = getQuality() - DEGRADATION_VELOCITY;
        quality = (quality > MIN_AMOUNT) ? quality : MIN_AMOUNT;
        setQuality(quality);
    }

    private void reduceSellIn() {
        setSellIn(getSellIn() - DEGRADATION_VELOCITY);
    }

    public void updateQuality() {
        switch (getItemType()) {
            case "MEDIUM":
                this.updateMediumQuality();
                break;
            case "HIGH":
                this.updateHighQuality();
                break;
            case "PREMIUM":
                this.updatePremiumQuality();
                break;
            default:
                break;
        }
    }

    private void updateHighQuality() {
        addQuality();
        reduceSellIn();
        if (getSellIn() < MIN_AMOUNT) addQuality();
    }

    private void updateMediumQuality() {
        reduceQuality();
        reduceSellIn();
        if (getSellIn() < MIN_AMOUNT) reduceQuality();
    }

    private void updatePremiumQuality() {
        addQuality();
        if (getSellIn() < MAXIMUM_DAYS) addQuality();
        if (getSellIn() < MINIMUN_DAYS) addQuality();
        reduceSellIn();
        if (getSellIn() < MIN_AMOUNT) setQuality(MIN_AMOUNT);
    }

    @Override
    public String toString() {
        String item = "\nItem{name='%s', sellIn='%s', quality='%s', itemType=%s}";
        return String.format(item, name, sellIn, quality, itemType);
    }
}
