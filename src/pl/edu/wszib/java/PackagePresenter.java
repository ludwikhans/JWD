package pl.edu.wszib.java;

public class PackagePresenter {
    public PackagePresenter() {
        System.out.println("Dzień dobry");
    }

    public static void main(String[] args) {
        PackagePresenter packagePresenter = new PackagePresenter();
        packagePresenter.showPackage();
    }

    public void showPackage(){
        System.out.print("To jest obiek klasy " + this.getClass().getSimpleName());
        System.out.println(" w, pakiecie " + this.getClass().getPackage().getName());
    }

}
