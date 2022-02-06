package pl.edu.wszib.exceptions;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            System.out.println("Pierwiastek z " + i + " wynosi " + (int)Math.sqrt(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
