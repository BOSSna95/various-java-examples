package org.example.data.logic;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderService {

    public List<String> getFileContent(String filePath) {
        try {
            return Files.readAllLines(Path.of(filePath));
        } catch (IOException e) {
            System.out.printf("File %s does not exist.", filePath);
        }
        catch (SecurityException se) {
            System.out.printf("You do not have access to file %s.", filePath);
        }
        return List.of();
    }





}
