package com.blogs;

public class MainClass {

    public static void main(String[] args) {
        PublicClass person1 = new PublicClass("public", "private", "protected", "default");
        System.out.println(person1);

        PublicClass person2 = new PublicClass("publics", "private", "protected", "default");
        person2 = person1;
        System.out.println(person2);

        // you can call static methods with instance of Person class
        String s = person2.staticMethod();
        System.out.println(s);
    }
}
