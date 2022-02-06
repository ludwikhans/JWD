package pl.edu.wszib.exceptions;

public class ageTester {
    static void chechAge(int age){
        if (age <18){
            throw new AgeRangeException("UWAGA osoba niepełmoletnia!");
        } else {
            System.out.println("Dostęp przyznano");
        }


    }


    public static void main(String[] args) {
        try {
            chechAge(17);
        } catch (Exception e) {
            System.out.println("Naruszenie zasad! " + e.getMessage());
        }
    }
}
