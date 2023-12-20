package org.example.data.logic;

import org.example.data.Field;

import java.util.List;
import java.util.stream.Stream;

public class FieldService {

    public void addFields(List<String> fileContent, List<Field> fields) {
        fileContent.stream().map(field -> {
            String[] splittedContent = field.split(",");
//          Arrays.stream(field.split(","));
            return new Field(splittedContent[0],
                    splittedContent[1],
                    splittedContent[2],
                    splittedContent[3],
                    splittedContent[4],
                    splittedContent[5]);
        }).forEach(field -> fields.add(field));
    }


}
