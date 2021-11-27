public class Lab5 {
    public static void main(String[] args) {

        System.out.println("Zadanie 1");
        float inwestition = 14000;
        System.out.println( "Kapitał początkowy inwestycji wynosi: " + inwestition + " zł.");
        inwestition *= 1.4F ;
        System.out.println("Wartość inwestycji po pierwszym roku wynosi: " + inwestition + " zł.");
        inwestition -= 1500F;
        System.out.println("Wartość inwestycji po drugim roku wynosi: " + inwestition + " zł.");
        inwestition *= 1.12F;
        System.out.println("Wartość inwestycji po trzecim roku wynosi: " + inwestition + " zł.");

        System.out.println("\n");
        System.out.println("Zadanie 2");
        int number = 70;
        boolean test = ((number % 7) == 0) && ((number % 5) == 0) ;
        System.out.println("Czy liczba: " + number + " jest podzielna przez 5 i 7 bez reszty jednocześnie? ");
        System.out.println(test ? "TAK" : "NIE");

        System.out.println("\n");
        System.out.println("Zadanie 3");
        int numbers = 1245;
        int bitPosition = 4;
        int mask = 1 << bitPosition;

        boolean results = (numbers & mask) > 0; // bez ln nie przenosi do następnego wierszu
        System.out.print("Dla liczby " + numbers + " na " + bitPosition + " pozycji ");
        System.out.print(results ? "jest" : " mie jest");
        System.out.print(" ustawiony bit");

        // System.out.println(String.format("%8s",Integer.toBinaryString(mask)).replace(' ','0'));
        //  System.out.println(String.format("%8s",Integer.toBinaryString(numbers)).replace(' ','0'));




    }
}
