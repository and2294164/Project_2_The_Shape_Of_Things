package com.csc205.project2;

abstract class Shape implements ThreeDimensionalShape{

    private static String name;
    private static double sa;
    private static double a;

    /*-----------------CONSTRUCTORS------------------*/

    public Shape() {
        name = "no name";
        sa = 0.0;
        a = 0.0;
    }

    public Shape(String Name, double surfaceArea, double a) {
        name = Name;
        sa = surfaceArea;
        a = a;

    }

    /*----------------SETTER-&-GETTER---------------*/


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


}
