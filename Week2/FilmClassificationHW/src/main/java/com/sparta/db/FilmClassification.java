package com.sparta.db;

public class FilmClassification {

    public static String getClassificationsByAge(int ageOfViewer) {
        String result;


        if (ageOfViewer >= 18) {
            result = "All films are available.";
        } else if (ageOfViewer >= 15) {
            result = "U, PG, 12 & 15 films are available.";
        } else if (ageOfViewer >= 12) {
            result = "U, PG & 12 films are available.";
        } else if (ageOfViewer >= 8) {
            result = "U & PG films are available, if accompanied by an adult you may watch 12A films.";
        } else if (ageOfViewer >= 4) {
            result = "U films are available.";
        } else {
            result = "No films are available.";
        }

        return result;
    }
}

