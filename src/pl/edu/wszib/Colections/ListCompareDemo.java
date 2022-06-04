package pl.edu.wszib.Colections;

import java.util.*;

public class ListCompareDemo {
    public static final int MAX_VAL = 1000000;
    public static void main(String[] args) {
        List<Integer>list = new LinkedList<>();
        fill(list); //uzupełnianie listy
        long startTime = System.currentTimeMillis();
        inserInMiddle(list);//wstawiać dokładnie w połowie elementy 10% maksymalnej wartości
        long totalTime = System.currentTimeMillis()-startTime;
        System.out.println(totalTime + " milisekundy");


      
    }

    private static void inserInMiddle(List<Integer> list) {
       int half = MAX_VAL/2;
       int part = MAX_VAL / 10;
        ListIterator iter = list.listIterator(half);
        for (int i = 1; i <= part ; i++) {
            iter.add(0);

        }
            
        }


    private static void fill(List<Integer> list) {
        Random random = new Random();
        for (int i = 1; i <= MAX_VAL; i++) {
            int r = random.nextInt(100);
            list.add(r);
        }
    }
}
