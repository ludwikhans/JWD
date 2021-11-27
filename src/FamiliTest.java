public class FamiliTest {

    public static void main(String[] args) {

        FamiliMember dad = new FamiliMember();
        dad.name = "Tomasz";
        dad.age = 30;

        System.out.println("Nazwisko rodu to: " + dad.surname);
        System.out.println(FamiliMember.surname);
        System.out.println("Imię Ojca to: " + dad.name);
        System.out.println("Wiek Ojca to: " + dad.age);

        FamiliMember son = new FamiliMember();
        son.name = "Karol";
        son.age = 7;

        System.out.println("Nazwisko rodu to: " + son.surname);
        System.out.println(FamiliMember.surname);
        System.out.println("Imię Syna to: " + son.name);
        System.out.println("Wiek Syna to: " + son.age);
        FamiliMember.surname = "Kowalski";
        System.out.println("Nazwisko rodu to: " + son.surname);


    }

}
