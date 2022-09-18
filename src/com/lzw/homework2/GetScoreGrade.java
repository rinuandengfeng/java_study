package com.lzw.homework2;

import java.util.Scanner;

public class GetScoreGrade {
    public static void main(String[] args) {
        //创建输入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数:");
        //获取输入的成绩
        byte score = scanner.nextByte();
        //创建grade字符串对象
        String grade = "E";
        if (score <= 100 & score >= 0) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "E";
            }
        } else {
            //超出范围打印错误信息
            grade = "成绩输入错误，超过0~100 (ㄒoㄒ)~~";
        }
        System.out.println("成绩等级为:" + grade);
    }
}
