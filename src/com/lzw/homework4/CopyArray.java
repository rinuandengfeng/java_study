package com.lzw.homework4;

import java.sql.Array;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        //初始化一个int型source数组
        int source[] = {4, 2, 3, 4, 5};
        //初始化一个int型target数组
        int target[] = new int[5];
//        for (int i = 0; i < source.length; i++) {
//            target[i] = source[i];
//        }
        //使用arrarycopy()方法复制
//        System.arraycopy(source, 0, target,0,source.length);
        //使用Arrays类中的copyof()方法复制
//        target = Arrays.copyOf(source,source.length);
        //使用Arrays类中的copyofrange()方法复制
        target = Arrays.copyOfRange(source, 0, source.length);

        for (int k : target) {
            System.out.println(k + " ");
        }

    }
}
