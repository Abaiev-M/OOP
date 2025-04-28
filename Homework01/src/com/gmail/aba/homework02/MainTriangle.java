package com.gmail.aba.homework02;

/*
Описать класс Треугольник. В качестве свойств возьмите длины сторон треугольника.
Реализуйте метод, который будет возвращать площадь этого треугольника. Создайте
несколько объектов этого класса и протестируйте их.
*/

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle(0.5, 0.4, 0.3);
        Triangle triangleTwo = new Triangle(3.5, 2.4, 4.3);
        Triangle triangleThree = new Triangle(3.5, 3.4, 5.3);

        System.out.println(triangleOne.returnAreaOfTheTriangle());
        System.out.println(triangleTwo.returnAreaOfTheTriangle());
        System.out.println(triangleThree.returnAreaOfTheTriangle());

    }
}
