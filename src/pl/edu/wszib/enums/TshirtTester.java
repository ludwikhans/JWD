package pl.edu.wszib.enums;

public class TshirtTester {
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt(TshirtSize.L, "Polex");
        Tshirt tshirt2 = new Tshirt(TshirtSize.S,"Polex");

        System.out.println(tshirt1 + " - " + tshirt1.getSize().getSleeveLenght());
    }

}
