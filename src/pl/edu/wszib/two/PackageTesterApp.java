package pl.edu.wszib.two;

public class PackageTesterApp {

    public static void main(String[] args) {
        pl.edu.wszib.one.PackageTester pt1 = new pl.edu.wszib.one.PackageTester();
        pt1.introduce();
        pl.edu.wszib.two.PackageTester pt2 = new pl.edu.wszib.two.PackageTester();
        pt2.introduce();
        pl.edu.wszib.three.PackageTester pt3 = new pl.edu.wszib.three.PackageTester();
        pt3.introduce();
    }
}
