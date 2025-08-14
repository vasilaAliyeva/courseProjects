package fileReadWrite;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

//serializable olmalidi
// java io ve ya java nio ola biler

public class WriteToText {
    public static void main(String[] args) throws IOException {

        writer(new Person("Vasila", 21));

    }

    public static void writer(Person person) throws IOException {
        Path path = Paths.get("C:/Users/HP/IdeaProjects/Application/src/fileReadWrite/test.txt");

//        Files.write(path, Arrays.asList("\n", "List 1", "List 2"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

       
        List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);
    }
}

class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
