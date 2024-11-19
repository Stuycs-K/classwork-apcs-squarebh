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
      int counter = 1;
      int countL = 0;
      int countR = 0;
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      
      
      while(input.hasNext())
      {
        String hold = input.next();
        if (counter % 2 == 1)
        {
          if (countR == 2 || countL == 2)
          {
            totalHor = totalHor - Integer.parseInt(hold.substring(1,hold.length()-1));
            if (hold.substring(0,1).equals("R")){countR += 1;}
          else{
          countL = 0;
          }
          counter += 1;
          }
          else if (hold.substring(0,1).equals("R")){
          totalHor = totalHor + Integer.parseInt(hold.substring(1,hold.length()-1));
          countR += 1;
          countL = 0;
          counter += 1;
          }
          else if (hold.substring(0,1).equals("L")){
            totalHor = totalHor - Integer.parseInt(hold.substring(1,hold.length()-1));
            countR = 0;
            countL +=1;
            counter += 1;
          }
        }
        else 
        {
          if (countR == 2 || countL == 2)
          {
            totalVer = totalVer - Integer.parseInt(hold.substring(1,hold.length()-1));
            if (hold.substring(0,1).equals("R")){countR += 1;}
            else{
            countL = 0;
            }
          counter += 1;
          }
          else if (hold.substring(0,1).equals("R")){
          totalVer = totalVer + Integer.parseInt(hold.substring(1,hold.length()-1));
          countR += 1;
          countL = 0;
          counter += 1;
          }
          else if (hold.substring(0,1).equals("L")){
            totalVer = totalVer + Integer.parseInt(hold.substring(1,hold.length()-1));
            countR = 0;
            countL += 1;
            counter += 1;
            }
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