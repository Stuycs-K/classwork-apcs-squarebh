import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Driver
{
  public static int getCode(String filename)
  {
    try{
      int[][] codeVals = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
      int currentRow = 1;
      int currentColumn = 1;
      String final = "";
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      while(input.hasNextLine())
      {
        String hold = input.nextLine();
        int holdInt = 0;
        for (int i = 1; i < hold.length; i++)
        {
          if (hold.substring(0,i).equals("U"))
          {
            if !(currentRow = 0)
            {
              currentRow -= 1;
            }
            holdInt = codeVals[currentRow][currentColumn];
          }
        }
      }
