package com.lzw.homewiork5;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        QuadraticEquation test = new QuadraticEquation(1, 2, 1);
        double result = test.getDiscriminant();
        test.getResult();
    }
}

//定义QuadraticEquation类
class QuadraticEquation {
    //定义成员变量
    private double a;
    private double b;
    private double c;

    //定义带a,b,c参数的构造方法
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //访问方法
    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    //返回判别式值
    public double getDiscriminant() {
        double result = Math.pow(this.b, 2) - (4 * this.a * this.c);
        return result;
    }

    //求根
    public double getRoot1() {
        double result = this.getDiscriminant();
        double root1 = (-this.b + Math.sqrt(result)) / (2 * this.a);
        return root1;
    }

    public double getRoot2() {
        double result = this.getDiscriminant();
        double root2 = (-this.b - Math.sqrt(result)) / (2 * this.a);
        return root2;
    }
    //方程的结果
    public void getResult(){
        double raw = this.getDiscriminant();
        if (raw > 0) {
            System.out.println("一个根为:" + this.getRoot1());
            System.out.println("另一个根为：" + this.getRoot2());
        } else if (raw == 0) {
            System.out.println("方程的两个根相同都为:" + this.getRoot1());
        } else {
            System.out.println("方程无根");
        }
    }
}
