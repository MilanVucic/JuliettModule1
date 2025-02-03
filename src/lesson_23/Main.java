package lesson_23;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(
                    "C:\\Users\\vucic\\IdeaProjects\\JuliettModule1\\test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("asdasdas");
            fileWriter.flush();
            System.out.println("YO");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
