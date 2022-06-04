package pl.edu.wszib.Colections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dowolne słowa (w -> wyjście)");
        Set<String> uniqeWords = new HashSet<>();

        while (scanner.hasNext()){
            String word = scanner.next();

            if (word.equals("w")){
                break;
            }
            uniqeWords.add(word);
        }
        System.out.println(uniqeWords.size() + " unikatowych słów");
            }
}
