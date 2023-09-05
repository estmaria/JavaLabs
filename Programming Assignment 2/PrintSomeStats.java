import java.util.Scanner;

/** The PrintSomeStats program reads two input integers and then
* calculates the sum, difference, product, average, the positive 
* distance between the two values, the maximum, and the minimum.

*@author Maria Esteban
*@version 1.0
*@since 2023-01-18  */

public class PrintSomeStats
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        int firstNum = in.nextInt();
        System.out.print("Please enter the second integer: ");
        int secondNum = in.nextInt();
        System.out.printf("Sum: %d%n", firstNum + secondNum); 
        System.out.printf("Difference: %d%n", firstNum - secondNum); 
        System.out.printf("Product: %d%n", firstNum * secondNum); 
        System.out.printf("Average: %f%n", (double)(firstNum + secondNum) / 2); //convert the result from an integer to a floting-point
        System.out.printf("Distance: %d%n", Math.abs(firstNum - secondNum));
        System.out.printf("Maximum: %d%n", Math.max(firstNum, secondNum));
        System.out.printf("Minimum: %d%n", Math.min(firstNum, secondNum));
    }
    
}