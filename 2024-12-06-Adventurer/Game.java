import java.util.Scanner;
public class Game{
  public static void main(String[] args){
    Adventurer P2 = new Warrior("Crabshoe", 15);
    Adventurer P1 = new Warrior("Josh Allen", 17);

    System.out.println(P1.getName() + ", " + P1.getHP() + "/" + P1.getmaxHP() + " HP, " + P1.getSpecial() + "/" + P1.getSpecialMax() + " Rage" );
    System.out.println(P2.getName() + ", " + P2.getHP() + "/" + P2.getmaxHP() + " HP, " + P2.getSpecial() + "/" + P2.getSpecialMax() + " Rage" );
    //You can do the rest many times:
    Scanner userInput = new Scanner(System.in);
    
    int counter = 0;
    while(P2.getHP() > 0){
      
      if (counter % 2 == 0){
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    //Read one line of user input
    String input = userInput.nextLine();
        counter ++;
      if (input.equals("a") || input.equals("attack")){
        System.out.println(P1.attack(P2));
      }
      else if (input.equals("sp") || input.equals("special")){
        System.out.println(P1.specialAttack(P2));
      }
      else if (input.equals("su") || input.equals("support")){
        System.out.println(P1.support());
        
      }
      else if (input.equals("quit")){
        break;
        
      }
    }
     if (counter % 1 == 0){
      counter ++;
      int random = (int)(Math.random()*3);
      if (random == 0){
        System.out.println(P2.attack(P1));
      }
      if (random == 1){
        System.out.println(P2.specialAttack(P1));
      }
       if (random == 2) {
        System.out.println(P2.support());
      }
      
    }
    }
    //Do something with the input
    userInput.close();
    if (P1.getHP() == 0){
      System.out.println("Winner is " + P2.getName());
    }
    else{
      System.out.println("Winner is " + P1.getName());
    }
  }
}
