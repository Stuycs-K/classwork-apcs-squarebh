import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Driver
{
  public static int findDistance(String filename)
  {
    try{
      int totalVer = 0;
      int totalHor = 0;
      int direction  = 0;
      File file = new File(filename);//1
      Scanner input = new Scanner(file);


      while(input.hasNext())
      {
        String hold = input.next();
        int totalBlocks = Integer.parseInt(hold.substring(1,hold.length()-1));
        if(hold.substring(0,1).equals("R"))
        {
          direction += 1;
        }
        else{direction -= 1;}
        if(direction == -1)
        {
          direction = 3;
        }
        if (direction == 5)
        {
          direction = 1;
        }
        if (direction % 4 == 0)
        {
          totalVer += totalBlocks;
        }
        if (direction % 4 == 1)
        {
          totalHor += totalBlocks;
        }
        if (direction % 4 == 2)
        {
          totalVer -= totalBlocks;
        }
        if (direction % 4 == 3)
        {
          totalVer -= totalBlocks;
        }


      }
      input.close();


      return Math.abs(totalHor) + Math.abs(totalVer);

    }
    catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return -1; //you can return from a void function just don't put a value.
      }
  }
    public static void main(String[] args){
     System.out.println(findDistance("input.txt"));
    }
}
