package com.example.test0527;

public class Person {

    private String name;
    private int age;

    public void walk() {
        System.out.println(this.name + "is walking.");
    }
    public void eat(String food){
        System.out.println(this.name+ "is eat " + food);
    }
    public String giveInfo(){
        return this.name + this.age;
    }

    Person() {
        System.out.println("생성자 발동!");
    }
    Person(String name){
        this.name = name;
    }
    Person (String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name +  "," + age);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
