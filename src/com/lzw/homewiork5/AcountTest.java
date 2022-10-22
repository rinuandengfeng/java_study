package com.lzw.homewiork5;

import java.time.LocalDate;

public class AcountTest {
    public static void main(String[] args) {
        //创建对象
        Account lzw = new Account();
        lzw.setId(1);
        lzw.setBalance(10000);
        lzw.setAnnualInterestRate(8.2);
        System.out.println("用户ID为:" + lzw.getId() + " 余额为:" + lzw.getBalance());
        System.out.println("创建日期为:" + lzw.getDateCreated());
        ;
        System.out.println("月利率为:" + lzw.getMonthlyInterestRate());
        lzw.withDraw(10001);
        lzw.withDraw(5000);
        lzw.deposit(8000);
    }
}

//Account类
class Account {
    //定义成员变量
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated = LocalDate.now();

    //默认构造方法
    public Account() {
    }

    //带参数构造方法
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    //访问方法
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return this.dateCreated;
    }

    //修改方法
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率的方法
    public double getMonthlyInterestRate() {
        double monthlyInteresRate = this.annualInterestRate / 12;
        return monthlyInteresRate;
    }

    //取款
    public void withDraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("取款成功，余额为:" + this.balance);
        } else {
            System.out.println("取款失败，余额不足。");
        }

    }

    //存款
    public void deposit(double amount) {
        this.balance += balance;
        System.out.println("存款成功，余额为:" + this.balance);
    }

}
