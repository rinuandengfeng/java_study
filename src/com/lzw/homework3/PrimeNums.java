/*
输出前50个素数，每行输出10个
 */

package com.lzw.homework3;

public class PrimeNums {
    public static void main(String[] args) {

        int nums = 0;

        //得到50个素数
        for (int i = 2; nums < 50; i++) {
            int isprime = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime = 0;
                    break;
                }
            }
            if (isprime == 1) {
                if (nums % 10 == 0) {
                    System.out.println();
                }
                System.out.print(i + " ");
                nums += 1;

            }

        }
    }
}

