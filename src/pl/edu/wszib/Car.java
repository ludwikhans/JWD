package pl.edu.wszib;

import java.util.Objects;

//Zaimplementuj klasę Car, przechowującą takie informacje o samochodzie
// jak brand, color, year.
// Klasa powinna possiadać konstruktor gdzie parametrami są wszystkie atrybuty klasy,
// oraz konstruktor gdzie możemy tylko podać markę
// a domyślnie zostanie przypisany biały kolor oraz  obecny rok produkcji.
// Wyposaż klasę  w metody toString() oraz equals().

public class Car {
    String brand;
    String color;
    int year;

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public Car(String brand) {
        this.brand = brand;
        this.color = "biały";
        this.year = 2022;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }


    public static void main(String[] args) {
        Car car = new Car("Audi","Czarny",2000);
        System.out.println(car);
        Car car1 = new Car("Fiat");
        System.out.println(car1);
    }

}
