package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите адрес файла 1");
        String input1 = scanner.nextLine();

        File doc = new File(input1);
        Scanner obj = new Scanner(doc);


        //arr.add(parseInt(obj.nextLine()));
        String input2 = obj.nextLine();
        String[] words = input2.split(" ");
        Float f1 = Float.valueOf(words[0]);
        Float f2 = Float.valueOf(words[1]);
        int radius = parseInt(obj.nextLine());


        System.out.println("Введите адрес файла 2");
        input1 = scanner.nextLine();

        doc = new File(input1);
        obj = new Scanner(doc);

        while (obj.hasNextLine()) {
            //arr.add(parseInt(obj.nextLine()));
            input2 = obj.nextLine();
            words = input2.split(" ");
            Float f3 = Float.valueOf(words[0]);
            Float f4 = Float.valueOf(words[1]);

            float dist;
            dist = (float) Math.sqrt(Math.pow((f3 - f1), 2) + Math.pow((f4 - f2), 2));

            if (dist > radius) {
                System.out.println("точка снаружи");
            }
            ;
            if (dist < radius) {
                System.out.println("точка внутри");
            }
            ;
            if (dist == radius) {
                System.out.println("точка лежит на окружности");
            }
            ;
        }
    }
}
