public class NumberSystems {
    public static void main(String[] args) {

        // system dziesiętny - 0,1,2,3,4,5,6,7,8,9
        // 154 - > 1* 10^2 + 5 *10^1 + 4*10^0

        // system dwójkowym -  0, 1
        // 101 - 1*2^2 + 0*2^1 + 1*2^0 = 4+0+1 = 5

        // zamiana z dzisiętnego na binarny
        // 5 : 2 -> 1
        // 2 : 2 -> 0
        // 1 : 2 -> 1
        // 101 -> 00000101

        // System ósemkowy - 0, 1, 2, 3, 4, 5, 6, 7,
        // 47 -> 4*8^1 + 7*8^0 = 32 + 7 = 39

        //system szestnastkowy 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f
        // 3af = 3*16^2 + a*16^1 + f*16^0 = 3*16^2 + 10*16^1 + 15*16^0 = 3 * 256 + 160 + 15 = 768 + 160 + 15 = 943

       /* System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toOctalString(39));
        System.out.println(Integer.toHexString(943));*/

        // 8 4 2 1
        // 1 0 1 1 -> 8 + 2 +1 = 11
//        System.out.println(Integer.toBinaryString(11));


        int a = 11; // 00000000 00000000 00000000 00001011
        System.out.println(Integer.toBinaryString(a));
    }
}
