package pl.edu.wszib.Colections;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {
    public static void main(String[] args) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\gtruty\\IdeaProjects\\JWD\\src\\pl\\edu\\wszib\\Colections\\alice30.txt"));

            Set<String> wordsSet = new TreeSet<>();

            for (String line : allLines) {
                line = line.replaceAll("\\p{Punct}|\\d","");
                String[] wordsArr = line.split(" ");

                for (String word : wordsArr) {
                    if (!word.isEmpty()){
                        wordsSet.add(word.toLowerCase(Locale.ROOT));
                    }

                }
            }

            /*for (String word : wordsSet) {
                System.out.println(word);
            }*/
            Map<Character, Integer> statMap = new TreeMap<>();
            for (String word :
                    wordsSet) {
                Character currentFirstChar = word.charAt(0);
                if (statMap.containsKey(currentFirstChar)){
                    statMap.put(currentFirstChar,statMap.get(currentFirstChar)+1);
                }else {
                    statMap.put(currentFirstChar,1);
                }
            }

            for (Character c : statMap.keySet()) {
                System.out.println(c + " -> " + statMap.get(c));
            }

          /*  Map<Integer,Character> sortedStatMap = new TreeMap<>(Collections.reverseOrder());
            for (Map.Entry<Character,Integer> entry: statMap.entrySet()) {
                sortedStatMap.put(entry.getValue(),entry.getKey());
            }*/
            Integer biggest = 0;
            Character character = '?';
            for (Map.Entry<Character,Integer> entry: statMap.entrySet()) {
               if (entry.getValue() > biggest){
                   biggest = entry.getValue();
                   character = entry.getKey();
               }
            }

            System.out.println("Najwięcej różnych wyrazów zaczyna się na litere " +character + " jest to liczba " + biggest);


            System.out.println("\nLiczba wszystkich różnych wyrazów to: " +wordsSet.size());

        } catch (Exception e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku");
            e.printStackTrace();
        }
    }
}
