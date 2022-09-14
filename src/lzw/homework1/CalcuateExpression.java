package lzw.homework1;

import java.util.Scanner;

//计算表达式值
public class CalcuateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入a:");
        int a = scanner.nextInt();

        System.out.print("请输入b:");
        int b = scanner.nextInt();

        System.out.print("请输入c:");
        int c = scanner.nextInt();

        //按照公式计算
        Double total = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        //打印结果
        System.out.printf("方程的一个根是:%f", total);
    }
}
