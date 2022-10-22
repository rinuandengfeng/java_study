package com.lzw.homework4;

public class StudentScore {
    public static void main(String[] args) {
        float[][] score = {{80, 75, 78, 93}, {67, 87, 98, 65}, {86, 72, 60, 76}, {76, 80, 76, 63}, {82, 70, 90, 67}};

        float[] allScore = new float[5];
        int studentId = 0;
        //求每个学生的成绩之和
        for (int i = 0; i < score.length; i++) {
            float sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
            allScore[i] = sum;
            System.out.println("学生" + i + "行的成绩：" + sum);
        }
        //求总成绩最高的行号及总成绩
        float maxScore = allScore[0];
        for (int i = 0; i < allScore.length; i++) {
            if (maxScore < allScore[i]) {
                maxScore = allScore[i];
                studentId = i;
            }
        }
        System.out.println("学生总成绩最高的是" + studentId  + "行学生总成绩为:" + maxScore);
        //求每列的最高分
        for (int i = 0; i < score[0].length; i++) {
            float max = score[0][i];
            int j = 0;
            for (int k = 1; k < score.length; k++) {
                if (score[k][i] > max) {
                    max = score[k][i];
                    j = k;
                }
            }
            System.out.println("第"+i +"科最高分为:"+max +"行号为:"+j);

        }
    }
}
