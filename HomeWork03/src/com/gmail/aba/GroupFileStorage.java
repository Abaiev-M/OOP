package com.gmail.aba;

import com.gmail.aba.Exception.GroupOverflowException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GroupFileStorage {

    public void saveGroupToCSV(Group gr) {

        File file = new File(gr.getGroupName() + ".csv");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Student student : gr.getStudents()) {
                if (student != null) {
                    bw.write(student.toCSV());
                    bw.newLine();
                }
            }
            System.out.println(file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Group loadGroupFromCSV(File file) {
        Group group = new Group(file.getName().replace(".csv", ""));
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Student student = Student.fromCSV(line);
                if (student != null) {
                    try {
                        group.addStudent(student);
                    } catch (GroupOverflowException e) {
                        System.out.println(e.getMessage() + student);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return group;
    }

    public File findFileByGroupName(String groupName, File workFolder) {
        File[] files = workFolder.listFiles((dir, name) -> name.equals(groupName + ".csv"));
        if (files != null && files.length > 0) {
            return files[0];
        }
        return null;
    }


}
