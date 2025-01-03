import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Day6A {
    public static char findCommon (String string)
    {
        int total = 0;
        char leastCommon = ' ';
        int countLowest= 1;
        for (int lowest = 97; lowest < 123; lowest++)
        {
        total = 0;
        for (int i = 0; i < string.length(); i ++)
        {
            if (string.charAt(i) == ((char)(lowest)))
            {
                total++;
            }
        }
        
        if ((total < countLowest) && (total != 0))
        {
            countLowest = total;
            leastCommon = ((char)lowest);
        }
        else if (countLowest == 0)
        {
            countLowest = total;
        }
    }
    return leastCommon;
    }
    public static String findReal ( String filename)
    {
    try{
    File file = new File(filename);//1
    Scanner input = new Scanner(file);
    String result = "";
    String[] holdArray = new String[]{"","","","","","","","","",""};
    while(input.hasNextLine())
    {
        String hold = input.nextLine();
        
        for (int i = 0; i < hold.length(); i ++)
        {
            holdArray[i] += hold.substring(i,i+1);
           
        }
        
    }
    for (int x = 0; x < holdArray.length; x++)
    {
        result += findCommon(holdArray[x]);
    }
    input.close();
    return result;
    }
    catch (FileNotFoundException e) {
        System.out.println("File not found");
        return "";
     }
    }

    public static void main(String[] args) {
        System.out.println(findReal("input.txt"));
    }
}
