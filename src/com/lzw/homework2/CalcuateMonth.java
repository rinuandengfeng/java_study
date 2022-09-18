package com.lzw.homework2;

import java.util.Scanner;

public class CalcuateMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //获取年份
        System.out.println("请输入年份:");
        int year = scanner.nextInt();
        //获取月份
        System.out.println("请输入月份:");
        int month = scanner.nextInt();

        int numDays = 0;
        switch (month) {
            case 1:
                numDays = 31;
                break;
            case 2:
                //判断year是不是闰年
                if ((year % 4 == 0 & year % 100 != 0) | (year % 400 == 0)) {
                    numDays = 29;
                    break;
                } else {
                    numDays = 28;
                    break;
                }
            case 3:
                numDays = 31;
                break;
            case 4:
                numDays = 30;
                break;
            case 5:
                numDays = 31;
                break;
            case 6:
                numDays = 30;
                break;
            case 7:
                numDays = 31;
                break;
            case 8:
                numDays = 31;
                break;
            case 9:
                numDays = 30;
                break;
            case 10:
                numDays = 31;
                break;
            case 11:
                numDays = 30;
                break;
            case 12:
                numDays = 31;
                break;
        }
        System.out.println(year + "年" + month + "月" + numDays + "天");
    }
}
