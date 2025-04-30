package com.gmail.aba.homework02;



public class Triangle {
    private double sideA = 0.3;
    private double sideB = 0.4;
    private double sideC = 0.5;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }

    public double returnAreaOfTheTriangle() {
        double p = (sideA + sideB + sideC) / 2;
        double s = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return s;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
