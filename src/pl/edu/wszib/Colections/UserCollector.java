package pl.edu.wszib.Colections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserCollector {
    public static void main(String[] args) {
        Map<Integer, User> userMap = new HashMap<>();
        userMap.put(1, new User("Grzegorz","Truty",28));
        userMap.put(2, new User("Rafał","Ciastoń",23));
        userMap.put(3, new User("Paulina","Papużyńska",27));
        userMap.put(4, new User("Grzegorz","Truty",28));
        userMap.put(5, new User("Grzegorz","Truty",28));
        userMap.put(6, new User("Rafał","Ciastoń",23));

        for (Integer id:
             userMap.keySet()) {
            System.out.println(id + " - " + userMap.get(id));
        }
        System.out.println();
        System.out.println(userMap.get(1));
        System.out.println(userMap.get(4));
    }
}
