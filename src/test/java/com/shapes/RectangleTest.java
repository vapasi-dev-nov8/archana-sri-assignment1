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

}
