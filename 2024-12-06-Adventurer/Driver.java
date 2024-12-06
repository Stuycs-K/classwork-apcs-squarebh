public class Driver {
    public static void main(String[] args){
        Adventurer p1 = new Warrior ("Jerry", 10);
        System.out.println(p1);
        System.out.println(p1.getSpecialName());
        System.out.println(p1.getSpecial());
        p1.setSpecial(2);
        System.out.println(p1.getSpecial());
        System.out.println(p1.getSpecialMax());

    }
    
}
