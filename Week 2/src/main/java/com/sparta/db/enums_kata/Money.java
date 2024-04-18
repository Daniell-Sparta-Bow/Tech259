package com.sparta.db.enums_kata;

import java.util.Map;
import java.util.TreeMap;

import static java.util.Map.entry;

public enum Money {
    FIVE_HUNDRED(500),
    TWO_HUNDRED(200),
    ONE_HUNDRED(100),
    FIFTY(50),
    TWENTY(20),
    TEN(10),
    FIVE(5),
    TWO(2, true),
    ONE(1, true);

    public static final TreeMap<Integer, Money> moneyConvert = new TreeMap<>();

    static {
        moneyConvert.putAll(Map.ofEntries(
                entry(500, FIVE_HUNDRED),
                entry(200, TWO_HUNDRED),
                entry(100, ONE_HUNDRED),
                entry(50, FIFTY),
                entry(20, TWENTY),
                entry(10, TEN),
                entry(5, FIVE),
                entry(2, TWO),
                entry(1, ONE)
        ));
    }
    private final int value;
    private final boolean isCoin;

    Money(int value, boolean isCoin){
        this.value = value;
        this.isCoin = isCoin;
    }

    Money(int value){
        this.value = value;
        this.isCoin = false;

    }

    public int getValue() {
        return value;
    }

    public boolean isCoin() {
        return isCoin;
    }
}
