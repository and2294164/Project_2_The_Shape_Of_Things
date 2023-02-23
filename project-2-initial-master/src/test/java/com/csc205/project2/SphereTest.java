package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    @Test
    void surfaceArea() {
        double expected = 1520.53;
        double actual = new Sphere(11.0).surfaceArea();
        assertEquals(expected, actual);
    }

    @Test
    void volume() {
        double expected = 5575.28;
        double actual = new Sphere(11.0).volume();
        assertEquals(expected, actual);
    }
}