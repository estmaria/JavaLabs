/**
*@author Maria Esteban
*@version 1.0
*@since 2023-02-17  */
import java.util.ArrayList;
public class identicalLists
{
   public static int count(int e, ArrayList<Integer> b)  // check if element in array?
   {
      int count = 0;
      for (int i = 0; i < b.size(); i++)
      {
         if (e == b.get(i))
         {
            count++;
         }
      }
      return count;
   }
   
   // This method assumes that the two array arguments
   // are the same size.
   public static boolean sameElements(ArrayList<Integer> a, ArrayList<Integer> b)
   {
      for (int i = 0; i < a.size(); i++)  // loop through arrays with length of array a
      {
         if (count(a.get(i), a) != count(a.get(i), b))   // check array elements for matched counts
         {                                       // ie. 4 exists in both arrays twice
            return false;
         }
      }
      return true;
   }   
   
   public static void main(String[] args)
   {
      ArrayList<Integer> a = new ArrayList<>();
      a.add(1);
      a.add(4);
      a.add(9);
      a.add(16);
      a.add(9);
      a.add(7);
      a.add(4);
      a.add(9);
      a.add(11);
      ArrayList<Integer> b = new ArrayList<>();
      b.add(11);
      b.add(1);
      b.add(4);
      b.add(9);
      b.add(16);
      b.add(9);
      b.add(7);
      b.add(4);
      b.add(9);


      System.out.print("The arrays a and b ");
   
      if (!sameElements(a, b))
      {
         System.out.print("do not ");
      }
   
      System.out.println("have the same elements." );
   }
}