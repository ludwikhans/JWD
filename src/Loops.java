public class Loops {
    public static void main(String[] args) {
        // int x =-5;

//        int y = 10;
//        y = y+x;
//        System.out.println(y);

//        if (x > 0) {
//            System.out.println("Większe od zera!");
//        } else if (x < 0){
//            System.out.println("Mniejsze od zera!");
//        } else {
//            System.out.println("Równe zero");
//        }

     /*   char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogłobyć lepiej");
                break;
            case 'D':
                System.out.println("Rozważ oszukiwanie");
                break;
            default:
                System.out.println("Błąd coś poszło nie tak");
        }*/

        /*for (int i = 0; i < 100000; i++) {
            System.out.println(i);

        }*/

       /* boolean cond = true;
        do {
            System.out.println("Pętla działa");

        }while (cond);*/

       /* for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i);
            {
                System.out.print(" ");

            }
        }*/

       out: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i+j + " ");
                if (i==5 && j==5) {
                    break out;
                }
            }
            System.out.println();
        }

    }
}

