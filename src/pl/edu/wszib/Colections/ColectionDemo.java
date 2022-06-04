package pl.edu.wszib.Colections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ColectionDemo {
    public static void main(String[] args) {

        List<String> l = Arrays.asList("aaa","bbb","ccc","ddd");
        System.out.println(l);
        System.out.println(Collections.frequency(l,"bbb"));
        Collections.shuffle(l);
        System.out.println(l);
    }
}
