package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void conjuredManaCakeTest() {
        Item[] items = new Item[] { new Item(ItemNames.CONJURED_MANA_CAKE, 0, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0].quality, -1);
        assertEquals(app.items[0].sellIn, 0);
    }
}
