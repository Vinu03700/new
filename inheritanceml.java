// Base class (Grandparent)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for: " + name);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Intermediate class (Parent) inheriting from Animal
class Mammal extends Animal {
    String furColor;

    public Mammal(String name, String furColor) {
        super(name); // Call the constructor of the Animal class
        this.furColor = furColor;
        System.out.println("Mammal constructor called for: " + name + ", fur color: " + furColor);
    }

    public void breathe() {
        System.out.println(name + " is breathing air.");
    }
}

// Derived class (Child) inheriting from Mammal
class Dog extends Mammal {
    String breed;

    public Dog(String name, String furColor, String breed) {
        super(name, furColor); // Call the constructor of the Mammal class
        this.breed = breed;
        System.out.println("Dog constructor called for: " + name + ", fur color: " + furColor + ", breed: " + breed);
    }

    public void bark() {
        System.out.println(name + " (a " + breed + ") says Woof!");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the grandchild class (Dog)
        Dog myDog = new Dog("Buddy", "Golden", "Golden Retriever");
        System.out.println("\n--- My Dog Details ---");
        System.out.println("Name: " + myDog.name);      // Inherited from Animal
        System.out.println("Fur Color: " + myDog.furColor); // Inherited from Mammal
        System.out.println("Breed: " + myDog.breed);    // Specific to Dog

        myDog.eat();     // Inherited from Animal
        myDog.breathe(); // Inherited from Mammal
        myDog.bark();    // Specific to Dog
    }
}