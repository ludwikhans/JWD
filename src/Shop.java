public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product("Mleko UHT", 3.29);
        Product p2 = new Product("Mleko UHT",3.29);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}
