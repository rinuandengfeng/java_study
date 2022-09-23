/*
从键盘上输入5个整数，并存放到一个数组中，然后计算所有元素的和、最大值、最小值及平均值。从键盘上输入5个整数，
并存放到一个数组中，然后计算所有元素的和、最大值、最小值及平均值。
 */

package com.lzw.homework3;

import java.util.Scanner;

public class CalcuateValue {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int sum = 0;
        double avg;
        Scanner scanner = new Scanner(System.in);
        //从键盘输入五个值存放到数组中
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入一个整数:");
            nums[i] = scanner.nextInt();
            sum = nums[i] + sum;
        }
        //把数组中第一个值赋值给max
        int max = nums[0];
        //把数组中第一个值赋值给min
        int min = nums[0];
        //求数组中的最大值和最小值
        for (int j = 1; j < 5; j++) {
            //求最大值
            if (max < nums[j]) {
                max = nums[j];
            }
            //求最小值
            if (min > nums[j]) {
                min = nums[j];
            }

        }
        //求平均值
        avg = sum / (double) nums.length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum =" + sum);
        System.out.println("avg = " + avg);
    }
}
