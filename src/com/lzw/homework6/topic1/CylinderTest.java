package com.lzw.homwork6.topic1;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入圆柱的半径:");
        double radius = sc.nextDouble();
        System.out.print("请输入圆柱的高:");
        double height = sc.nextDouble();
        Cylinder c = new Cylinder(radius,height);
        //计算并打印圆柱的表面积
        System.out.printf("圆柱的表面积为:%.2f\n",c.superficialArea());
        //计算并打印圆柱的体积
        System.out.printf("圆柱的体积为:%.2f\n",c.cylinderVolume());
    }
}
