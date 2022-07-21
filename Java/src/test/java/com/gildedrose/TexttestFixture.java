package com.gildedrose;

public class TexttestFixture {

    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item(ItemNames.DEXTERITY_VEST, 10, 20), //
                new Item(ItemNames.AGED_BRIE, 2, 0), //
                new Item(ItemNames.ELIXIR_OF_THE_MONGOOSE, 5, 7), //
                new Item(ItemNames.SULFURAS_HAND_OF_RAGNAROS, 0, 80), //
                new Item(ItemNames.SULFURAS_HAND_OF_RAGNAROS, -1, 80),
                new Item(ItemNames.BACKSTAGE_PASSES, 15, 20),
                new Item(ItemNames.BACKSTAGE_PASSES, 10, 49),
                new Item(ItemNames.BACKSTAGE_PASSES, 5, 49),

                // XXX:GRS123 Make broken item work
                new Item(ItemNames.CONJURED_MANA_CAKE, 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
