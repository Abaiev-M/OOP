package com.gmail.aba;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String sourceDir = "/Users/mishaabaiev/JAVA/test";
        String targetDir = "/Users/mishaabaiev/JAVA/ProgAcademy/Java Lessons/OOP/HomeWork04/src/com/gmail/aba";
        String extension = ".pdf";

        try {
            FileService.copyFilesWithExtension(sourceDir, targetDir, extension);
            System.out.println("Файлы скопированы успешно.");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании: " + e.getMessage());
        }
    }
}
