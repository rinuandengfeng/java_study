package lzw.homework1;

import java.util.Scanner;

//输出各位数字之和
public class OutputEverybodySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int num = scanner.nextInt();
        //百位的数
        int a = num / 100;
        //十位的数
        int b = (num - a * 100) / 10;
        //个为的数
        int c = num % 10;
        int total = a + b + c;

        System.out.printf("各位数之和为: %d", total);

    }
}
