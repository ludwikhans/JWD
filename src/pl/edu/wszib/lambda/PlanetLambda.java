package pl.edu.wszib.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class PlanetLambda {
    public static void main(String[] args) {
        String[] planets = {"Słońce","Merkury","Wenus","Ziemia","Mars","Jowisz","Saturn","Uran","Neptun"};

        Arrays.sort(planets,(o1, o2) -> o1.length()-o2.length());

        Arrays.asList(planets).forEach(System.out::println);
    }
}
