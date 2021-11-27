public class TypesDemo {
    public static void main(String[] args) {



        // liczby całkowite
        // byte - 1          00000000
        // short - 2         00000000 00000000
        // int - 4           00000000 00000000 00000000 00000000
        // long - 8          00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        byte b = 120;
        short s = 1203;
        int i = 12034;
        long l = 1235418433L;

        // typy zmienno przecinkowe
        double a = 34.56;
        float f = 1.4F;

        // typy znakowe
        char c = 'a';

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println();
        System.out.println(a);
        System.out.println(f);
        System.out.println((int) c); // wyświetlanie numerów znaków,
        // żeby wyświetlić znak specjalny dajemy / np: System.out.println("\'");

        // typ logiczny
        boolean choosen = true;
        boolean isBigger = b > 7;
        System.out.println();
        System.out.println(choosen);
        System.out.println(isBigger);

        // ciągi znaków
        String name = "Ala";
        System.out.println();
        System.out.println("Cześć, jestem " + name); //konkatenacja
        System.out.println("tekst " + 1);
        System.out.println("tekst " + 1 + 2);
        System.out.println("tekst " + (1 + 2));
        System.out.println(1 + 2 + " Tekst");

    }
}
