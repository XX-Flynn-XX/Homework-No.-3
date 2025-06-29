package ru.aston.homework;

public class Main {
    public static void main(String[] args) {
        FileOperations fileOperations = new FileOperations();
        String fileName = "example.txt";
        String dataToWrite = "Hello, World!\\This is a test.";

        try {
            fileOperations.writeToFile(fileName, dataToWrite);
            System.out.println("Данные успешно записаны в файл.");

            String dataRead = fileOperations.readFromFile(fileName);
            System.out.println("Данные, прочитанные из файла:");
            System.out.println(dataRead);
        } catch (CustomFileException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}