package com.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    void shouldCalculateArea() {
        Square square = new Square(4.0);

        assertEquals( 16.0 , square.area());
    }

    @Test
    void shouldCalculatePerimeter() {
        Square square = new Square(3.0);

        assertEquals( 12.0 , square.perimeter());
    }

}
