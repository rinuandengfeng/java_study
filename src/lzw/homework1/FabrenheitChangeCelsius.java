package lzw.homework1;

import java.util.Scanner;

//华氏温度转化为摄氏度
public class FabrenheitChangeCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入华氏温度:");
        Double fabren = scanner.nextDouble();

        //使用华氏转化为摄氏公式c = (5 / 9) * (f -32)
        Double c = (5.0 / 9) * (fabren - 32);
        System.out.printf("Fabrenheit is :%.1f ", fabren);
        System.out.printf("Celsius %.1f", c);
    }

}
