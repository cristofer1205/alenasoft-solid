package edu.alenasoft.gildedrose;

public class StandardItem implements Qualitable {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
            if (item.getSellIn() < 0) {
                item.setQuality(item.getQuality() - 1);
            }
        }
    }
}
