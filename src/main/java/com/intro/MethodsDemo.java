package com.intro;

public class MethodsDemo {

    public static void main(String[] args) {

        MethodsDemo d = new MethodsDemo();
        String name = getData();
        System.out.println(name);

        MethodsDemo2 d1 = new MethodsDemo2();
        String name1 = d1.getUserData();
        System.out.println(name1);

    }

    public static String getData()//by marking the method as static it now belongs to the class so no object is needed
    {
        System.out.println("Data");
        return "Return";
    }
}
