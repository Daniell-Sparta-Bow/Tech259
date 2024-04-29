package com.sparta.db.collections;

public enum WeekDays {
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");

    String name;
    WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
