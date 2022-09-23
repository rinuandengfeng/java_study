/*
随机产生一个[10,50]的整数，用户从键盘上输入所猜的数，程序显示是否猜中的消息，
如果没有猜中要求用户继续猜，直到猜中为止。
 */
package com.lzw.homework3;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] ages) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNum = random.nextInt(40);
        targetNum += targetNum + 10;
        System.out.print(targetNum);
        while (true) {
            System.out.print("请输入一个[10,50]的数:");
            //接收输入的值
            int guessNum = scanner.nextInt();
            //判断输入的值是否与随机数产生的值相等
            if (targetNum == guessNum) {
                System.out.print("恭喜你猜中了~~");
                break;
            }

        }
    }
}
