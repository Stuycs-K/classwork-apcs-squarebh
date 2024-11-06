import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static void main (String[] args) {
    //System.out.println(isTri(5, 5, 2));
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
}
public static int countTrianglesA(String filename) {
    try{
    int counter = 0;
    int x, y, z = 0;
    File file = new File(filename);//1
    Scanner input = new Scanner(file);
    while( input.hasNextInt()){
        
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        if(input.hasNextLine()){
        input.nextLine();
        }
      if (isTri(x, y, z)) {
          counter += 1;
      }
    }
    input.close();
    return counter;
}catch (FileNotFoundException ex) {
    //File not found what should you do?
    System.out.println("File not found");
    return -1; //you can return from a void function just don't put a value.
  }
}
public static int countTrianglesB(String filename)
{
    try{
        int[] column1 = new int[3];
        int[] column2 = new int [3];
        int[] column3 = new int [3];
        int counter = 0;
        File file = new File(filename);//1
        Scanner input = new Scanner(file);
        while(input.hasNextInt()){
            column1[0] = input.nextInt();
            column2[0] = input.nextInt();
            column3[0] = input.nextInt();
            input.nextLine();
            column1[1] = input.nextInt();
            column2[1] = input.nextInt();
            column3[1] = input.nextInt();
            input.nextLine();
            column1[2] = input.nextInt();
            column2[2] = input.nextInt();
            column3[2] = input.nextInt();
            if(input.hasNextLine()){
            input.nextLine();
            }
          if (isTri(column1[0],column1[1],column1[2])) {
              counter += 1;
          }
          if (isTri(column2[0],column2[1],column2[2])) {
            counter += 1;
        }
        if (isTri(column3[0],column3[1],column3[2])) {
            counter += 1;
        }
        }
        input.close();
        return counter;
    }catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return -1; //you can return from a void function just don't put a value.
      }
}
  public static boolean isTri(int a, int b, int c) {
    return (a + b > c && a + c > b && b + c > a);
  }
}