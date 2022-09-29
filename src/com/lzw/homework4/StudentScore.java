package com.lzw.homework4;

public class StudentScore {
    public static void main(String[] args) {
        float[][] score = {{80, 67, 86, 76, 82}, {75, 87, 72, 80, 70}, {78, 98, 60, 76, 90}, {93, 65, 76, 63, 67}};
        float sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                sum = score[j][i] + score[j][i] + score[j][i] + score[j][i];
                System.out.println("学生" + i + "的成绩：" + sum);
            }
        }
    }
}
