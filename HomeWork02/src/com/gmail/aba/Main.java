package com.gmail.aba;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("fish", "black", 3, "Vaska");
        Dog dog = new Dog("meat", "white", 11, "Barsik");
        Veterinarian bob = new Veterinarian("Bob");

        cat.sleep();
        cat.eat();
        System.out.println(cat.getVoice());
        System.out.println(cat.toString());

        System.out.println("----------------");

        dog.sleep();
        dog.eat();
        System.out.println(dog.getVoice());
        System.out.println(dog.toString());

        System.out.println("------------------");
        bob.treatment(cat);
        System.out.println("------------------");
        bob.treatment(dog);


    }
}
