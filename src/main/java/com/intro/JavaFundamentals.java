package com.intro;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaFundamentals {
    /*
    -variables & data types
    -Arrays
    -loops & conditions
    -Strings and its functions
    -Importance of array lists
    -Array lists operations and conversion to array list
    -Declaring methods
    -Accessing methods in class & static keyword
     */

    public static void main(String[] args) {

        //variables % data type
        System.out.println("==========VARIABLES & DATA TYPES===========");

        int myNum = 5;
        String website = "Udemy Academy";
        char letter = 'R';
        float dec = 6.5f;
        double dec2 = 6.5;
        boolean alive = true;
        System.out.println(myNum + " is the value stored in myNum variable.");
        System.out.println(website);



        //Arrays
        System.out.println("=====ARRAYS=====");

        int[] arr = new int[5];//declare an array that can store 5 integer values
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //another way to declare an array
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(arr2[1]);
        System.out.println(arr2[4]);

        //for loop
        System.out.println("=====FOR LOOPs=====");

        for(int i = 0; i < arr.length; i++)
            /*
            int i = 0 ---> we declare an i variable to loop through the array
            i<arr.length ---> we put a condition to check if the value of i is equal to 5(array´s length)
            i++ ---> when the condition is fulfilled, we execute the code block below and increment i by 1
             */
        {
            System.out.println(arr[i]);
        }


        System.out.println("===Second Loop====");
        for (int hola : arr2) {
            System.out.println(hola);
        }


        System.out.println("===Third Loop===");
        String[] name = {"Rolando", "Ramirez", "Guerra"};
        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }


        System.out.println(name[0].length());//length of the first element of the array(which is a String)

        //enhanced for loop
        System.out.println("====Enhanced for loop=====");
        for (String s : name) {
            /*
            this will iterate the array on the right (name)
            and each element of the array will be stored in the "s" variable
            */
            System.out.println(s);
        }
        System.out.println("========IF CONDITION==============");

        //print only even numbers
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,};

        //for loop
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 0) {
                System.out.println(arr3[i]);
            }
            else {
                System.out.println(arr3[i] + " is not even number");
            }
        }


        System.out.println("======BREAK==========");

        //enhanced for loop
        for (int j : arr3) {
            if (j % 2 == 0) {//to compare numbers
                System.out.print(j + " ");
                break;//mission accomplished, even number is printed no need to continue the loop
            }
        }
        System.out.println(" ");

        //Array Lists
        System.out.println("=======ARRAY LISTS========");

        ArrayList<String> al = new ArrayList<String>();
        //import the class and create an arraylist object
        al.add("Rolando");//used to add a new value into de array list
        al.add("Ramirez");
        al.add("Guerra");//index 2
        al.add("Udemy");
        al.add("Academy");
        System.out.println(al.get(4));//used to get the value at index 4 from the array list
        al.remove(2);//used to remove the value at index 2 from the array list

        System.out.println("========FOR LOOP ARRAY LIST========");
        for (int i = 0; i < al.size(); i++) //equivalent to use length() in arrays
        {
            System.out.println(al.get(i));
        }

        System.out.println("====ENHANCED FOR LOOP====");

        for (String s : al) {
            System.out.println(s);
        }


        System.out.println("======CONTAINS==========");
        //how to know an item is present in an array list -> [contains method]
        //an array does not have a method to know if an item is present or not
        System.out.println(al.contains("Rolando"));

        //item present in an array
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals("Rolando")) {
                System.out.println(true);

            }
        }
        System.out.println("=========CONVERSION TO ARRAY LIST=========");
        List<String> nameList = Arrays.asList(name);//converting the array(name) to a list(nameList)
        System.out.println(nameList.contains("Ramirez"));



    }
}