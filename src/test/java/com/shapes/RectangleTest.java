package com.shapes;

import com.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void shouldReturnAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals( 200 , rectangle.area());
    }

    @Test
    void shouldReturnAreaOfRectangleAsZeroIfLength() {
        Rectangle rectangle = new Rectangle(0, 20);
        assertEquals( 0 , rectangle.area());
    }

    @Test
    void shouldReturnPerimeterOfRectangle() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals( 60 , rectangle.perimeter());
    }



}
