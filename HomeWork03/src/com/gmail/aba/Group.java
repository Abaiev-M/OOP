package com.gmail.aba;

import com.gmail.aba.Exception.GroupOverflowException;
import com.gmail.aba.Exception.StudentNotFoundException;

import java.util.Arrays;

public class Group {
    private String groupName;

    private final Student[] students = new Student[10];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public Group() {
    }

    public void addStudent(Student student) throws GroupOverflowException {
        if (student == null) throw new RuntimeException("Student is null");

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        } throw new GroupOverflowException("Group is full");
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if ( students[i] != null && students[i].getLastName().equals(lastName)) {
                return students[i];
            }
        } throw new StudentNotFoundException("Student not found");
    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                return true;
            }
        } return false;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void showStudents() {
        int count = 1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(count + " ) " + students[i] + " " + groupName);
                count++;
            }
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", studens=" + Arrays.toString(students) +
                '}';
    }
}
