package edu.alenasoft.gildedrose;

public class AgedBrieItem implements Qualitable {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            if (item.getSellIn() < 0) {
                item.setQuality(item.getQuality() + 2);
            } else {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }
}
