package pl.edu.wszib.lambda;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MyFirstLambda {

    public static void main(String[] args) {
        Multiplier m = x -> x * x;
        System.out.println(m.perform(2));

        Introducer i = name -> System.out.println("Cześć mam na imię " + name);
        i.run("Wojtek");
        UnaryOperator<Integer> ua = o -> o*o;
        System.out.println(ua.apply(3));

        Consumer c = o -> System.out.println("Czaeść mam na imię " + o);
        c.accept("Antek");

    }

}

@FunctionalInterface
interface Multiplier{
    int perform(int x);
}

@FunctionalInterface
interface Introducer{
    void run (String name);
}
