package edu.alenasoft.gildedrose;

public class CommonUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {
        if (item.sellIn > this.MIN_SELL_IN_DAYS) {
            item.quality--;
        } else {
            item.quality = item.quality > 0 ? item.quality - 2 : 0;
        }

        item.sellIn = item.sellIn > this.MIN_SELL_IN_DAYS ? item.sellIn-- : this.MIN_SELL_IN_DAYS;
    }
}
