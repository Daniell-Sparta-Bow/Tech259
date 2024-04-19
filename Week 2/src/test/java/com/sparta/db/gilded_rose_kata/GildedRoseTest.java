package com.sparta.db.gilded_rose_kata;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GildedRoseTest {


    @Test
    @DisplayName("Given an Item has quality of 0, updateQuality does not reduce quality")
    void givenAnItemHasQualityOf0UpdateQualityDoesNotReduceQuality() {
        // Arrange
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(0, result);

    }

    @Test
    @DisplayName("Given an Item has a quality of 1, after updateQuality it is 0")
    void givenAnItemHasAQualityOf1AfterUpdateQualityItIs0() {
        // Arrange
        Item[] items = new Item[]{new Item("foo", 0, 1)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(0, result);

    }

    @Test
    @DisplayName("Given an Items sell in is 0 and quality is 2, after updateQuality, quality is 0")
    void givenAnItemsSellInIs0AndQualityIs2AfterUpdateQualityQualityIs0() {
        // Arrange
        Item[] items = new Item[]{new Item("foo", 0, 2)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Given an Items sell in is not 0 and quality is 2, after updateQuality, quality is 1")
    void givenAnItemsSellInIsNot0AndQualityIs2AfterUpdateQualityQualityIs1() {
        // Arrange
        Item [] items = new Item[] { new Item("foo", 5, 2)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(1, result);
        
    }

    @Test
    @DisplayName("Given an Items sell in is 5, after updateQuality, sellIn is 4")
    void givenAnItemsSellInIs5AfterUpdateQualitySellInIs4() {
        // Arrange
        Item [] items = new Item[] { new Item("foo", 5, 5)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].sellIn;
        // Assert
        Assertions.assertEquals(4, result);

    }

    @Test
    @DisplayName("Given an Items name is 'Aged Brie', after updateQuality, quality increases by 1")
    void givenAnItemsNameIsAgedBrieAfterUpdateQualityQualityIncreasesBy1() {
        // Arrange
        Item [] items = new Item[] { new Item("Aged Brie", 5, 3)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(4, result);

    }

    @Test
    @DisplayName("Given an Items name is 'Aged Brie' and quality is 50, after updateQuality, quality doesnt increase")
    void givenAnItemsNameIsAgedBrieAndQualityIs50AfterUpdateQualityQualityDoesntIncrease() {
        // Arrange
        Item [] items = new Item[] { new Item("Aged Brie", 5, 50)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;

        // Assert
        Assertions.assertEquals(50, result);

    }

    @Test
    @DisplayName("Given an Items name is 'Sulfuras, Hand of Ragnaros', after updateQuality, sellIn stays the same")
    void givenAnItemsNameIsSulfurasAfterUpdateQualitySellInStaysTheSame() {
        // Arrange
        Item [] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].sellIn;
        // Assert
        Assertions.assertEquals(5, result);

    }

    @Test
    @DisplayName("Given an Items name is 'Sulfuras, Hand of Ragnaros', after updateQuality, quality stays the same")
    void givenAnItemsNameIsSulfurasAfterUpdateQualityQualityStaysTheSame() {
        // Arrange
        Item [] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(80, result);

    }

    @ParameterizedTest
    @ValueSource(ints = {11, 50, 100})
    @DisplayName("Given an Item is a backstage pass and sellIn is greater than 10, after updateQuality, quality increases by 1")
    void givenAnItemIsABackstagePassAndSellInIsGreaterThan10AfterUpdateQualityQualityIncreasesBy1(int sellIn) {
        // Arrange
        Item [] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, 40)};
        GildedRose app = new GildedRose(items);
        int expected = app.items[0].quality + 1;
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(expected, result);

    }

    @ParameterizedTest
    @ValueSource(ints = {10, 8, 6})
    @DisplayName("Given an Item is a backstage pass and sell in is less than 10 inclusive but greater than 5, after updateQuality, quality increases by 2")
    void givenAnItemIsABackstagePassAndSellInIsLessThan10InclusiveButGreaterThan5AfterUpdateQualityQualityIncreasesBy2(int sellIn) {
        // Arrange
        Item [] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, 40)};
        GildedRose app = new GildedRose(items);
        int expected = app.items[0].quality + 2;
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(expected, result);

    }

    @ParameterizedTest
    @ValueSource(ints = {5, 3, 1})
    @DisplayName("Given an Item is a backstage pass and sell in is less than 5 inclusive and greater than 0, after updateQuality, quality increases by 3")
    void givenAnItemIsABackstagePassAndSellInIsLessThan5InclusiveAndGreaterThan0AfterUpdateQualityQualityIncreasesBy3(int sellIn) {
        // Arrange
        Item [] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, 40)};
        GildedRose app = new GildedRose(items);
        int expected = app.items[0].quality + 3;
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @DisplayName("Given an Item is a backstage pass and sell in 0, after updateQuality, quality is 0")
    void givenAnItemIsABackstagePassAndSellIn0AfterUpdateQualityQualityIs0() {
        // Arrange
        Item [] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(0, result);

    }

    @Test
    @DisplayName("Given an Item is 'Conjured', after updateQuality, quality decreases by 2")
    void givenAnItemIsConjuredAfterUpdateQualityQualityDecreasesBy2() {
        // Arrange
        Item [] items = new Item[] { new Item("Conjured apple", 5, 40)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(38, result);

    }

    @Test
    @DisplayName("Given an Item is 'Conjured' and sellIn is 0, after updateQuality, quality decreases by 4")
    void givenAnItemIsConjuredAndSellInIs0AfterUpdateQualityQualityDecreasesBy4() {
        // Arrange
        Item [] items = new Item[] { new Item("Conjured apple", 0, 38)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(34, result);

    }

    @Test
    @DisplayName("Given an Item is 'Conjured' and quality is 0, after updateQuality, quality stays 0 ")
    void givenAnItemIsConjuredAndQualityIs0AfterUpdateQualityQualityStays0() {
        // Arrange
        Item [] items = new Item[] { new Item("Conjured apple", 0, 0)};
        GildedRose app = new GildedRose(items);
        // Act
        app.updateQuality();
        int result = app.items[0].quality;
        // Assert
        Assertions.assertEquals(0, result);

    }


}
