import java.util.Scanner;

/** The lexi program reads in three strings and sorts them lexicographically

*@author Maria Esteban
*@version 1.0
*@since 2023-01-24  */

public class lexi
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String a = in.next();
        System.out.print("Enter the second string: ");
        String b = in.next();
        System.out.print("Enter the third string: ");
        String c = in.next();
        String first;
        String second;
        String third;
        
        //first it is determinated which string goes first and then the other two are compared to see which one is second and third
        if (a.compareTo(b) < 0 && a.compareTo(c)<0)
        {
            first=a;
            if (b.compareTo(c)<0)
            {
                second=b;
                third=c;
            }
            else
            {
                second=c;
                third=b;  
            }
        }
        else if (b.compareTo(a) < 0 && b.compareTo(c)<0)
        {
            first=b;
            if (a.compareTo(c)<0)
            {
                second=a;
                third=c;
            }
            else
            {
                second=c;
                third=a;  
            }
        }
        else
        {
            first=c;
            if (a.compareTo(b)<0)
            {
                second=a;
                third=b;
            }
            else
            {
                second=b;
                third=a;  
            }
        }
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
    }
}
