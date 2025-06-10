package com.gmail.aba;

import com.gmail.aba.Exception.GroupOverflowException;
import com.gmail.aba.Exception.StudentNotFoundException;

import java.util.*;

public class Group {
    private String groupName;
    private final List<Student> students = new ArrayList<>();

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public Group() {
    }

    public void addStudent(Student student) throws GroupOverflowException {
        if (student == null) throw new RuntimeException("Student is null");

        if (students.size() >= 10) {
            throw new GroupOverflowException("Group is full");
        }
        students.add(student);
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (Student st : students) {
            if (st.getLastName().equals(lastName)) {
                return st;
            }
        } throw new StudentNotFoundException("Student not found");
    }

    public boolean removeStudentByID(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                System.out.println("student is removed");
                return true;
            }
        }
        return false;
    }

    public void sortStudentsByLastName() {
        students.sort(new StudentLastNameComparator());
    }

    public List<Student> getStudents() {
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
        for (Student st : students) {
            System.out.println(count + " ) " + st + " " + groupName);
            count++;
        }
    }

    public boolean hasDuplicateStudents() {
        for (int i = 0; i < students.size(); i++) {
            Student s1 = students.get(i);
            for (int j = i + 1; j < students.size(); j++) {
                Student s2 = students.get(j);
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
        return Objects.equals(groupName, group.groupName) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", studens=" + students +
                '}';
    }
}
