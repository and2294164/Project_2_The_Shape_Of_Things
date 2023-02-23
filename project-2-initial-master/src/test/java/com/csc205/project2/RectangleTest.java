package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void surfaceArea() {
        double expected = 34;
        double actual = new Rectangle(5.0, 2.0, 1.0).surfaceArea();
        assertEquals(expected,actual);
    }

    @Test
    void volume() {
        double expected = 10;
        double actual = new Rectangle(5.0, 2.0, 1.0).volume();
        assertEquals(expected,actual);
    }
}