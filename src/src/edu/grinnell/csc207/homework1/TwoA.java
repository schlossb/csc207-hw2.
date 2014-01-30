package edu.grinnell.csc207.homework1;

public class TwoA
{

  public static
   boolean isMultiple (long a, long b)
  {
    if ((a % b) == 0)
    return true;
    else 
      return false;
  }//isMultiple
  
  public static
  boolean isOdd (int a)
 {
  a = Math.abs (a);
  int i = 1;
  while (i < Integer.MAX_VALUE)
  {
    if (a == i)
      {
    return true;
      }
     i = (i + 2);
   }//Postive Loop
return false;
 }//isOdd
  
  
  public static
  int oddSumTo (int a)
 {
   int i = a;
   int sum = 0;
   if ((i % 2) == 0 && i > 0)
     {
       i = (i-1);
      sum = i;
     }
    
       while (i > 1)
         {
           i = (i - 2);
           sum = (sum + i);
         }// While Loop
       return sum;
     } //OddSum
  
  public static
  boolean isOddProd (int[] ints)
  {
    for (int i = 0; i < ints.length; i++)
      {
        int a = ints[i];
        for (int x = (i + 1); x < ints.length; x++)
          {
            if (((a * ints[x]) % 2) != 0)
            return true;
          }//Inner For Loop
      }//Outer Loop
  return false;          
}//End isOddProd
  public static
  boolean allDistinct (int[] ints)
  {
    for (int i = 0; i < ints.length; i++)
      {
        int a = ints[i];
        for (int x = (i + 1); x < ints.length; x++)
          {
            if (a == ints[x])
            return false;
          }//Inner For Loop
      }//Outer Loop
  return true;      
  }//end allDistinct

  public static
  int[] reverseInts (int[] ints)
  {

   for (int i = 0;i < (ints.length / 2); i++)
      {
        int temp = ints[i];
        ints[i] = ints[ints.length - i - 1];
        ints[ints.length - i - 1] = temp;
       // int temp = ints[ints.length - (i+1)];
       // ints[ints.length - (i+ 1)] = ints[i];
       // ints[i] = temp;
              }
    
    return ints;
  } 
}