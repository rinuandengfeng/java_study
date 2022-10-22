package com.lzw.homwork6.topic3;

public class Auto {
    //表示速度
    private double speed;
    //构造方法
    public Auto(){};

    public Auto(double speed){
        this.speed = speed;
    }
    //get方法
    public double getSpeed(){
        return this.speed;
    }
    //set方法
    public void setSpeed(double speed){
        this.speed = speed;
    }

    //启动方法
    public void start(){
        System.out.println("汽车已启动^_^");
    }
    //加速
    public void speedUp(){
        System.out.print("正在进行加速");
    }
    //停止
    public void stop(){
        System.out.println("汽车已停止");
    }

}
