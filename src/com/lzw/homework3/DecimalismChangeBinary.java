/*
十进制转化为二进制
 */
package com.lzw.homework3;

import java.util.Scanner;

public class DecimalismChangeBinary {
    public static void main(String[] args){
        String result  = "";
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个十进制整数:");
        int num = scanner.nextInt();
        while(num > 0){
            s = num % 2;
            result = s + result;
            num = num / 2;
        }
        System.out.println(result);
    }
}
