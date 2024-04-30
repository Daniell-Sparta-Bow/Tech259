package com.sparta.db.file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/employees.csv"));) {

            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("In finally block");
        }
    }
}
