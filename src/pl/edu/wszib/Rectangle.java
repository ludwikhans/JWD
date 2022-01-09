package pl.edu.wszib;

public class Rectangle extends Shape{

    private int lenght;
    private int width;

    @Override
    double getArea() {
        return lenght * width;
    }
}
