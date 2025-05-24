package com.gmail.aba;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileService {

    public static void copyFilesWithExtension(String sourceDir, String targetDir, String extension) throws IOException {
        File sourceFolder = new File(sourceDir);
        File[] files = sourceFolder.listFiles();

        if (files == null) {
            throw new IOException("Исходная папка не найдена или пуста.");
        }

        for (File file : files) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(extension)) {
                Path targetPath = Paths.get(targetDir, file.getName());
                Files.copy(file.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Скопирован файл: " + file.getName());
            }
        }
    }
}
