public class Matrix {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("n = " + n + " Matrix");
        System.out.println("--------------");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3s",i+j + " ");
            }
            System.out.println();
        }
    }
}
