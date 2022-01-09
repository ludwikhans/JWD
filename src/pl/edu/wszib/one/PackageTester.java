package pl.edu.wszib.one;

public class PackageTester {

    public void introduce(){

        System.out.println("Nazwa pakietu to: " + this.getClass().getPackage().getName());
    }

}
