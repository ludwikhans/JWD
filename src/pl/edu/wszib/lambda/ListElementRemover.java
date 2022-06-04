package pl.edu.wszib.lambda;

import java.util.ArrayList;
import java.util.List;

public class ListElementRemover {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(null);
        l.add(3);
        l.add(null);
        l.add(5);

        System.out.println(l);

        l.removeIf(e -> e == null);
        System.out.println(l);
    }
}
