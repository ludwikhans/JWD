import java.awt.*;

public class Passing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Przed zmianą " + i);
        changeIt(i);
        System.out.println("Pozmianie " + i);

        Point p = new Point(1, 1);
        System.out.println("Przed zmianą " + p);
        changeIt(p);
        System.out.println("Pozmianie " + p);

    }

    static void changeIt(int i) {
        System.out.println("Zmieniam i");
        i++;
    }

    static void changeIt(Point p) {
        System.out.println("Zmieniam to na co wskazuje obecnie zmienna p");
        p.x++;
    }
}
