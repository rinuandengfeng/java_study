package com.lzw.homwork6.topic2;

public class Square extends Shape {
    private double side;


    //构造方法
    public Square(double side) {
       this.side = side;
    }

    //set方法
    public void setSide(double side) {
        this.side = side;
    }

    //get方法

    public double getSide() {
        return this.side;
    }


    @Override
    public double getPerimeter() {
        return 4*this.side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }
}
