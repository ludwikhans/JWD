package pl.edu.wszib.inner;

public class Outer {
    public  class Inner {}

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
    }
}
class Outer2{
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
