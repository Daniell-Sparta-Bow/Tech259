package com.sparta.db.collections;

import com.sparta.db.logging.LoggerUtil;

import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;
import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        try {
            LoggerUtil.setUp(LOGGER);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        EnumMap<WeekDays, String> enumMap = new EnumMap<>(WeekDays.class);
        populateEnumMap(enumMap);

        // Whats happening on Monday?
        LOGGER.info(enumMap.get(WeekDays.MONDAY));

        printEnumMap(enumMap);


    }

    private static void printEnumMap(EnumMap<WeekDays, String> enumMap) {
        for(Map.Entry<WeekDays, String> entry: enumMap.entrySet()){
            WeekDays day = entry.getKey();
            String activity = entry.getValue();

            LOGGER.info("On " + day.getName() + ", the activity for the day will be " + activity + "!");
        }
    }

    private static void populateEnumMap(EnumMap<WeekDays, String> enumMap) {
        enumMap.put(WeekDays.MONDAY, "Football");
        enumMap.put(WeekDays.TUESDAY, "Hockey");
        enumMap.put(WeekDays.WEDNESDAY, "Badminton");
        enumMap.put(WeekDays.THURSDAY, "Basketball");
        enumMap.put(WeekDays.FRIDAY, "Rugby");
        enumMap.put(WeekDays.SATURDAY, "Swimming");
        enumMap.put(WeekDays.SUNDAY, "Squash");
    }


}
