import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {

        String binary = "1010101010101011";
        Long results = 0L;

        // 1 1 0 1 - liczba binarna
        // 0 1 2 3  - indeks(i)
        // 3 2 1 0 - indeks odwrócony (długość - 1 - i)
        // 1 * 2^3 + 1*2^2 + 0*2^1 + 1*2^0

        /*int i = 3;
        char c = binary.charAt(i);
        int bit = Character.getNumericValue(c);
        System.out.println(bit);
        System.out.println(c);*/


        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 -i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);
            results += bit * (int)Math.pow(2,i);


        }

        System.out.println("Binarnie " + binary + " to " + results + " dziesiętnie");

        }
    }

