package com.gmail.aba;

import com.gmail.aba.Exception.GroupOverflowException;
import com.gmail.aba.Exception.StudentNotFoundException;

public class Main {
    public static void main(String[] args)  {

        Group group = new Group("group K");

        Student st1 = new Student("Andrey", "St", Gender.MALE, 1, "k 1-2");
        Student st2 = new Student("Pavlo", "Ts", Gender.MALE, 2, "k 3-1");
        Student st3 = new Student("Sergey", "Ab", Gender.MALE, 3, "k 2-2");
        Student st4 = new Student("Anton", "By", Gender.MALE, 4, "k 1-3");
        Student st5 = new Student("Alina", "Sh", Gender.FEMALE, 5, "k 3-2");
        Student st6 = new Student("Yulya", "Mr", Gender.FEMALE, 6, "k 2-2");
        Student st7 = new Student("Anna", "Gr", Gender.FEMALE, 7, "k 3-1");
        Student st8 = new Student("Alex", "Zl", Gender.MALE, 8, "k 2-3");
        Student st9 = new Student("Natasha", "Ys", Gender.FEMALE, 9, "k 3-2");
        Student st10 = new Student("Ira", "Pr", Gender.FEMALE, 10, "k 3-3");
        Student st11 = new Student("Polina", "Mf", Gender.FEMALE, 11, "k 1-1");
        Student stNull = null;


        try {
            group.addStudent(st1);
            group.addStudent(st2);
            group.addStudent(st3);
            group.addStudent(st4);
            group.addStudent(st5);
            group.addStudent(st6);
            group.addStudent(st7);
            group.addStudent(st8);
            group.addStudent(st9);
            group.addStudent(st10);

            //group.addStudent(st11);
        } catch (GroupOverflowException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(group.searchStudentByLastName("St"));
        } catch (StudentNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(group.removeStudentByID(1));
        System.out.println(group.removeStudentByID(1));

        group.showStudents();

    }
}
