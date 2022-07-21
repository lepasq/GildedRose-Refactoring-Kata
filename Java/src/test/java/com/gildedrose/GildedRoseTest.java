package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void unnamedItemsTest() {
        Item[] items = new Item[] {
            new Item(ItemNames.ELIXIR_OF_THE_MONGOOSE, 0, 1),
            new Item(ItemNames.CONJURED_MANA_CAKE, 0, 1),
            new Item(ItemNames.DEXTERITY_VEST, 0, 1)};

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        for (int i = 0; i < items.length; i++) {
            assertEquals(app.items[i].quality, -1);
            assertEquals(app.items[i].sellIn, 0);
        }
    }

}
