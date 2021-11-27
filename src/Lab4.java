public class Lab4 {
    public static void main(String[] args) {

        String frirstName = "Piotr";
        String lastName = "Kowalski";
        int age = 30;
        char gender = 'm';
        long personalID = 8306112507L;

        frirstName = "Paulina";
        lastName = "Nowak";
        age = 35;
        gender = 'k';
        personalID = 8306112508L;



        System.out.println("Imię: " + frirstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
        System.out.println("Płeć: " + gender);
        System.out.println("Personal ID number: " + personalID);

        char znak = 169;
        String space = " ";
        String row1 = space + space + space + znak;
        String row2 = space + space + znak + space +znak ;
        String row3 = space + znak + space + space + space +znak ;
        String row4 = znak + space + znak +space+ znak + space + znak;

        System.out.println();
        System.out.println("   " + znak);
        System.out.println("  " + znak + " " + znak);
        System.out.println(" " + znak + "   " + znak);
        System.out.println(znak + " " + znak + " " + znak + " " + znak);

        System.out.println();
        System.out.println();
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);




    }
}
