package com.blogs;

public class MainClass {

    public static void main(String[] args) {
        Person person1 = new Person("public", "private", "protected", "default");
        System.out.println(person1);

        Person person2 = new Person("publics", "private", "protected", "default");
        person2 = person1;
        System.out.println(person2);
    }
}
