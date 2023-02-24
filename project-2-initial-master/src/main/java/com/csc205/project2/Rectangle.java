package com.csc205.project2;

public class Rectangle extends Shape {


    private double l;
    private double w;
    private double h;

    /*-----------CONSTRUCTORS------------*/

    // default
    public Rectangle() {
        l = 0;
        w = 0;
        h = 0;
        name = "Rectangle";
    }

    // overload
    public Rectangle(double length, double width, double height) {
        l = length;
        w = width;
        h = height;
        name = "Rectangle";

    }

    /*----------SETTERS-----------*/

    public void setL(double l) {
        this.l = l;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setH(double h) {
        this.h = h;
    }

    /*-----------GETTERS----------*/

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    public double getL() {
        return l;
    }

    /*----------CALCULATIONS-----------*/

    public double surfaceArea() {
        sa = (2 * l * h) + (2 * l * w) + (2 * w * h);
        return sa;
    }

    public double volume() {
        v = l * w * h;
        return v;
    }

    /*------------TO-STRING---------*/

    @Override
    public String toString() {
        //final StringBuilder sb = new StringBuilder(getName() + " {");
        final StringBuilder sb = new StringBuilder("Rectangle {");
        sb.append("length=").append(l);
        sb.append(", width=").append(w);
        sb.append(", height=").append(h);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
