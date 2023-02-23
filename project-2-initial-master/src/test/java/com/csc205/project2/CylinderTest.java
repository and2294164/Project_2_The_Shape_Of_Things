package com.csc205.project2;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @org.junit.jupiter.api.Test
    void surfaceArea() {
        double expected = 37.70;
        double actual = new Cylinder(1.0, 5.0).surfaceArea();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void volume() {
        double expected = 15.71;
        double actual = new Cylinder(1.0, 5.0).volume();
        assertEquals(expected, actual);
    }
}