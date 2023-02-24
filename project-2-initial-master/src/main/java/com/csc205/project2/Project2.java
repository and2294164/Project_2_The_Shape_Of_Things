package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 * <p>
 * Modify the driver as needed to demonstrate your classes.
 *
 */

public class Project2 {

    public static void main(String[] args) {
        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape rectangle = new Rectangle(3.0, 4.0, 5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape triangularPrism = new EquilateralTriangularPrism(5.0, 4.0, 10.0);

        //TODO: ask about how to make use of ThreeDimensionalShape and Shape

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(rectangle);
        shapes.add(cylinder);
        shapes.add(triangularPrism);

        shapes.forEach(System.out::println);

        //System.out.println(Shape.getName());

        /*
        The following code works with the code given.
         */

        //Sphere sphere = new Sphere(2.0);
        //System.out.println(sphere);
    }



}

