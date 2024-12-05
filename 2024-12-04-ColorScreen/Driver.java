public class Driver{
  public static final int BRIGHT = 1;
public static final int DARK = 2;
public static final int ITALICS = 3;
//COLORS
public static final int BLACK = 30;
public static final int RED = 31;
public static final int GREEN = 32;
public static final int YELLOW = 33;
public static final int BLUE = 34;
public static final int MAGENTA = 35;
public static final int CYAN = 36;
public static final int WHITE = 37;
//CONTROLS
public static final String CLEAR_SCREEN =  "\033[2J";
public static final String HIDE_CURSOR =  "\033[?25l";
public static final String SHOW_CURSOR =  "\033[?25h";
public static final String RESET = "\033[0m"+SHOW_CURSOR;
  public static void createBorder()
  {
    System.out.print(CLEAR_SCREEN);
  System.out.print(HIDE_CURSOR);
    Text.go(1,1);
    Text.color(BLUE, Text.background(BLUE));
    for (int i = 0; i < 80; i++)
    { 
      System.out.print(".");
    }
    for (int i = 0; i < 31; i++)
    { 
      Text.go(i,1);
      System.out.print(".");
      Text.go(i,81);
      System.out.println(".");
    }
    Text.go(30,1);
    for (int i = 0; i < 80; i++)
    { 
      System.out.print(".");
    }
  }
  public static void main(String[] args)
  {
    
    createBorder();
    int[] anArray = new int[3];
    for (int i = 0; i < anArray.length;i ++)
    {
      anArray[i] = (int)(Math.random()*100);
    }
    System.out.print("\u001b[0m");
    Text.go(2,20);
    if (anArray[0] < 25){
      System.out.print("\u001b[31;1m" + anArray[0]);
      System.out.print("\u001b[0m");
    }
    if (anArray[0] > 75){
      System.out.print("\u001b[32;1m" + anArray[0]);
      System.out.print("\u001b[0m");
    }
    if (anArray[0] >= 25 && anArray[0] <= 75){
      System.out.print("\u001b[37;1m" + anArray[0]);
      System.out.print("\u001b[0m");
    }
    
    
    Text.go(2,40);
    if (anArray[1] < 25){
      System.out.print("\u001b[31;1m" + anArray[1]);
      System.out.print("\u001b[0m");
    }
    if (anArray[1] > 75){
      System.out.print("\u001b[32;1m" + anArray[1]);
      System.out.print("\u001b[0m");
    }
    if (anArray[1] >= 25 && anArray[1] <= 75){
      System.out.print("\u001b[37;1m" + anArray[1]);
      System.out.print("\u001b[0m");
    }
    
    Text.go(2,60);
    if (anArray[2] < 25){
      System.out.print("\u001b[31;1m" + anArray[2]);
      System.out.print("\u001b[0m");
    }
    if (anArray[2] > 75){
      System.out.print("\u001b[32;1m" + anArray[2]);
      System.out.print("\u001b[0m");
    }
    if (anArray[2] >= 25 && anArray[2] <= 75){
      System.out.print("\u001b[37;1m" + anArray[2]);
      System.out.print("\u001b[0m");
    }
    Text.go(3,1);
    Text.color(BLUE, Text.background(BLUE));
    for (int i = 0; i < 80; i++)
    { 
      System.out.print(".");
    }
    Text.go(31,1);
    System.out.println(RESET);
    
  }

}
