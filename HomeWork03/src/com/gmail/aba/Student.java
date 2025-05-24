package com.gmail.aba;

public class Student extends Human {
    private int id;
    private String groupName;

    public Student(String name, String lastName, Gender gender, int id, String groupName) {
        super(name, lastName, gender);
        this.id = id;
        this.groupName = groupName;
    }

    public Student() {
    }

    public String toCSV() {
        return getName() + "," + getLastName() + "," + getGender() + "," + id + "," + groupName;
    }

    public static Student fromCSV(String line) {
        String[] parts = line.split(",");
        if (parts.length != 5) return null;

        String name = parts[0];
        String lastName = parts[1];
        Gender gender = Gender.valueOf(parts[2]);
        int id = Integer.parseInt(parts[3]);
        String groupName = parts[4];

        return new Student(name, lastName, gender, id, groupName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student { " +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                " " + super.toString();
    }
}
