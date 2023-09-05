import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
public class BoysgirlsNames
/** The BoysgirlsNames program reads in babynames80s.txt and produces two files, 
boynames.txt and girlnames.txt, separating the data for the boys and girls. Then
it reads in these two files, store the data into two separates ArrayLists and prints
out the common names.

*@author Maria Esteban
*@version 1.0
*@since 2023-02-26  */

{
    public static void main(String[] args) throws FileNotFoundException
    {
        File babyNames = new File("babynames80s.txt");
        Scanner in = new Scanner(babyNames); //reads the file
        File boyNamesFile = new File ("boynames.txt");
        PrintWriter boyNames = new PrintWriter(boyNamesFile);//open file to write on it
        File girlNamesFile = new File ("girlnames.txt");
        PrintWriter girlNames = new PrintWriter(girlNamesFile);//open file to write on it
        while (in.hasNextLine())
        {
            String line = in.nextLine();//gets the next line of the file
            String[] lineSeparated=line.split("\t"); //separates the line and puts the elements in an array
            String boyName=lineSeparated[1];//grabs the boy name which is the second element
            boyNames.println(boyName);//writes the boy name in the text file of boynames
            String girlName=lineSeparated[3];//grabs the girl name which is the fouth element
            girlNames.println(girlName);//writes the girl name in the text file of girlnames

        }

        //closes scanner and writer
        in.close();
        boyNames.close();
        girlNames.close();
        
        //create array lists to store boys and girls names
        ArrayList<String> boyNamesList = new ArrayList<String>();
        ArrayList<String> girlNamesList = new ArrayList<String>();
        //reads the boynames and girlnames files
        Scanner boys = new Scanner(boyNamesFile);
        Scanner girls = new Scanner(girlNamesFile);
        //stores all the names in the boynames file in the array list
        while (boys.hasNext())
        {
            String name=boys.next();
            boyNamesList.add(name);
        }
        //stores all the names in the girlnames file in the array list
        while (girls.hasNext())
        {
            String name=girls.next();
            girlNamesList.add(name);
        }
        //closes the scanners
        boys.close();
        girls.close();
        //calls for the method
        sharedNames(boyNamesList, girlNamesList);
    }
        /**
        Prints out the common names of two array lists
        @param boyNamesList includes all the boys names
        @param girlNamesList includes all the girls names
        */
        public static void sharedNames( ArrayList<String> boyNamesList, ArrayList<String> girlNamesList)
        {
            for (int i=0; i<boyNamesList.size(); i++)
            {
                String boyName=boyNamesList.get(i);
                for (int j=0; j<girlNamesList.size(); j++)
                {
                    String girlName=girlNamesList.get(j);
                    if (girlName.equals(boyName))
                    {
                        System.out.println(girlName);
                    }
                }
            }
        }
    
}
