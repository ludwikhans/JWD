package pl.edu.wszib.enums;

public class ComputationTester {
    public static void main(String[] args) {
        double x = 7;
        double y = 4;


        System.out.println("Dodawanmie: " + Computation.ADD.perform(x,y));
        System.out.println("Dodawanmie: " + Computation.SUBSTRACT.perform(x,y));
        System.out.println("Dodawanmie: " + Computation.MULTIPLY.perform(x,y));
        System.out.println("Dodawanmie: " + Computation.DIVIDE.perform(x,y));
    }

}
