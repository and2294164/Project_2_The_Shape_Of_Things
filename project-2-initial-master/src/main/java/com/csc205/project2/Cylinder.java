package com.csc205.project2;

public class Cylinder extends Shape{

    private double r;
    private double h;

    /*-----CONSTRUCTORS-----*/

    public Cylinder() {
        r = 0;
        h = 0;

        //setName("Cylinder");
    }

    public Cylinder(double radius, double height) {
        r = radius;
        h = height;

        //setName("Cylinder");
    }

    /*-----SETTERS-----*/

    public void setRadius(double radius) {
        r = radius;
    }

    public void setHeight(double height) {
        h = height;
    }

    /*-----GETTERS-----*/

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    /*-----CALCULATIONS-----*/

    @Override
    public double surfaceArea() {
        sa = (double) Math.round( ((2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2))) * 100) / 100;
        return sa;
    }

    @Override
    public double volume() {
        v = (double) Math.round( (Math.PI * Math.pow(r, 2) * h) * 100) / 100;
        return v;
    }

    /*-----TO-STRING-----*/

    @Override
    public String toString() {
        //final StringBuilder sb = new StringBuilder(getName() + " {");
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("radius=").append(r);
        sb.append(", height=").append(h);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }




}
