import java.util.Scanner;

/** The unit_convert program reads four integers and prints "two pairs" if the input 
 * consists of two matching pairs in some order and "not two pairs otherwise

*@author Maria Esteban
*@version 1.0
*@since 2023-01-24  */

public class unit_convert
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Covert from? (fl.oz, gal, oz, lb, in, ft, mi)");
        String unit1 = in.next();
        System.out.print("Covert to? (ml, l, g, kg, mm, cm, m, km)");
        String unit2 = in.next();
        System.out.print("Value?");
        double value = in.nextDouble();
        double result=value;
        //conversion factors
        final double L_PER_FL_OZ=0.02957;
        final double L_PER_GAL=3.78541;
        final double G_PER_OZ=28.34952;
        final double G_PER_LB=453.59237;
        final double M_PER_IN=0.0254;
        final double M_PER_FT=0.3048;
        final double M_PER_MI=1609.344;

        if (unit1.equals("fl.oz") && unit2.equals("ml"))
        {
            result=value*L_PER_FL_OZ*1000; //we have to convert ml to l
        }
        else if (unit1.equals("fl.oz") && unit2.equals("l"))
        {
            result=value*L_PER_FL_OZ; 
        }
        else if (unit1.equals("gal") && unit2.equals("ml"))
        {
            result=value*L_PER_GAL*1000; //we have to convert ml to l
        }
        else if (unit1.equals("gal") && unit2.equals("l"))
        {
            result=value*L_PER_GAL; 
        }
        else if (unit1.equals("oz") && unit2.equals("g"))
        {
            result=value*G_PER_OZ; 
        }
        else if (unit1.equals("oz") && unit2.equals("kg"))
        {
            result=value*G_PER_OZ/1000; //we have to convert g to kg
        }
        else if (unit1.equals("lb") && unit2.equals("g"))
        {
            result=value*G_PER_LB; 
        }
        else if (unit1.equals("lb") && unit2.equals("kg"))
        {
            result=value*G_PER_LB/1000; //we have to convert g to kg
        }
        else if (unit1.equals("in") && unit2.equals("mm"))
        {
            result=value*M_PER_IN*1000; //we have to convert m to mm
        }
        else if (unit1.equals("in") && unit2.equals("cm"))
        {
            result=value*M_PER_IN*100; //we have to convert m to cm
        }
        else if (unit1.equals("in") && unit2.equals("m"))
        {
            result=value*M_PER_IN; 
        }
        else if (unit1.equals("in") && unit2.equals("km"))
        {
            result=value*M_PER_IN/1000; //we have to convert m to km
        }
        else if (unit1.equals("ft") && unit2.equals("mm"))
        {
            result=value*M_PER_FT*1000; //we have to convert m to mm
        }
        else if (unit1.equals("ft") && unit2.equals("cm"))
        {
            result=value*M_PER_FT*100; //we have to convert m to cm
        }
        else if (unit1.equals("ft") && unit2.equals("m"))
        {
            result=value*M_PER_FT; 
        }
        else if (unit1.equals("ft") && unit2.equals("km"))
        {
            result=value*M_PER_FT/1000; //we have to convert m to km
        }
        else if (unit1.equals("mi") && unit2.equals("mm"))
        {
            result=value*M_PER_MI*1000; //we have to convert m to mm
        }
        else if (unit1.equals("mi") && unit2.equals("cm"))
        {
            result=value*M_PER_MI*100; //we have to convert m to cm
        }
        else if (unit1.equals("mi") && unit2.equals("m"))
        {
            result=value*M_PER_MI; 
        }
        else if (unit1.equals("mi") && unit2.equals("km"))
        {
            result=value*M_PER_MI/1000; //we have to convert m to km
        }
        else
        {
        System.out.println("Error: incompatible conversion");
        System.exit(0); //if the units are incompatible the program is ended
        }
        System.out.printf("%.2f %s = %.2f %s", value, unit1, result, unit2);

    }
}
