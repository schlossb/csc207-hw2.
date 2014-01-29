package HW1;


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
   int i = 1;
   if (a > 0)
     {
       
       while (i < Integer.MAX_VALUE)
         {
     
     if (a == i)
    return true;
     else
       i =+ 2;
          }//Postive Loop
      } //if A > 0
     {
       i = (0 - Integer.MAX_VALUE);
     while (i < 0)
       {
          if (a == i)
         return true;
          else
       i =+ 2;

       } // Negative Loop
     }
return false;

}//isOdd

 public static
  int oddSumTo (int a)
 {
   int i = a;
   int sum = 0;
  
       while (i >= 1)
         {
           if ((a % 2) != 0)
             {
           i =- 2;
           sum =+ i;
             } // add odds
           else
             {
             a =- 1;
             i = a;
             sum =+ a;
             }//Change Even to add and add to sum
       
         }// While Loop
       return sum;
     } //OddSum
}//Everthing

