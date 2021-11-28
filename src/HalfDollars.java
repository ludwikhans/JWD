public class HalfDollars {
    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_00, 2_100_00};
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int arverage;

        philadelphia[0] = 1_800_00;
        philadelphia[1] = 5_000_00;
        philadelphia[2] = 2_500_00;

        total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];

        arverage = (total[0] + total[1] + total[2])/ denver.length;
        System.out.print("Produkcja w roku 2012: ");
        System.out.format("%,d%n",total[0]);
        System.out.print("Produkcja w roku 2013: ");
        System.out.format("%,d%n",total[1]);
        System.out.print("Produkcja w roku 2014: ");
        System.out.format("%,d%n",total[2]);
        System.out.print("Srednia produkcja: ");
        System.out.format("%,d%n",arverage);
    }
}
