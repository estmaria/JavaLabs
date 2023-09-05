import java.util.Scanner;

/** The CCValidator program verifies whether if a credit card number is valid o not
*@author Maria Esteban
*@version 1.0
*@since 2023-02-02  */

public class CCValidator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Credit Card Number(no spaces):");
        String creditCardNumber = in.next();
        int sum1=0;
        int i=1;
        int n=0;
        while(i<creditCardNumber.length()) //sum of every other digit starting from the rightmost digit
        {
            String digit=creditCardNumber.substring(creditCardNumber.length()-i,creditCardNumber.length()-n);
            sum1=sum1+Integer.parseInt(digit);
            i=i+2;
            n=n+2;
        }

        //Doubles each of the digits that were not included in the preceding step and adds all digits of the resulting numbers
        i=0;
        n=0;
        int sum2=0;
        String numStr="";
        while(i<creditCardNumber.length())
        {
            String digitStr=creditCardNumber.substring(i,i+1);//selects every other number
            int digitInt = Integer.parseInt(digitStr)*2; //converts that number to a integer and doubles it
            numStr=numStr+Integer.toString(digitInt); //convert the number back to an string and puts them all together
            while (n<numStr.length()) //adds the digits of the resultant number
            {
                String digitStr2=numStr.substring(n,n+1);
                sum2 = sum2+Integer.parseInt(digitStr2);
                n++;
            }
            i=i+2;
        }
        int totalSum = sum1+sum2;//adds together the two preceding steps
        int checkDigit=0;
        if (totalSum % 10==0) //checks if is the last digit of this number is 0
        {
            System.out.print("Valid credit card");
        }
        else
        {
            System.out.print("Invalid credit card. ");
            //calculates what the check digit should be in order to be a valid credit card
            if (totalSum%10>5)
            {
                checkDigit=(Integer.parseInt(creditCardNumber))%10+10-(totalSum%10);
            }
            else
            {
                checkDigit=(Integer.parseInt(creditCardNumber))%10-(totalSum%10);
            }
            if (checkDigit==10)
            {
                checkDigit=0;
            }
            System.out.print("The check digit should be "+checkDigit);
        }
        in.close();
    }
}
