public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static void main(String[] args)

  {
    System.out.println("\u001b[48;2;255;0;0m");
    System.out.println("\u001b[48;2;255;127;0m");
    System.out.println("\u001b[48;2;255;255;0m");
    System.out.println("\u001b[48;2;0;255;0m");
    System.out.println("\u001b[48;2;0;0;255m");
    System.out.println("\u001b[48;2;75;0;130");
    System.out.println("\u001b[48;2;148;0;211m");
    //System.out.println("\u001b[36mJosh Allen MVP");
    /*
    for(int r = 0; r < 256; r+=32){
      for(int g = 0; g <= 256; g+=32){
        for(int b = 0; b <= 256; b+=32){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
      System.out.println();
    }
    */
  }
}
