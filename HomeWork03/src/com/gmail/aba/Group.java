package com.gmail.aba;

import com.gmail.aba.Exception.GroupOverflowException;
import com.gmail.aba.Exception.StudentNotFoundException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

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

    public void sortStudentsByLastName(Student[] students) {
        Arrays.sort(students, Comparator.nullsLast(new StudentLastNameComparator()));
    }

    public Student[] getStudents() {
        return students;
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

    public boolean hasDuplicateStudents() {
        for (int i = 0; i < students.length; i++) {
            Student s1 = students[i];
            if (s1 == null) continue;
            for (int j = i + 1; j < students.length; j++) {
                Student s2 = students[j];
                if (s2 == null) continue;
                if (s1.equals(s2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(groupName, group.groupName) && Objects.deepEquals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, Arrays.hashCode(students));
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", studens=" + Arrays.toString(students) +
                '}';
    }
}
