public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res1 = calculator.add(2, 3);
        System.out.println("2 + 3 = " +res1);
        int res2 = calculator.add(2, 3, 4);
        System.out.println("2 + 3  + 4 = " + res2);
        double res3 = calculator.add(2.5, 3.5);
        System.out.println("2.5 + 3.5 = " + res3);
        double res4 = calculator.add(2.3, 3.3, 4.4);
        System.out.println("2.3 + 3.3  + 4.4 = " + res4);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

   public double add(double a, double b, double c) {
        return a + b + c;

    }
}
