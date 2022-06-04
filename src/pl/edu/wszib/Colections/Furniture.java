package pl.edu.wszib.Colections;

import java.util.HashSet;
import java.util.Set;

public class Furniture {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Adde","Ikea",2016);
        Chair chair2 = new Chair("Janinge","Ikea",2016);
        Chair chair3 = new Chair("Adde","Ikea",2015);
        Chair chair4 = new Chair("Adde","Ikea",2016);

        Set<Chair> chairs = new HashSet<>();
        chairs.add(chair1);
        chairs.add(chair2);
        chairs.add(chair3);
        chairs.add(chair4);

        System.out.println(chairs);
        chairs.remove(new Chair("Adde","Ikea",2016));
        System.out.println(chairs);


    }
}
