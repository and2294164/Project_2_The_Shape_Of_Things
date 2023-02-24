package com.csc205.project2;

abstract class Shape implements ThreeDimensionalShape{

    //TODO: MAKE THESE INTO ARRAYS
    protected String name;
    protected double sa;
    protected double v;

    /*-----------------CONSTRUCTORS------------------*/

    public Shape() {
        name = "no name";
        sa = 0.0;
        v = 0.0;
    }

    public Shape(String Name, double surfaceArea, double v) {
        name = Name;
        sa = surfaceArea;
        v = v;

    }

    /*----------------SETTER-&-GETTER---------------*/

    /*
    public static void setSa(double surfaceArea) {
        sa = surfaceArea;
    }

    public static void setArea(double area) {
        a = area;
    }

    public static void setName(String n) {
        name = n;
    }

    public static String getName() {
        return name;
    }

    public static double getSa() {
        return sa;
    }

    public static double getArea() {
        return a;
    }
     */


}
