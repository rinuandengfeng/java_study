package com.study;

public class People {
    protected String name;
    protected int age;

    public People(){

    };

    public People(String name,int age){
        this.name = name;
        this.age = age;
    }


    public void sayHello(){
        System.out.println("姓名为："+this.name+"年龄为:"+this.age);
    }
}
