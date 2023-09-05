import java.util.Arrays;

/**
   This program demonstrates the bubble sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class BubbleSortDemo
{
   public static void main(String[] args)
   {
	  int[] a = {25, 25, 65, 82, 51, 66, 80, 74, 57, 79, 21, 23, 21, 88, 99, 64, 47, 88, 36, 33};
      System.out.println(Arrays.toString(a));

      BubbleSorter.sort(a);

      System.out.println(Arrays.toString(a));
   }
}
