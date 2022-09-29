package com.lzw.homework4;

import java.util.Arrays;

public class SumArrary {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        int[] b = {3, 4, 5, 8};
        int[] c = sumArrary(a, b);
        for (int result : c) {
            System.out.print(result + " ");
        }
    }

    public static int[] sumArrary(int[] a, int[] b) {
        int[] c;
        //判断数组长度
        if (a.length > b.length) {
            c = Arrays.copyOfRange(a, 0, a.length);
            for (int i = 0; i < b.length; i++) {
                c[i] = c[i] + b[i];
            }


        } else {
            c = Arrays.copyOfRange(b, 0, b.length);
            for (int i = 0; i < a.length; i++) {
                c[i] = c[i] + a[i];
            }

        }
        return c;
    }
}
