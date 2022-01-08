public class Overrider {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.show();
        b.show();
    }
}

class A {
    void show () {
        System.out.println("A");
    }
}

class B extends A {
    void show (){
        System.out.println("B");
    }
}