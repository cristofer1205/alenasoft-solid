package edu.alenasoft.gildedrose;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class QualitableItemFactory {
    static Map<String, Qualitable> qualitableItemMap;

    public QualitableItemFactory() {
        qualitableItemMap = new HashMap<>();
        qualitableItemMap.put("Aged Brie", new AgedBrieItem());
        qualitableItemMap.put("Sulfuras, Hand of Ragnaros", new SulfurasItem());
        qualitableItemMap.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesItem());
        qualitableItemMap.put("Conjured Mana Cake", new ConjuredItem());
    }

    public Qualitable createQualitableItemInstance(Item item){
        Qualitable qualitableItem = qualitableItemMap.get(item.getName());
        return Objects.nonNull(qualitableItem) ? qualitableItem : new StandardItem();
    }
}
