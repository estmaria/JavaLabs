import java.lang.reflect.*;
public class ListDemo
{
   public static void main(String[] args)
   {
      LinkedList names = new LinkedList();
      names.addFirst("Tom");
      names.addFirst("Romeo");
      names.addFirst("Harry");
      names.addFirst("Dick");

      ListIterator iterator = names.listIterator();
      iterator.next();
      iterator.next();
      iterator.remove();
      iterator.next();
      iterator.remove();
      iterator.add("Juliet");
      iterator.next();
      iterator.set("Emily");

      names.removeFirst();

      iterator = names.listIterator();
      while (iterator.hasNext())
         System.out.print(iterator.next() + " ");
      System.out.println();
      System.out.println("Expected: Juliet Emily");
      System.out.println(names.size());
      System.out.println("Expected: 2");

      // Let's make sure that the field currentSize is used
      // You can ignore this.
      try 
      {
         Class kls = names.getClass();
         Field sizeField = kls.getDeclaredField("currentSize");
         sizeField.setAccessible(true);
         Object currentSize = sizeField.get(names);
         System.out.println(currentSize);
      }
      catch (Exception e) 
      {
         System.out.println("Cannot use the currentSize field.");
         System.out.println(e);
      }
      System.out.println("Expected: 2");
   }
}
