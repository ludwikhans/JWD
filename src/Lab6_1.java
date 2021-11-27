import java.util.StringTokenizer;

public class Lab6_1 {

    public static void main(String[] args) {
        StringTokenizer st1;
        String data = "27/11/2021";
        st1 = new StringTokenizer(data,"/");
        System.out.println("Dzień: " + st1.nextToken());
        System.out.println("Miesiąc: " + st1.nextToken());
        System.out.println("Rok: " + st1.nextToken());

       /*System day = data.substring(1,2);
        System month = data.substring(3,4);
        System year = data.substring(6,7);
        System.out.println();
        System.out.println("Urodziny: " + data);
        System.out.println("Dzień: " + day);
        System.out.println("Miesiąc: " + month);
        System.out.println("Rok: " + year);*/

    }
}
