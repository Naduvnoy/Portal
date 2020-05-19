package com.test;

import java.io.File;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        FileLocation.getTheFile01Date();
//        FileLocation.getTheFile02Date();
        fileComparison();


    }


    //TODO нужно разобраться с типами данных, потому как мне нужно, чтобы fileComparison сравнивал даты
    public static void fileComparison() {
        long date1 = FileLocation.getTheFile01Date();
        long date2 = FileLocation.getTheFile02Date();
        if (date1 > date2) {
            System.out.println("Изменения в файле 1 от " + date1 + " внесены РАНЬШЕ, чем данные Файл2");
        } else if (date1 < date2) {
            System.out.println("Изменения в файле 1 от " + date1 + " внесены ПОЗЖЕ, чем данные Файл2");
        } else {
            System.out.println("Изменений не было");

        }

    }


}

