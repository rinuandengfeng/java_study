package com.lzw.homewiork5;

public class PersonTest {
    public static void main(String[] args) {
        Person xm = new Person();
        xm.setAge(19);
        xm.setName("lzw");
        xm.speak();
    }
}

class Person{
    //创建成员变量
    private String name;
    private int age;

    //创建够构造方法
    public Person() {

    }

    //方法的重载
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //定义访问方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //定义修改方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //定义speak方法
    public void speak() {
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
    }
    public static  void main(){

    }
}
