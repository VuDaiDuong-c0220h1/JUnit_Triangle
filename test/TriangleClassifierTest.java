import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTypeOfTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Đây là tam giác đều";
        String actual = TriangleClassifier.typeOfTriangle(a, b, c);
        assertEquals(expected, actual);
    }
}