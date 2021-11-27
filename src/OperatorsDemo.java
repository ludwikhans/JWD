public class OperatorsDemo {
    public static void main(String[] args) {


      /*  int x = 5;
        x += 2;

        int a = 7;
        int b = 2;

        System.out.println(x);
        System.out.println(a + b);
        System.out.println(5 / 3.);
        System.out.println(5%2);
        System.out.println();

        int c = 5;
        int d = -c;

        System.out.println(d); */

      /*  int x, y, z;
        x = 42;
        x--;
        System.out.println(x); */

     /*   int a = 0;
        int b;
        b = ++a + ++a;
        System.out.println(b);
        System.out.println(a);*/

        //operatory relacji
        // >
        // <
        // >=
        // <=
        // ==
        // !=


      /*  int a = 5;
        int b = 10;
        boolean equal = a >= b;
        System.out.println(equal); */

        //Operatory logiczne
        // negacja !
        // koniunkja ,,i" &&
        // alternatywa ,,lub" ||
        // równoważność ==
        // alternatywa rozłączna (XOR) !=

        /*int x = 0;
        int y = 5;
        boolean test = (x < 0) && (y>3); // AND
        */

/*
        int x = 0;
        int y = 5;
        boolean test = (x < 0) && (y++>3); // OR
        System.out.println(test);
        System.out.println(y); */

      /*  int age = 33;
        boolean test = !(age < 25);
        System.out.println(test);*/

        // operatory bitowe
        // & - iloczyn bitowy
        // | - suma bitowwa OR
        // ^ - XOR (eXclusive OR
        // ~ - negacja bitowa
        // << - przesunięcie w prawo bitowe
        // >> - przesunięcie w lewo bitowe

        int a = 1;
        int  b = 5;

        // iloczyn bitowy

        /*System.out.println(a&b);
        System.out.println();
        System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%8s",Integer.toBinaryString(b)).replace(' ','0'));


        System.out.println("--------");
        System.out.println(String.format("%8s",Integer.toBinaryString(a&b)).replace(' ','0'));*/

        // suma
       /* System.out.println(a|b);
        System.out.println();
        System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%8s",Integer.toBinaryString(b)).replace(' ','0'));


        System.out.println("--------");
        System.out.println(String.format("%8s",Integer.toBinaryString(a|b)).replace(' ','0'));*/

        // ^ - XOR
       /* System.out.println(a^b);
        System.out.println();
        System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%8s",Integer.toBinaryString(b)).replace(' ','0'));


        System.out.println("--------");
        System.out.println(String.format("%8s",Integer.toBinaryString(a^b)).replace(' ','0'));*/

        // negacja bitowa
        /*System.out.println(~a);
        System.out.println();
        System.out.println(String.format("%32s",Integer.toBinaryString(a)).replace(' ','0'));



        System.out.println("--------------------------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(~a)).replace(' ','0'));*/

        // przesunięcie bitowe w lewo
        System.out.println(a << 5);
        System.out.println();
        System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ','0'));



        System.out.println("--------");
        System.out.println(String.format("%8s",Integer.toBinaryString(a<< b)).replace(' ','0'));


    }
}
