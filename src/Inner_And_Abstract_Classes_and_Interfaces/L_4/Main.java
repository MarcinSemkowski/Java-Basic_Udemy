package Inner_And_Abstract_Classes_and_Interfaces.L_4;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
      Animal parrot = new Parrot("Australian ringneck");
      parrot.eat();
      parrot.breathe();
      ((Parrot) parrot).fly();

      Animal penquin = new Penquin("Emperor");
      ((Penquin) penquin).fly();

    }
}
