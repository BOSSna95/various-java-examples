package org.example;

import org.example.data.Field;
import org.example.data.logic.FieldService;
import org.example.data.logic.FileReaderService;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        FieldService fieldService = new FieldService();
        FileReaderService fileReaderService = new FileReaderService();

        List<String> fieldsInput =
                fileReaderService.getFileContent("C:\\Users\\User\\Desktop\\Diverse Programme\\various-java-examples\\" +
                        "Größere Beispiele und eigene Projekte\\FIleToFields\\Fields.txt");

        if (fieldsInput.isEmpty()) {
            return;
        }

        List<Field> fields = new ArrayList<>();

        fieldService.addFields(fieldsInput, fields);

        fields.forEach(field -> {
            System.out.println(field);
        });
    }
}
