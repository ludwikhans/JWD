import java.util.Locale;
import java.util.StringTokenizer;

public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister zawsze spłaca swoje długi.";
        System.out.println("Tekst to: " + str);
        System.out.println("Długość tekstu to: " + str.length());

        StringTokenizer st1;
        st1 = new StringTokenizer(str);
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());
        System.out.println("Token 4: " + st1.nextToken());
        System.out.println("Token 5: " + st1.nextToken());

        // znak na pozycji 6
        // fragment od znaku 10 - 16
        // intekst pierwszej litery t
        // indeks początku tekstu "długi"
        // Tekst zapisany wielkiemi literami
        System.out.println();
        System.out.println("Znak na pozycji 6: " + str.charAt(5));
        System.out.println("fragment od znaku 10 do 16: " + str.substring(10, 16));
        System.out.println("Indeks pierwszej litery 't': " + str.indexOf('t'));
        System.out.println("Indekst początku tekstu " + "\"długi\":  " + str.indexOf("długi"));
        System.out.println("Tekst wielkimi literami: " + str.toUpperCase(Locale.ROOT));
    }
}
