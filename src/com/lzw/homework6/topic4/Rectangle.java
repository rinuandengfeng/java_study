package com.lzw.homwork6.topic4;

public class Rectangle {

    //成员变量
    private double lenght;
    private double width;

    //无参数构造方法
    public Rectangle() {
    }

    //有参数构造方法
    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    //修改lenght方法
    public void setHeight(double lenght) {
        this.lenght = lenght;
    }

    //修改width方法
    public void setWidth(double width) {
        this.width = width;
    }

    //访问lenght方法
    public double getLenght() {
        return lenght;
    }

    //访问width方法
    public double getwidth() {
        return width;
    }

    //周长
    public double getPerimeter() {
        double perimeter;
        perimeter = this.lenght * 2 + this.width * 2;
        return perimeter;
    }

    //计算面积
    public double getArea() {
        double area = this.lenght * this.width;
        return area;
    }
}

