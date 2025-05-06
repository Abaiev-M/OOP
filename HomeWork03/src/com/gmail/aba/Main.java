package com.gmail.aba;

import com.gmail.aba.Exception.GroupOverflowException;
import com.gmail.aba.Exception.StudentNotFoundException;

public class Main {
    public static void main(String[] args)  {

        Group group = new Group("group K");
        StudentCreator sc = new StudentCreator();

        try {
            group.addStudent(sc.createStudentFromKeyBoard());
        } catch (GroupOverflowException e) {
            throw new RuntimeException(e);
        }

        Student st1 = new Student("Andrey", "St", Gender.MALE, 1, "k 1-2");
        Student st2 = new Student("Pavlo", "Ts", Gender.MALE, 2, "k 3-1");
        Student st3 = new Student("Sergey", "Ab", Gender.MALE, 3, "k 2-2");
        Student st4 = new Student("Anton", "By", Gender.MALE, 4, "k 1-3");
        Student st5 = new Student("Alina", "Sh", Gender.FEMALE, 5, "k 3-2");

        try {
            group.addStudent(st1);
            group.addStudent(st2);
            group.addStudent(st3);
            group.addStudent(st4);
            group.addStudent(st5);

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
        group.sortStudentsByLastName(group.getStudents());
        System.out.println("--------------------------");

        group.showStudents();

    }
}
