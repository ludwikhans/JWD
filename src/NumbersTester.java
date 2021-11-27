public class NumbersTester {

    public static void main(String[] args) {

        int a = 5;
        double b = 13.5;
        double c = b / (double) a; //konwersja jawna - rzutowanie
    //    double c = b / a; //konwersja niejawna
      //  int c = (int)b / a; // rzutowanie


        //int -> Intiger : boxing
        //Intiger -> int : unboxing

        Float f1 = 12.5f;
        Float f2 = 27.2f;
        System.out.println(Math.min(f1,f2));

    }
}
