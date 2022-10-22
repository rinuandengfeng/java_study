package com.lzw.homwork6.topic3;

public class Bus extends Auto{
    private int passenger;

    //构造方法
    public Bus(double speed,int passenger){
        super(speed);
        this.passenger = passenger;
    }

    //get方法
    public int getPassenger(){
        return this.passenger;
    }
    //set方法
    public void setPassenger(int passenger){
        this.passenger =passenger;
    }
    //上车gotOn
    public int getOn(int person){
        System.out.printf("该站上车人数为:%d\n",person);
        this.passenger = this.passenger + person;
//        System.out.printf("现在公交车上的人数为:%d\n",this.passenger);
        return this.passenger;
    }
    //下车gotOff
    public int getOff(int person){
        System.out.printf("该站下车人数为:%d\n",person);
        this.passenger = this.passenger - person;
//        System.out.printf("现在公交车上的人数为:%d\n",this.passenger);
        return this.passenger;
    }

}
