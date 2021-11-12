import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void shouldReturnAreaOfRectangle() {
        Rectangle rectangle = new Rectangle();
        assertEquals( 200 , rectangle.calculateArea( 10 , 20 ));
    }

}
