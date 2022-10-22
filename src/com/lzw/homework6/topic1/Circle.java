package com.lzw.homwork6.topic1;

public class Circle {

    //定义成员变量
    private double centerX;
    private double centerY;
    private double radius;

    //默认构造方法
    public Circle() {
    }

    //带参数构造方法
    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //设置方法
    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //访问方法
    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getRadius() {
        return radius;
    }

    //计算圆的面积
    public double getArea() {

        double area = Math.pow(this.radius, 2) * Math.PI;
        return area;
    }

    //计算圆的周长
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }


}
