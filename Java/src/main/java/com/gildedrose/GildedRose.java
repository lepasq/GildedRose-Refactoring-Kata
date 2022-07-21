package com.gildedrose;


class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals(ItemNames.AGED_BRIE) || items[i].name.equals(ItemNames.BACKSTAGE_PASSES)) {
                if (items[i].quality < 50) {
                    items[i].quality++;
                    if (items[i].name.equals(ItemNames.BACKSTAGE_PASSES)) {
                        if (items[i].sellIn < 11) {
                            incrementIfLower50(i);
                        }

                        if (items[i].sellIn < 6) {
                            incrementIfLower50(i);
                        }
                    }
                }
            } else {
                if (items[i].quality > 0) {
                    decrementNotSulfuras(i);
                }
            }
            decrementNotSulfuras(i);

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals(ItemNames.AGED_BRIE)) {
                    if (!items[i].name.equals(ItemNames.BACKSTAGE_PASSES)) {
                        if (items[i].quality > 0) {
                            decrementNotSulfuras(i);
                        }
                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    incrementIfLower50(i);
                }
            }
        }
    }

    private void incrementIfLower50(int i) {
        if (items[i].quality < 50) {
            items[i].quality++;
        }
    }

    private void decrementNotSulfuras(int i) {
        if (!items[i].name.equals(ItemNames.SULFURAS_HAND_OF_RAGNAROS)) {
            items[i].quality--;
        }
    }
}
