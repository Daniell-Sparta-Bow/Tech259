package com.sparta.db.jdbc;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;


public class SQLTypeConverter {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static LocalDate getStringToDate(String dateString){

        return LocalDate.parse(dateString, formatter);

    }

    public static String getDateToString(LocalDate localDate){
        return localDate.format(formatter);
    }
}
