package pl.edu.wszib.Colections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek", "456-123-456");
        phones.put("Alicja", "567-123-567");
        phones.put("Tomek", "456-123-456");
        phones.put("Barbara", "789-123-456");

        System.out.println(phones);
        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println();
        System.out.println(phones.get("Barbara"));

        System.out.println();
        for (String key :
                phones.keySet()) {
            System.out.println(key + " -> " + phones.get(key));
        }
        System.out.println();
        for (String value :
                phones.values()) {
            System.out.println(value);
        }

        System.out.println();

        for (Map.Entry entry : phones.entrySet()){
            if (entry.getKey().equals("Tomek")){
            entry.setValue("000-000-000");}
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
