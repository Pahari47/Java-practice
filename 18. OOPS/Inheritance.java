public class Inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }    
}

// Base class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;
    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammal {
    String breed;
}

// Derived Class
class Fish extends Mammal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Bird extends Mammal {
    int fins;

    void Fly() {
        System.out.println("swims in water");
    }
}
