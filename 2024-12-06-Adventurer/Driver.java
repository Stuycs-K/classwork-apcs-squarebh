public class Driver {
    public static void main(String[] args){
        Adventurer p1 = new Warrior ("Jerry", 10);
        Adventurer p2 = new Warrior ("Bob", 10);
        System.out.println(p1);
        System.out.println(p1.getSpecialName());
        System.out.println(p1.getSpecial());
        p1.setSpecial(2);
        System.out.println(p1.getSpecial());
        System.out.println(p1.getSpecialMax());
        System.out.println(p1.attack(p2));
        System.out.println(p1.support(p2));
        System.out.println(p1.support());
        System.out.println(p1.specialAttack(p2));

    }
    
}
