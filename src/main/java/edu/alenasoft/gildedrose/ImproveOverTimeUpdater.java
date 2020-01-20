package edu.alenasoft.gildedrose;

public class ImproveOverTimeUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {
        if (item.quality < this.MAX_QUALITY) {
            item.quality++;
        }

        item.sellIn = item.sellIn >this.MIN_SELL_IN_DAYS ? item.sellIn-- : this.MIN_SELL_IN_DAYS;
    }
}
