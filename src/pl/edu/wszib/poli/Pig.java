package pl.edu.wszib.poli;

public class Pig extends Animal {

    public Pig(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "świńka " + name;
    }

    @Override
    String makeSound() {
        return "chrum chrum";
    }
}
