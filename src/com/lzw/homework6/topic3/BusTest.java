package com.lzw.homwork6.topic3;

public class BusTest {
    public static void main(String[] args) {
        Bus yh = new Bus(2,10);
        //公交车停车
        yh.stop();
        //到站的人下车
        yh.getOff(2);
        //上车的人
        yh.getOn(5);
        System.out.printf("公交车上现在的人数为:%d\n",yh.getPassenger());
        yh.start();
        yh.speedUp();
    }
}
