package Polymorphisam;

class Animall {
    void makeSound() {
        System.out.println("Animal sound"); // 
    }
}

class Dogg extends Animall {
    @Override
    void makeSound() {
        System.out.println("Bark"); // 
    }
}

class Catt extends Animall {
    @Override
    void makeSound() {
        System.out.println("Meow"); // 
    }
}

class Lion extends Animall {
    @Override
    void makeSound() {
        System.out.println("Roar"); // 
    }
}

public class UsingArray {
    public static void main(String[] args) {
        Animall[] animals = new Animall[4]; // Array of Animal type 
        animals[0] = new Animall(); // 
        animals[1] = new Dogg(); // 
        animals[2] = new Catt();  
        animals[3] = new Lion();  

        for (Animall animal : animals) { // Iterating through the array
            animal.makeSound();  
        }
    }
}
