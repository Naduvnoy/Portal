package com.test;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class FileLocation {
    public static long getTheFile01Date() {
        Scanner enterPath1 = new Scanner(System.in);
        System.out.println("Напечатай путь к файлу в формате %C:\\Trashcan\\test1.txt% --> ");
        String path = enterPath1.nextLine();
        if (path.isEmpty()) {
            path = "F:\\Помойка\\test1.txt";
            System.out.println("По умолчанию файл находится в F:\\Помойка\\test1.txt");
        } else {
            // F:\Помойка\tst\test1.txt
            path.equals(enterPath1.toString());
            System.out.println("Файл находится в " + path);
        }
        File file = new File(path);
        long timestampFile1 = file.lastModified();
        System.out.println(new Date(timestampFile1));
        return timestampFile1;
    }
    //Вытаскиваем файл 2
    public static long getTheFile02Date() {
        Scanner enterPath2 = new Scanner(System.in);
        System.out.println("Напечатай путь к файлу в формате %C:\\Trashcan\\test2.txt% --> ");
        String path = enterPath2.nextLine();
        if (path.isEmpty()) {
            path = "F:\\Помойка\\test2.txt";
            System.out.println("По умолчанию файл находится в F:\\Помойка\\test2.txt");
        } else {
            path.equals(enterPath2.toString());
            System.out.println("Файл находится в " + path);
        }
        File file = new File(path);
        long timestampFile2 = file.lastModified();
        System.out.println(new Date(timestampFile2));
        return timestampFile2;
    }

}
