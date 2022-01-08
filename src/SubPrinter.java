public class SubPrinter extends Printer {
    int z = 3;


    void printMe() {
        System.out.println("z wynosi " + z);
        System.out.println("x wynosi " + x + ", y wynosi " + y);

    }

    public static void main(String[] args) {
    SubPrinter subPrinter = new SubPrinter();
    subPrinter.printMe();
    }
}
