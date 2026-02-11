package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RangeTest {

    private Range exampleRange;

    @BeforeEach
    void setUp() {
        // Initialize exampleRange before each test
        exampleRange = new Range(-1, 1);
    }

    @Test
    void testGetCentralValue() {
        // Check that the central value of (-1, 1) is 0
        assertEquals(
            0.0,                   // expected
            exampleRange.getCentralValue(), // actual
            0.0001,                // delta: allowable error for floating point
            "The central value of (-1,1) should be 0"
        );
    }
}
