package com.lzw.homework1;

import java.util.Scanner;

//华氏温度转化为摄氏度
public class FabrenheitChangeCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入华氏温度:");
        Double fabrenheit = scanner.nextDouble();

        //使用华氏转化为摄氏公式c = (5 / 9) * (f -32)
        Double celsius = (5.0 / 9) * (fabrenheit - 32);
        System.out.printf("Fabrenheit is :%.1f ", fabrenheit);
        System.out.printf("Celsius %.1f", celsius);

    }

}
