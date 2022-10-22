package com.lzw.homwork6.topic4;

public class Cuboid extends Rectangle{
    private double height;

    //构造方法
    public Cuboid(double lenght,double width,double height){
        super(lenght,width);
        this.height = height;
    }
    //获得height
    public double getHeight(){
        return this.height;
    }
    //修改height
    public void setHeight(double height){
        this.height = height;
    }

    //求体积
    public double volume(){
        return this.height*this.getwidth()*this.getLenght();
    }
}
