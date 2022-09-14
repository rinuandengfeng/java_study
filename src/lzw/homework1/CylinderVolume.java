package lzw.homework1;

import java.util.Scanner;


//计算圆柱体积
public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入半径:");
        int r = scanner.nextInt();
        //半径(r)的平方
        Double r_2 = Math.pow(r, 2);
        System.out.print("请输入高:");
        int h = scanner.nextInt();
        Double pi = Math.PI;
        Double v = pi * h * r_2;
        System.out.printf("圆柱的体积为:%.2f", v);


    }
}
