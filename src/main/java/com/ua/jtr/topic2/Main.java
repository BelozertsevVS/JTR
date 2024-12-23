package com.ua.jtr.topic2;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    /**
     * Topic 2 "String Operations"
     */

    public static void main(String[] args) {
        String str = "Hello World";
        var str1 = "Hello Word";
        int a = 7;

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str);

        System.out.println(str.charAt(6));

        int length = str.length();
        int lastIndex = length - 1;

        System.out.println(str.charAt(lastIndex));

        System.out.println(str.concat("!"));

        String s3 = "first " + (4 + 5) / 3;
        System.out.println(s3);

        System.out.println(str.substring(str.indexOf(" ")));
        System.out.println(str.substring(1, 6));


        System.out.println(str.indexOf("l"));
        System.out.println(str.isBlank());

        System.out.println(Arrays.toString(str.split(" ")));

        String ss1 = "Q";
        String ss2 = "Q";
        String ss3 = "Q";
        System.out.println(ss1.equals(ss2));

        String s4 = "    end   ing ";
        System.out.println();
        System.out.println(s4);
        System.out.println(s4.trim());

        System.out.println(s4.toUpperCase(Locale.ROOT));

        String char1 = "Hello World";
        String charMod = char1.replace("World", "Java");
        System.out.println(charMod);

        String name = "Jone";
        int age = 35;

        String formattedString = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formattedString);




    }
}
