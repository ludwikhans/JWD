package pl.edu.wszib.three;

public class PackageTester {

    public void introduce(){

        System.out.println("Nazwa pakietu to: " + this.getClass().getPackage().getName());
    }

}
