package com.intro;

import java.util.Arrays;

public class JavaFundamentals2 {
    public static void main(String[] args) {
        System.out.println("=======STRINGS=======");

        //String is an object
        String s = "Rolando Ramirez Guerra";
        String s1 = "Rolando Ramirez Guerra";
        //only one object is created in memory
        //the rest will just point to the same object

        String s2 = new String("Welcome to Java");
        String s3 = new String("Welcome to Java");
        //using new keyword to create a new object so two different objects are created with the same value
        //new memory location is created

        System.out.println("=======SPLITTING=======");
        String s4 = "My name is Rolando";
        String[] splittedS4 = s4.split(" ");//we separate the string by spaces and that creates an array of strings
        System.out.println(splittedS4[0]);
        System.out.println(splittedS4[1]);
        System.out.println(splittedS4[2]);
        System.out.println(splittedS4[3]);
        System.out.println(Arrays.toString(splittedS4));


        System.out.println("=======TRIM=======");//eliminates white spaces
        String s5 = "I love Andrea";
        System.out.println(s5.trim());
        String[] splittedS5 = s5.split("love");
        System.out.println(splittedS5[0]);
        System.out.println(splittedS5[1].trim());
        System.out.println(splittedS5[1]);


        System.out.println("=======CHAR AT LOOP=======");
        for (int i = 0; i < s4.length(); i++)//we iterate through the string
        {
            System.out.print(s4.charAt(i));//returns the character at index i of the string we are looping through
        }
        System.out.println(" ");


        System.out.println("========REVERSED CHAR AT LOOP========");
        for (int i = s4.length()-1; i >=0; i--)//we iterate through the string
        {
            System.out.print(s4.charAt(i));//returns the character at index i of the string we are looping through
        }

    }
}
