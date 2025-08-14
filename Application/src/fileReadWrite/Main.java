package fileReadWrite;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/HP/IdeaProjects/Application/src/fileReadWrite/data.txt"));
//        while (reader.readLine()!=null){
//            String st = reader.readLine();
//
//        }


        PrintWriter writer = new PrintWriter(new FileWriter("C:/Users/HP/IdeaProjects/Application/src/fileReadWrite/data.txt", true));

        writer.append("salam");

        writer.println("salam");
        writer.println("2434");
        writer.println(reader.readLine());

        reader.lines()
                .forEach(System.out::println);

        writer.close();

        Path path  = Paths.get("C:/Users/HP/IdeaProjects/Application/src/fileReadWrite/data.txt");

        Files.write(path, Arrays.asList("\n", "Line 1", "Line 2"));


    }
}
