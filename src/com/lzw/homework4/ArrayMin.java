package com.lzw.homework4;

public class ArrayMin {
    public static void main(String[] args) {
        double[] min = {4.5, 2.3, 3.1, 4.3, 8.9};
        double result = minNum(min);
        System.out.println("数组中最小值为:" + result);
    }

    public static double minNum(double[] min) {
        //定义数组
        double result = min[0];
        //判断是不是最小的数
        for (double num : min) {
            if (result > num) {
                result = num;
            }
        }
        return result;


    }
}
