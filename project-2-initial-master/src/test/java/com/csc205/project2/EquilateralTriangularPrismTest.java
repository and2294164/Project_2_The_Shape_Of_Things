package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquilateralTriangularPrismTest {

    @Test
    void surfaceArea() {
        double expected = 72.0;
        double actual = new EquilateralTriangularPrism(8.0, 6.0, 1.0).surfaceArea();
        assertEquals(expected, actual);
    }

    @Test
    void volume() {
        double expected = 24.0;
        double actual = new EquilateralTriangularPrism(8.0, 6.0, 1.0).volume();
        assertEquals(expected, actual);
    }
}