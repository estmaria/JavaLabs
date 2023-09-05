// import for arraylist
import java.util.ArrayList;

/**  The class CashRegisterMod is simulated cash register that tracks the item count and
*    the total amount due.
*@author Maria Esteban
*@version 1.0
*@since 2023-03-20
*/

public class CashRegisterMod
{
   private ArrayList<Double> itemPrices;   //instance of ArrayList

   //=============Constructor=====================
   /**
      Constructs a cash register with cleared item totals
   */
   public CashRegisterMod()
   {
      itemPrices = new ArrayList<Double>();
   }
   


   //=============addItem=====================
   /**
      Adds an item to this cash register.
      @param price the price of this item
   */
   public void addItem(double price)
   {
      itemPrices.add(price);
   }
   
   //=============getTotal=====================
   /**
      Gets the price of all items of the current sale.
      @return the total price
   */
   public double getTotal()
   {
      double sum=0;
      for (int i=0; i<itemPrices.size(); i++)
      {
         double price=itemPrices.get(i);
         sum = sum+price;
      }
      return sum;
   }

   //=============getCount=====================
   /**
      Gets the number of items in the current sale.
      @return the item count
   */
   public int getCount()
   {
      return itemPrices.size();
   }

   //=============clear=====================
   /**
      Clears the item count and the total.
   */
   public void clear()
   {
      for(int i=itemPrices.size()-1; i>=0; i--)
      {
         itemPrices.remove(i);
      }
   }


   //=============displayAll=====================
   /**
      Displays the prices of all items in the current sale.
   */
   public void displayAll()
   {
      for (int i=0; i<itemPrices.size(); i++)
      {
         double price=itemPrices.get(i);
         System.out.println(price);
      }
   }


}