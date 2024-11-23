import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day2A
{
  public static String getCode(String filename)
  {
    try{
      String[][] codeVals = new String[][] {{"0","0","1","0","0"},{"0","2","3","4","0"},{"5","6","7","8","9"},{"0","A","B","C","0"},{"0","0","D","0","0"}};
      
      String result = "";
      File file = new File(filename);//1
      int currentRow = 2;
      int currentColumn = 0;
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
            if ( codeVals[currentRow][currentColumn].equals("0"))
            {
              holdString = codeVals[currentRow + 1][currentColumn];
              currentRow += 1;
            }
            else{
            holdString = codeVals[currentRow][currentColumn];
            }
          }
          else if (hold.substring(i,i+1).equals("R"))
          {
            if ( currentColumn != 4)
            {
              currentColumn += 1;
            }
            if ( codeVals[currentRow][currentColumn].equals("0"))
            {
              holdString = codeVals[currentRow][currentColumn - 1];
              currentColumn -= 1;
            }
            else{
            holdString = codeVals[currentRow][currentColumn];
            }
          }
          else if (hold.substring(i,i+1).equals("D"))
          {
            if (!( currentRow == 4))
            {
              currentRow += 1;
            }
            if ( codeVals[currentRow][currentColumn].equals("0"))
            {
              holdString = codeVals[currentRow - 1][currentColumn];
              currentRow -= 1;
            }
            else{
            holdString = codeVals[currentRow][currentColumn];
            }
          }
          else if (hold.substring(i,i+1).equals("L"))
          {
            if ( currentColumn != 0)
            {
              currentColumn -= 1;
            }
            if ( codeVals[currentRow][currentColumn].equals("0"))
            {
              holdString = codeVals[currentRow][currentColumn+1];
              currentColumn += 1;
            }
            else{
            holdString = codeVals[currentRow][currentColumn];
            }
          }
        }
        result = result + holdString;
      }
      input.close();
      return result;
    }

    catch (FileNotFoundException e) {
      System.out.println("File not found");
      return "";
   }
  }
  public static void main(String[] args){
    System.out.println(getCode("input.txt"));
   }
}
