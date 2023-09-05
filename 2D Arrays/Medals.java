/**
This program prints a table with some stats of a basketball game.
*@author Maria Esteban
*@version 1.0
*@since 2023-02-15
*/
public class Medals
{
   public static void main(String[] args)
   {
      final int PLAYERS = 5;
      final int STATS = 4;

      String[] players =
         {
            "Ashley Schindele",
            "Sara Kottke",
            "Skylar Cotten",
            "Ashanti Boykin",
            "Kaylee Hunter",
         };

      int[][] stats =
         {
            { 25, 8, 2, 12 },
            { 32, 12, 1, 10 },
            { 30, 2, 2, 6 },
            { 30, 2, 3, 3 },
            { 30, 2, 3, 2},
         };
      
      System.out.println("            Name     Min     Reb       A     Pts");
      
      // Print countries, counts, and row totals
      for (int i = 0; i < PLAYERS; i++)
      {
         // Process the ith row
         System.out.printf("%16s", players[i]);

         // Print each row element and update the row total
         for (int j = 0; j < STATS; j++)
         {
            System.out.printf("%8d", stats[i][j]);
         }
         
         System.out.println( );
      }
   }
}

