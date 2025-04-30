package com.gmail.aba;

public class Dog extends Animal {
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog(String ration, String color, int weight) {
        super(ration, color, weight);
    }
    public Dog(String name) {
        this.name = name;
    }
    public Dog() {
    }

    public String getVoice() {
        return "Bow-wow!";
    }

    @Override
    public void eat() {
        System.out.println("The dog " + this.name + " is eating " + this.getRation());
    }

    @Override
    public void sleep() {
        System.out.println("The dog " + this.name + " is sleeping");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' + super.toString() +
                '}';
    }
}
