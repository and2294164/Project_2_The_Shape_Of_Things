package com.csc205.project2;


public class Sphere extends Shape{

    private double radius;

    public Sphere() {
        super();
        this.radius = 0.0;

        //setName("Sphere");
    }

    public Sphere(double v) {
        super();
        this.radius = v;

        //setName("Sphere");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return (double) Math.round((4.0 * Math.PI * Math.pow(radius, 2)) * 100) / 100;          // rounded to 2nd decimal place
    }

    public double volume() {
        return (double) Math.round((4.0/3.0) * Math.PI * Math.pow(radius, 3) * 100) / 100;      // rounded to 2nd decimal place
    }

    @Override
    public String toString() {
        //final StringBuilder sb = new StringBuilder(getName() + " {");
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
