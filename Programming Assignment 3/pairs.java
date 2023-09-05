import java.util.Scanner;

/** The pairs program reads four integers and prints "two pairs" if the input 
 * consists of two matching pairs in some order and "not two pairs otherwise

*@author Maria Esteban
*@version 1.0
*@since 2023-01-24  */

public class pairs
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = in.nextInt();
        System.out.print("Enter the second integer: ");
        int b = in.nextInt();
        System.out.print("Enter the third integer: ");
        int c = in.nextInt();
        System.out.print("Enter the fourth integer: ");
        int d = in.nextInt();

        if (a==b || a==c || a==d)
        {
            if (b==c || b==d || c==d)
            {
                System.out.print("Two pairs");
            }
            else
            {
                System.out.print("Not two pairs");
            }
        }
        else
        {
            System.out.print("Not two pairs");
        }
        
    }
}
