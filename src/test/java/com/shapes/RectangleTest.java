package com.shapes;

import com.shapes.Rectangle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("provideLengthBreadthAndArea")
    void shouldCalculateAreaOfRectangle(double length, double width, double expectedArea) {
        // Given
        Rectangle rectangle = new Rectangle(length, width);

        // When
        double actualArea = rectangle.area();

        // Then
        assertEquals(expectedArea, actualArea);
    }

    private static Stream<Arguments> provideLengthBreadthAndArea() {
        return Stream.of(
                Arguments.of(2.0, 3.0, 6.0),
                Arguments.of(2.0, 0.0, 0.0),
                Arguments.of(0.0, 3.0, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideLengthBreadthAndPerimeter")
    void shouldCalculatePerimeterOfRectangle(double length, double width, double expectedPerimeter) {
        // Given
        Rectangle rectangle = new Rectangle(length, width);

        // When
        double actualPerimeter = rectangle.perimeter();

        // Then
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    private static Stream<Arguments> provideLengthBreadthAndPerimeter() {
        return Stream.of(
                Arguments.of(2.0, 3.0, 10.0),
                Arguments.of(2.0, 0.0, 4.0),
                Arguments.of(0.0, 3.0, 6.0)
        );
    }
}
