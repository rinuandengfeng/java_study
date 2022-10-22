package com.study;

public class Employee extends People{

    private double salary;

    //构造方法
    public  Employee(){}
    public Employee(String name,int age,double salary){
        //调用父类的带参构造
        super(name,age);
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }


    public double computerSalary(int hour,double rate){
        double sal = hour*rate;

        return sal;
    }


}
