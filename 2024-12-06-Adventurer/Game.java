public class Game{
  public static void main(String[] args){
    Adventurer P1 = new Warrior("Crabshoe", 15);
    Adventurer P2 = new Warrior("Josh Allen", 17);

    System.out.println(P1.getName() + ", " + P1.getHP() + "/" + P1.getmaxHP() + " HP, " + P1.getSpecial() + "/" + P1.getSpecialMax() + " Rage" );
    System.out.println(P2.getName() + ", " + P2.getHP() + "/" + P2.getmaxHP() + " HP, " + P2.getSpecial() + "/" + P2.getSpecialMax() + " Rage" );
    //You can do the rest many times:
    Scanner userInput = new Scanner(System.in);
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    //Read one line of user input
    String input = userInput.nextLine();
    while(other.getHP() > 0){
      if (input.equals("a") || input.equals("attack")){
        System.out.println(P1.attack(P2));
      }
      if (input.equals("sp") || input.equals("special")){
        System.out.println(P1.specialAttack(P2));
      }
      if (input.equals("su") || input.equals("support")){
        System.out.println(P1.attack(P2));
      }
    }
    //Do something with the input
    System.out.println("Username is: " + userName);
  }
}
