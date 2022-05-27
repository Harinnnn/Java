package com.example.test0527;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("harin", 17);

        System.out.println(p2.getName());

        p1.setName("leekukin");
        p1.setAge(18);

        p2.setAge(170);

        System.out.println(p1.getAge() + p1.getName());

        System.out.println(p1.giveInfo());

        p1.walk();
        p2.walk();

        p1.eat("tea");
        p2.eat("tea");


    }
}
