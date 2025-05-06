package com.gmail.aba;

import java.util.Scanner;

public class StudentCreator {

    private Scanner scanner = new Scanner(System.in);

     public Student createStudentFromKeyBoard() {
        System.out.println("Input First name");
        String firstName = scanner.nextLine();

        System.out.println("Input Last name");
        String lastName = scanner.nextLine();

        System.out.println("Input gender (0 for MALE, 1 for FEMALE)");
        Gender gender = Gender.values()[scanner.nextInt()];

        System.out.println("Input id");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input group");
        String group = scanner.nextLine();

        return new Student(firstName, lastName, gender, id, group);
    }
}
