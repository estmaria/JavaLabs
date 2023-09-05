import java.util.Scanner;

/** The tip program calculates a suggested tip given the satisfaction level of the customers and the dinner cost

*@author Maria Esteban
*@version 1.0
*@since 2023-01-24  */

public class tips
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the dinner cost: ");
        double cost = in.nextDouble();
        System.out.println("Select your satisfaction level (1=Totally satisfied, 2=Satisfied, 3=Dissatisfied)");
        int satisfactionNum = in.nextInt();
        double tip=0;
        String satisfactionLevel="";

        if (satisfactionNum==1)
        {
            tip=0.2*cost;
            satisfactionLevel="totally satisfied";
        }
        else if (satisfactionNum==2)
        {
            tip=0.15*cost;
            satisfactionLevel="satisfied";
        }
        else if (satisfactionNum==3) 
        {
            tip=0.1*cost;
            satisfactionLevel="dissatisfied";
        }
        //breaks the tip in dollars and cents separate
        tip*=100;
        int tipDollars = (int) tip/100;
        int tipCents = (int) tip%100;

        System.out.printf("For a satisfaction level of %s and a bill of %.2f$ the suggested tip is %d dollars and %d cents.", 
        satisfactionLevel, cost, tipDollars, tipCents);

    }
}
