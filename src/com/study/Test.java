package com.study;

public class Test {
    public static void main(String[] args) {

        Employee xl = new Employee("xl",21,2000);
        xl.sayHello();
        System.out.println(xl.getSalary());
        System.out.println(xl.computerSalary(10, 2.2));
    }
}
