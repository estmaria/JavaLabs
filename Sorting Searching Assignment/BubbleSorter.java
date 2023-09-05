import java.util.Arrays;

public class BubbleSorter
{
   /**
      Sort an integer array using the bubble sort algorithm.
      @param arr array of integers to sort
   */
   public static void sort(int[] arr)
   {
      // your code goes here
      // for bubble sort
      int[] a = arr;
      boolean swapped=true;
      int endIndex=a.length;
      while (swapped)
      {
         swapped=false;
         for (int i=0; i<endIndex-1; i++)
         {
            if (a[i]>a[i+1])
            {
               int tmp=a[i];
               a[i]=a[i+1];
               a[i+1]=tmp;
               swapped=true;
            }
            System.out.println(Arrays.toString(a));
         }
      }

   }

}
