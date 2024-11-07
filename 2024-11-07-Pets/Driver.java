public class Driver{

  public static void main (String[] args) {
    Animal animal1 = new Animal("hello world", 10000, "Bulbasaur");
    animal1.speak();
    Bird bird1 = new Bird ("good morning", 72 , "Charmander", 160.0, "yellow");
    bird1.speak();
  }
}
