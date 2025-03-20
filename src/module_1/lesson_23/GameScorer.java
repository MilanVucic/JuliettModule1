package module_1.lesson_23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameScorer {
    public static void main(String[] args) {
        List<HighScorer> highScorers = readHighscoresFromFile();

        displayHighScores(highScorers);

        saveResultsToFile(highScorers);
    }

    private static void displayHighScores(List<HighScorer> highScorers) {
        for (int i = 0; i < highScorers.size(); i++) {
            System.out.println(i + 1 + ". " + highScorers.get(i).getName() + ": " + highScorers.get(i).getPoints());
        }
    }

    private static List<HighScorer> readHighscoresFromFile() {
        List<HighScorer> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("highscores.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] parts = line.split(" - ");
                HighScorer highScorer = new HighScorer(parts[0].trim(), Integer.parseInt(parts[1].trim()));
                list.add(highScorer);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private static void saveResultsToFile(List<HighScorer> list) {
        Collections.sort(list);
        try {
            FileWriter fileWriter = new FileWriter("highscores.txt");
            StringBuilder stringBuilder = new StringBuilder();
            for (HighScorer hs : list) {
                stringBuilder.append(hs).append("\n");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            fileWriter.write(stringBuilder.toString());
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
