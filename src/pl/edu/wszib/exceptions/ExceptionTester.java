package pl.edu.wszib.exceptions;

import java.net.URL;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};


        try {

            System.out.println("Nasz numer to: " + numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niema takiego indeksu" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak: " +e.getMessage());
        }finally {
            System.out.println("Koniec!");
        }


    }
}
