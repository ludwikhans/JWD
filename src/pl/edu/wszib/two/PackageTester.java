package pl.edu.wszib.two;

public class PackageTester {

    public void introduce(){

        System.out.println("Nazwa pakietu to: " + this.getClass().getPackage().getName());
    }

}
