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


    
    
  //combine() Tests

    @Test
    void testCombineTwoValidRanges() {
        Range combined = Range.combine(range1, range2);
        assertEquals(2.0, combined.getLowerBound());
        assertEquals(8.0, combined.getUpperBound());
    }


    @Test
    void testCombineFirstNull() {
        Range combined = Range.combine(null, range2);
        assertEquals(range2, combined);
    }


    @Test
    void testCombineSecondNull() {
        Range combined = Range.combine(range1, null);
        assertEquals(range1, combined);
    }


    @Test
    void testCombineBothNull() {
        Range combined = Range.combine(null, null);
        assertNull(combined);
    }
    
    

  

  
