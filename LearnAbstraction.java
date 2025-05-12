abstract class Animal {
    // abstract method (no body)
    abstract void makeSound();  //now all the subclass should necessarily implement it

    // concrete method
    void sleep() {
        System.out.println("Zzz...");
    }
}

// Subclass provides implementation
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class LearnAbstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Woof!
        myDog.sleep();      // Zzz...
    }
}
