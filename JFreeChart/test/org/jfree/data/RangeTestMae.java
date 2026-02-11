package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RangeTestMae {

    // ---------------------------
    // getCentralValue()
    // ---------------------------

    @Test
    void testCentralValueSymmetricRange() {
        Range r = new Range(-5, 5);
        assertEquals(0, r.getCentralValue(), 0.0001);
    }

    @Test
    void testCentralValuePositiveRange() {
        Range r = new Range(2, 6);
        assertEquals(4, r.getCentralValue(), 0.0001);
    }

    @Test
    void testCentralValueSinglePointRange() {
        Range r = new Range(3, 3);
        assertEquals(3, r.getCentralValue(), 0.0001);
    }

    // ---------------------------
    // contains()
    // ---------------------------

    @Test
    void testContainsValueInsideRange() {
        Range r = new Range(0, 10);
        assertTrue(r.contains(5));
    }

    @Test
    void testContainsValueAtLowerBoundary() {
        Range r = new Range(0, 10);
        assertTrue(r.contains(0));
    }

    @Test
    void testContainsValueAtUpperBoundary() {
        Range r = new Range(0, 10);
        assertTrue(r.contains(10));
    }

    @Test
    void testContainsValueBelowRange() {
        Range r = new Range(0, 10);
        assertFalse(r.contains(-1));
    }

    @Test
    void testContainsValueAboveRange() {
        Range r = new Range(0, 10);
        assertFalse(r.contains(11));
    }

    // ---------------------------
    // intersects()
    // ---------------------------

    @Test
    void testIntersectsOverlappingRanges() {
        Range r = new Range(0, 10);
        assertTrue(r.intersects(5, 15));
    }

    @Test
    void testIntersectsContainedRange() {
        Range r = new Range(0, 10);
        assertTrue(r.intersects(2, 8));
    }

    @Test
    void testIntersectsTouchingBoundary() {
        Range r = new Range(0, 10);
        assertTrue(r.intersects(10, 20));
    }

    @Test
    void testIntersectsDisjointBelow() {
        Range r = new Range(0, 10);
        assertFalse(r.intersects(-10, -1));
    }

    @Test
    void testIntersectsDisjointAbove() {
        Range r = new Range(0, 10);
        assertFalse(r.intersects(11, 20));
    }

    // ---------------------------
    // constrain()
    // ---------------------------

    @Test
    void testConstrainValueInsideRange() {
        Range r = new Range(0, 10);
        assertEquals(5, r.constrain(5), 0.0001);
    }

    @Test
    void testConstrainValueAtLowerBoundary() {
        Range r = new Range(0, 10);
        assertEquals(0, r.constrain(0), 0.0001);
    }

    @Test
    void testConstrainValueAtUpperBoundary() {
        Range r = new Range(0, 10);
        assertEquals(10, r.constrain(10), 0.0001);
    }

    @Test
    void testConstrainValueBelowRange() {
        Range r = new Range(0, 10);
        assertEquals(0, r.constrain(-5), 0.0001);
    }

    @Test
    void testConstrainValueAboveRange() {
        Range r = new Range(0, 10);
        assertEquals(10, r.constrain(20), 0.0001);
    }
}
