package com.sparta.db.gilded_rose_kata;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private static int calculateBackstageIncrease(Item item){
        if (item.sellIn > 10){
            return 1;
        } else if (item.sellIn > 5) {
            return 2;
        } else if (item.sellIn>0) {
            return 3;
        } else {
            return item.quality*-1;
        }

    }

    private static boolean isBackstage(Item item){
        return containsSubstring(item.name, "backstage");
    }

    private static boolean isAgedBrie(Item item){
        return containsSubstring(item.name, "aged brie");
    }

    private static boolean containsSubstring(String string, String substring){
        return string.toLowerCase().contains(substring);
    }

    private static boolean isLegendary(Item item){
        return containsSubstring(item.name, "sulfuras");
    }

    private static boolean isConjured(Item item){
        return containsSubstring(item.name, "conjured");
    }

    private static boolean isRegularItem(Item item){
        return !(isAgedBrie(item) || isLegendary(item) || isConjured(item) || isBackstage(item));
    }



    private static boolean isSellInMoreThan0(Item item){
        return item.sellIn > 0;
    }

    private static boolean isValidQuality(Item item){
        if(isLegendary(item)){
            return true;
        }
        return item.quality <= 50 && item.quality > 0;


    }

    private static void handleQuality(Item item, int amount){


        if (!isSellInMoreThan0(item) ){
            amount *= 2;
        }
        if (isConjured(item)){
            amount *= 2;
        }

        if (isBackstage(item)){
            amount = calculateBackstageIncrease(item);
        }

        item.quality += amount;
        if (!isValidQuality(item)){
            if (item.quality <= 0) {
                item.quality = 0;
            } else {
                item.quality = 50;
            }
        }
    }

    private static void handleSellIn(Item item){
        if(isLegendary(item) || item.quality == 0) {
            return;
        }
        item.sellIn -= 1;





    }
    public void updateQuality(){
        for(Item item : items){

            if(isLegendary(item)) continue;

            int qualityIncrease = 0;

            if(isRegularItem(item)) {
                qualityIncrease = -1;
            } else if(!isRegularItem(item)){
                qualityIncrease = 1;
            }

            handleQuality(item, qualityIncrease);
            handleSellIn(item);

        }
    }

}