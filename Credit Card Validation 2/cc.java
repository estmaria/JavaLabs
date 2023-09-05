/** 
*@author Maria Esteban and Noa Txintxurreta
*@version 1.0
*@since 2023-01-27  */

public class cc 
{
    public static void main(String[] args)
   {
      String cardInput = "4012-8888-8888-1881"; //SUB "4123-5678-9012-3450"; "4125 5679 9112 3450" 
      String creditCardNumber = cardInput;

      int i = 0;
      while (i < creditCardNumber.length())
      {
         char ch = creditCardNumber.charAt(i);
         if (ch == ' ' || ch == '-')
         {
            // Remove the character at position i
            String before = creditCardNumber.substring(0, i);
            String after = creditCardNumber.substring(i + 1);
            creditCardNumber = before + after;
         }
         else
         {
            i++;
         }
      }

      // Step 1 - form the sum of all the digits
      int n=0;
      int CCSum=0;
      while (n<creditCardNumber.length())
      {
        String digitStr=creditCardNumber.substring(n,n+1);
        int digit = Integer.parseInt(digitStr);
        CCSum=CCSum+digit;
        n++;
      }

      // Step 2 - add to the sum every 2nd digit, starting with the
      // second digit from the right. If the digit is > 4, then
      // add one to sum.
      n=0;
      while (n<creditCardNumber.length())
      {
        String digitStr=creditCardNumber.substring(n,n+1);
        int digit = Integer.parseInt(digitStr);
        CCSum=CCSum+digit;
        if (digit>4)
        {
            CCSum++;
        }
        n=n+2;
      }
      
      // Output credit card number and whether valid or not valid.
      // Valid if CC number modulus 10 is equal to zero.
      if (CCSum%10==0)
      {
         System.out.printf("%s is a valid credit card", cardInput);
      }
      else
      {
         System.out.printf("%s is an invalid credit card", cardInput);
      }
      
   }
}
