package com.lzw.homework1;

import java.util.Scanner;


//按数位逆序输出
public class TwoNumberChangeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个两位数:");
        int nums = scanner.nextInt();
        //获取十位数的值
        int a = nums / 10;
        //获取各位数的值
        int b = nums % 10;
        //逆序之后的值赋值给c
        int c = (b * 10) + a;
        System.out.printf("该数的逆序数为:%d", c);


    }
}
