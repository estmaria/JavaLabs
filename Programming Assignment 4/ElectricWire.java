import java.util.Scanner;
/** The ElectricWire program calculates the resistance of a copper and an aluminum wire given the length and gauge of these wires
*@author Maria Esteban
*@version 1.0
*@since 2023-02-08  */
public class ElectricWire
{
    public static final int MM_TO_METER = 1000;
    /**
      Finds the wire diameter corresponding to the AWG number.
      @param wireGauge the wire gauge
      @return the wire diameter in meters
   */
    public static double diameter(int wireGauge)
    {
        double diameter=0.127*Math.pow(92,(36.0-wireGauge)/39.0)/MM_TO_METER;
        return diameter;
    }
    public static final double RESISTIVITY_COPPER = 1.678e-8;
    /**
      Finds the resistance of a piece of copper wire.
      @param length the wire length in inches
      @param wireGauge the wire gauge
      @return the resistance in Ohms
   */
    public static double copperWireResistance(double length, int wireGauge)
    {
        double resistance=(4*RESISTIVITY_COPPER*length)/(Math.PI*Math.pow(diameter(wireGauge),2));
        return resistance;
    }
    public static final double RESISTIVITY_ALUMINUM = 2.82e-8;
    /**
      Finds the resistance of a piece of aluminum wire.
      @param length the wire length in inches
      @param wireGauge the wire gauge
      @return the resistance in Ohms
   */
    public static double aluminumWireResistance(double length, int wireGauge)
    {
        double resistance=(4*RESISTIVITY_ALUMINUM*length)/(Math.PI*Math.pow(diameter(wireGauge),2));
        return resistance;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
         
      System.out.println("Enter the wire gauge: " );
      int n = in.nextInt();

      System.out.println("Enter the wire length in inches: " );
      double length = in.nextDouble();

      System.out.print("The resistance of a " + length + " inch piece of " 
         + n + " gauge copper wire is ");
      System.out.println(copperWireResistance(length, n) + " Ohms.");
      System.out.print("The resistance of a " + length + " inch piece of " 
         + n  + " gauge aluminum wire is ");
      System.out.println(aluminumWireResistance(length, n) + " Ohms.");
        in.close();
    }
}
