package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RangeTestPawan {

    private Range range1;
    private Range range2;

    @BeforeEach
    void setup() {
      range1 = new Range(2, 6);
      range2 = new Range(4, 8);
    }


  
  // equals() Tests

  @Test
  void testEqualsSameValues(){
    Range sameRange = new Range(2, 6);
    assertTrue(range1.equals(sameRange));
  }

  
  @Test
  void testEqualsDifferentLower() {
    Range different = new Range(3, 6);
    assertFalse(range1.equals(different));
  }

  
  @Test
  void testEqualsDifferentUpeer() {
    Range different = new Range(2, 7);
    assertFalse(range1.equals(different));
  }

  
  @Test
  void testEqualsNull() {
    assertFalse(range1.equals(null));
  }


  @Test
  void testEqualsDifferentObjectType() {
    assertFalse(range1.equals("NotARange"));
  }

  

  

  
