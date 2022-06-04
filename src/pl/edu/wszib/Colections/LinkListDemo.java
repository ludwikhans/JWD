package pl.edu.wszib.Colections;

import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

    public static void main(String[] args) {
        List<String> elements = new LinkedList<>();
        elements.add("pierwszy");
        elements.add("drugi");
        elements.add("drugi");
        elements.add("trzeci");
        elements.add("czwarty");
        elements.add(0,"zerowy");
        System.out.println(elements);
        elements.remove("drugi");
        System.out.println(elements);
    }
}
