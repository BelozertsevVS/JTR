package com.ua.jtr.topic1;


public class Main {

    // DataTypes, Variables, Operators, Literals, Key Words


    public static void main(String[] args) {
        System.out.println("Hello");

        int year = 2024;
        int afterTenYears = 10;

        int future = year + afterTenYears;

        System.out.println(future);

        int a = 99;
        int b = -66;
        double d = 9.99;

        System.out.println(a - b);

        int c = (int) (a + d);


        System.out.println(c);
        System.out.println(a * b);
        System.out.println((double) a / b);

        System.out.println(1 % 10);

        int number = 25987;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sum);


        int totalSeconds = 3665;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds%n", totalSeconds, hours, minutes, seconds);
        System.out.println();


        int q = 10;


        q /= 2;


        System.out.println(q);



    }
}
