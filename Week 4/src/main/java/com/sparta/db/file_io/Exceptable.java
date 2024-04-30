package com.sparta.db.file_io;

import java.util.ArrayList;

public class Exceptable {

    public static <T> void printItemAt(int index, ArrayList<T> arrayList){
        if(index < 0){
            throw new IllegalArgumentException("Index can not be negative: index=" + index);
        }
        else if(index >= arrayList.size()){
            throw new ArrayIndexOutOfBoundsException("Index can not be greater than " +arrayList.size() + " for the provided arrayList parameter: index=" + index);
        } else{
            System.out.println(arrayList.get(index));
        }
    }
}
