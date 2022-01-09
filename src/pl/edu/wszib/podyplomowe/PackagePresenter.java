package pl.edu.wszib.podyplomowe;

public class PackagePresenter {
    public void showPackage(){
        System.out.print("To jest obiek klasy " + this.getClass().getSimpleName());
        System.out.println(" w, pakiecie " + this.getClass().getPackage().getName());
    }



}
