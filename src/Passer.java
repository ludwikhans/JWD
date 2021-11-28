public class Passer {

    void toUpperCase(String[]text){
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase();

        }
    }

    void showArgs(String[]tekst){
        for (int i = 0; i < tekst.length; i++) {
            System.out.println(tekst[i] + " ");

        }
    }

    public static void main(String[] args) {
        Passer passer = new Passer();
        passer.toUpperCase(args);
        passer.showArgs(args);
    }
}
