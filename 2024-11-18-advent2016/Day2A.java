import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day2A
{
  public static int getCode(String filename)
  {
    try{
      String[][] codeVals = new String[][] {{"0","0","1","0","0"},{"0","2","3","4","0"},{"5","6","7","8","9"},{"0","A","B","C","0"},{"0","0","D","0","0"}};
      
      String result = "";
      File file = new File(filename);//1
      int currentRow = 1;
      int currentColumn = 1;
      Scanner input = new Scanner(file);
      String holdString = "";
      while(input.hasNextLine())
      {
        String hold = input.nextLine();
        
         
        for (int i = 0; i < hold.length() ; i++)
        {
          
          if (hold.substring(i,i+1).equals("U"))
          {
            if ( currentRow != 0)
            {
              currentRow -= 1;
            }
            holdString = codeVals[currentRow][currentColumn];
          }
          else if (hold.substring(i,i+1).equals("R"))
          {
            if ( currentColumn != 2)
            {
              currentColumn += 1;
            }
            holdString = codeVals[currentRow][currentColumn];
          }
          else if (hold.substring(i,i+1).equals("D"))
          {
            if (!( currentRow == 2))
            {
              currentRow += 1;
            }
            holdString = codeVals[currentRow][currentColumn];
          }
          else if (hold.substring(i,i+1).equals("L"))
          {
            if ( currentColumn != 0)
            {
              currentColumn -= 1;
            }
            holdString = codeVals[currentRow][currentColumn];
          }
        }
        result = result + holdString;
      }
      input.close();
      return Integer.parseInt(result);
    }

    catch (FileNotFoundException e) {
      System.out.println("File not found");
      return -1;
   }
  }
  public static void main(String[] args){
    System.out.println(getCode("input.txt"));
   }
}
