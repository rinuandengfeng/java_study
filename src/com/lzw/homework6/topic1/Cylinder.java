package com.lzw.homwork6.topic1;

class Cylinder extends Circle {
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    //求圆柱的表面积
    public double superficialArea() {
        double radius = super.getRadius();
        double area = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * this.height;
        return area;
    }

    //求圆柱的体积
    public double cylinderVolume() {
        double radius = super.getRadius();
        double Volume = Math.PI * radius * radius * this.height;
        return Volume;
    }
}