package edu.alenasoft.gildedrose;

public class BackstagePassesItem implements Qualitable {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
            if ((item.getSellIn() < 10)) {
                item.setQuality(item.getQuality() + 1);
            }
            if ((item.getSellIn() < 5)) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }
}
