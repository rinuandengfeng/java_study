package com.lzw;

import java.util.Scanner;

public class Test {
//    static void leftshift(int i, int j){
//        i <<= j;
//    }
//    public static void main(String[] args){
//        int i = 4, j = 2;
//        leftshift(i,j);
//        System.out.println("i = "+ i);
//    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a ,b;
        while(cin.hasNext()){
            a = cin.nextByte();b = cin.nextInt();
            System.out.println(a+b);
        }
    }
}

