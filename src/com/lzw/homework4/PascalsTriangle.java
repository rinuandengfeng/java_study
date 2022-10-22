package com.lzw.homework4;

public class PascalsTriangle {
    public static void main(String[] args) {
        //用二维数组存储
        int[][] ary = new int[10][10];
        //竖边、斜边置1
        for (int i = 0; i < ary.length; i++) {
            ary[i][0] = 1;
            ary[i][i] = 1;
        }
        //外循环控制行数
        for (int i = 1; i < ary.length; i++) {
            //内循环控制列
            for (int j = 1; j <= i; j++) {
                //里面部分，等于当前位置的上方和左上角之和
                ary[i][j] = ary[i - 1][j - 1] + ary[i - 1][j];
            }
        }
        //打印杨辉三角
        //外循环控制行
        for (int i = 0; i < ary.length; i++) {
            //内循环控制列
            for (int j = 0; j <= i; j++) {
                System.out.printf(" %-3d", ary[i][j]);
            }
            System.out.println(); //换行
        }
    }
}
