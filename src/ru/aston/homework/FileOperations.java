package ru.aston.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

    public void writeToFile(String fileName, String data) throws CustomFileException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        } catch (IOException e) {
            throw new CustomFileException("Ошибка при записи в файл: " + fileName, e);
        }
    }

    public String readFromFile(String fileName) throws CustomFileException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new CustomFileException("Ошибка при чтении из файла: " + fileName, e);
        }
        return content.toString();
    }
}