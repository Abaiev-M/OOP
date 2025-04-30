package com.gmail.aba;

public class Cat extends Animal {
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat(String ration, String color, int weight) {
        super(ration, color, weight);
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    @Override
    public String getVoice() {
        return "Meow Meow";
    }

    @Override
    public void eat() {
        System.out.println("The cat " + this.name + " is eating " + this.getRation());
    }

    @Override
    public void sleep() {
        System.out.println("The cat " + this.name + " is sleeping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' + super.toString() +
                '}';
    }
}
