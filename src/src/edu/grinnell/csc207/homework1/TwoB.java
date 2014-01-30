package edu.grinnell.csc207.homework1;
/*The only bug we found in the average method is that if the sum of left and right exceed 
 * Integer.MAX_VALUE or Integer.MIN_VALUE the program will fail. */
  public class TwoB {
    /**
     * Precondition: The sum of left and right may not exceed Integer.MAX_VALUE or 
     * be lower than Integer.MIN_VALUE
     * Postcondition:
     * Returns the average of two integers.  Rounds toward zero if the
     * average is not a whole number.
     */
    public static int 
      average (int left, int right) 
    {
      return (left + right) / 2;
    } // average(int,int)
  } // class TwoB


