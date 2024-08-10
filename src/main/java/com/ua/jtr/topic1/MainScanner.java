package com.ua.jtr.topic1;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {

        Scanner scanner = getScanner();
        System.out.println("Введіть ваше ім'я");
        String name = scanner.nextLine();
        System.out.println("Доброго дня, " + name + "!");


    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
