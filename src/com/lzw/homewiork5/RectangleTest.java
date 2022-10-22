package com.lzw.homewiork5;


public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(1);
        rectangle.setWidth(2);
        System.out.println("周长为:" + rectangle.getPerimeter());
        System.out.println("面积为:" + rectangle.getArea());

    }


}

class Rectangle {
    //成员变量
    private double height;
    private double width;

    //无参数构造方法
    public Rectangle() {
    }

    //有参数构造方法
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    //修改height方法
    public void setHeight(double height) {
        this.height = height;
    }

    //修改width方法
    public void setWidth(double width) {
        this.width = width;
    }

    //访问height方法
    public double getHeight() {
        return height;
    }

    //访问width方法
    public double getwidth() {
        return width;
    }

    //周长
    public double getPerimeter() {
        double perimeter;
        perimeter = this.height * 2 + this.width * 2;
        return perimeter;
    }

    //计算矩形面积
    public double getArea() {
        double area = this.height * this.width;
        return area;
    }
}
