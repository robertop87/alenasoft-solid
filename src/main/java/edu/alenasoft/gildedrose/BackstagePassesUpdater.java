package edu.alenasoft.gildedrose;

public class BackstagePassesUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {
        if (item.sellIn <= this.MIN_SELL_IN_DAYS) {
            item.quality = 0;
            return;
        }

        if (item.quality < this.MAX_QUALITY) {
            item.quality += this.increaseQualityAccordingSellIn(item.sellIn);
        }

        item.sellIn = item.sellIn >this.MIN_SELL_IN_DAYS ? item.sellIn-- : this.MIN_SELL_IN_DAYS;
    }

    private int increaseQualityAccordingSellIn(int sellInDays) {
        if (sellInDays <= 5) return 3;
        if (sellInDays <= 10) return 2;

        return 1;
    }
}
