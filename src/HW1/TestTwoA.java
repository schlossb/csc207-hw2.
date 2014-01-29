package HW1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA
{

  @Test
  public void
    testisMultiple ()
  {
    assertEquals("Even Whole", true, TwoA.isMultiple (6, 3));
    assertEquals("Even Odd", false, TwoA.isMultiple (5, 3));
    assertEquals("Negative Even", true, TwoA.isMultiple (-6, 3));
    assertEquals("Negative Odd", false, TwoA.isMultiple (-5, 3));
    assertEquals("Zeroes", true, TwoA.isMultiple (0, 3));
  } //isMultiple
  
  //@Test
  public void
    testisOdd ()
  {
    assertEquals("Odd", true, TwoA.isOdd (3));
    assertEquals("Even", false, TwoA.isOdd (4));
    assertEquals("Zero", false, TwoA.isOdd (0));
    assertEquals("Negative Odd", true, TwoA.isOdd (-3));
  } //isOdd
  
  @Test
  public void
    testoddSumTo ()
  {
    assertEquals("3", 1, TwoA.oddSumTo (3));
    assertEquals("0", 0, TwoA.oddSumTo (0));
    assertEquals("10", 25, TwoA.oddSumTo (10));
   
  } //oddSumto
  //test arrrays
  int[] vals = {5, 5};
  int[] vals2 = {5, 4}; 
  int[] vals3 = {-5, 0};
  int[] vals4 = { };
  
  @Test
  public void
    testisOddProd ()
  {
      assertEquals("OddAnswer", true, TwoA.isOddProd (vals));
    assertEquals("Even Answer", false, TwoA.oddSumTo (vals2));
    assertEquals("0 answer", false, TwoA.oddSumTo (vals3));
   
  }//isOddProd
  
  
  @Test
  public void
    testAllDistinct ()
  {
    assertEquals("Dupe Pair", false, TwoA.allDistinct (vals));
    assertEquals("Mixed Pair", true, TwoA.allDistinct (vals2));
    assertEquals("Empty List", true, TwoA.allDistinct (vals4));
   
  }//AllDistinct

  @Test
  public void
    testreverseInts ()
  {
    int[] vals2R = {4, 5}; 
    int[] vals5 = {1, 2, 3, 4, 5};
    int[] vals5r = {5, 4, 3, 2, 1};
    assertEquals("Dupe List", vals, TwoA.reverseInts (vals));
    assertEquals("Mixed Pair", vals2R , TwoA.reverseInts (vals2));
    assertEquals("Longer List", vals5r, TwoA.reverseInts (vals5));
  }//ReverseInts

}
