package example;

class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Dog-specific method
    public void fetch() {
        System.out.println("Dog is fetching a ball");
    }
}

// Test class
public class Method_overriding_try {
    public static void main(String[] args) {
        //Animal animalDog = new Dog();   // Polymorphic reference

        //animalDog.makeSound();  // Outputs: Dog barks
        // animalDog.fetch(); // Compile-time error: cannot find symbol
    	
    	Dog obj = new Dog();
    	obj.makeSound();
    	
    	Animal obj1 = new Animal();
    	obj1.makeSound();
    }
}