import java.awt.*;

public class NamePoint extends Point {
    String name;

    public NamePoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public void showInfo(){
        System.out.println(name + "(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        NamePoint np = new NamePoint(5,5, "SmallPoint");
        System.out.println("x wynosi: " + np.x);
        System.out.println("y wynosi: " + np.y);
        System.out.println("name wynosi: " + np.name);
        System.out.println();
        np.showInfo();
        np = new NamePoint(123,456,"BigPoint");
        np.showInfo();
    }
}
