package edu.alenasoft.gildedrose;

public interface ItemUpdater {
    static final int MAX_QUALITY = 50;
    static final int MIN_SELL_IN_DAYS = 0;

    public void update(Item item);
}
