package com.lzw.homwork6.topic2;

import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入正方形的边长:");
        double side = sc.nextDouble();
        Square sq = new Square(side);
        //计算并输出正方形的周长
        System.out.printf("正方形的周长为:%.2f\n",sq.getPerimeter());
        //计算并输出正方形的面积
        System.out.printf("正方形的面积为:%.2f\n",sq.getArea());

    }
}
