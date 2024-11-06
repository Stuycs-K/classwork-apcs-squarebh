import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static void main (String[] args) {
    //System.out.println(isTri(5, 5, 2));
    System.out.println(countTrianglesA("inputTri.txt"));
}

public static int countTrianglesA(String filename) {
    try{
    int counter = 0;
    int x, y, z = 0;
    File file = new File(filename);//1
    Scanner input = new Scanner(file);
    while(input.hasNextLine() && input.hasNextInt()){
        
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        input.nextLine();
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

  public static boolean isTri(int a, int b, int c) {
    return (a + b > c && a + c > b && b + c > a);
  }

}