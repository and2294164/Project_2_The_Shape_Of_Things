package com.csc205.project2;

public class EquilateralTriangularPrism extends Shape{

    private double b;
    private double h;
    private double l;

    /*-----CONSTRUCTORS-----*/

    public EquilateralTriangularPrism() {
        b = 0;
        h = 0;
        l = 0;

        //setName("Equilateral Triangular Prism");
    }

    public EquilateralTriangularPrism(double base, double height, double length) {
        b = base;
        h = height;
        l = length;

        //setName("Equilateral Triangular Prism");
    }

    /*-----SETTERS------*/

    public void setB(double b) {
        this.b = b;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setL(double l) {
        this.l = l;
    }

    /*-----GETTERS-----*/

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public double getL() {
        return l;
    }

    /*-----CALCULATIONS-----*/

    @Override
    public double surfaceArea() {
        sa = (b * h) + 3 * (b * l);
        return sa;
    }

    @Override
    public double volume() {
        v = (1.0/2.0 * b * h) * l;
        return v;
    }

    /*-----TO-STRING-----*/

    @Override
    public String toString() {
        //final StringBuilder sb = new StringBuilder(getName()  + " {");
        final StringBuilder sb = new StringBuilder("Equilateral Right Triangle {");
        sb.append("b=").append(b);
        sb.append(", h=").append(h);
        sb.append(", l=").append(l);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
