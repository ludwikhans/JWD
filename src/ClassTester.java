public class ClassTester {

    int i; // zmienna egzemplarza (pole klasy)
    static  int j = 2; // zmienna klasowa (pole statyczne)

    public int change(){
        int i = 0;
        int k = 7; // zmienna lokalna
        return i + (k * j);
    }

    public static void main(String[] args) {

        int i = 77;
        ClassTester classTester = new ClassTester();
        classTester.change();


        System.out.println("Wyświetlam zmienną egzemplarza dla obiektu classTester: " + classTester.i);
        System.out.println("Wyświetlam zmienną lokalną i: " + i);
        System.out.println("Wyświetlam zmienną klasową (statyczną) j: " + j);


    }


}


