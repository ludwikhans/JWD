package pl.edu.wszib.Colections;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MonteChristo {
    public static void main(String[] args) {

        MonteChristo mc = new MonteChristo();
        List<String> allLines = mc.loadTextFile("src/crsto10.txt");

        if (allLines!= null && !allLines.isEmpty()){
            System.out.println("wczytany plik zawiera " + mc.countLines(allLines) + " linii");
            mc.showEveryHundredLine(allLines);
            mc.showTheLongestVerse(allLines);
        }



    }

    private List<String> loadTextFile(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy ładowaniu pliku");
            e.printStackTrace();
        }
        return null;
    }

    int countLines(List list){
        return list.size();
    }

    void showEveryHundredLine(List list){
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if (i%100 == 0){
                System.out.println(i + " " + list.get(i));
            }
        }
    }

    void showTheLongestVerse(List<String> list){
        String longestLine = "";
        for (String line :
                list) {
            if (line.length() > longestLine.length()){
                longestLine = line;
            }
        }
        System.out.println("\nNajdłuższy wiersz w książce zawiera " + longestLine.length() + " znaki/ów - " + longestLine.toUpperCase());
    }
}
