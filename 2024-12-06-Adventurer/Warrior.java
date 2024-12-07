public class Warrior extends Adventurer{
    private int rage, maxRage;
    public Warrior(String name)
    {
        super(name);
        this.rage = 10;
        this.maxRage = 20;
    }
    public Warrior (String name, int hp)
    {
        super(name,hp);
        this.rage = 10;
        this.maxRage = 20;
    }
    public  String getSpecialName(){
        return "rage";
    }
  //accessor methods
  public  int getSpecial(){
    return rage;
  }
  public  void setSpecial(int n){
    rage = n;
  }
  public  int getSpecialMax(){
    return maxRage;
  }
 
  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  
  public  String attack(Adventurer other){
    other.applyDamage(5);
    return this.getName() + " dealt 5 damge to " + other.getName();
  }

  //heall or buff the target adventurer
  public  String support(Adventurer other){
    other.applyDamage(-5);
    return this.getName() + " healed 5 damge to " + other.getName();
  }

  //heall or buff self
  public  String support(){
    this.applyDamage(-5);
    return this.getName() + " healed 5 damge to themselves";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public  String specialAttack(Adventurer other)
  {
    other.applyDamage(10);
    
    return "";
  }

}