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
    restoreSpecial(2);
    return this.getName() + " smashed " + other.getName() + " for 5 damage and restored two special" ;
  }

  //heall or buff the target adventurer
  public  String support(Adventurer other){
    if(other.getHP() < other.getmaxHP() - 5  ){
    other.applyDamage(-5);
    return this.getName() + " shielded " + other.getName() + " for 5 healing" ;
  }
  else{
    other.setHP(other.getmaxHP());
    return "Healed other to max";
  }
  }

  //heall or buff self
  public  String support(){
    if(getmaxHP() -5 > getHP()){
    this.applyDamage(-5);
    return this.getName() + " shielded themselves for 5 healing points";
  }
  else{
    setHP(getmaxHP());
    return "Healed self to max";
  }
  }

  //hurt or hinder the target adventurer, consume some special resource
  public  String specialAttack(Adventurer other)
  {
    if(getSpecial() > 3){
    other.applyDamage(10);
    this.setSpecial(this.getSpecial()-3);
    return "Super smashed " + other.getName() + " but wasted 3 rage";
  }
  else{
    return "Not enough stamina to use special";
  }
  }

}
