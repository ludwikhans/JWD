package pl.edu.wszib;

import java.util.Random;

public class AnimalShelter {

    private static final int PEN_NUMBER = 33;

    public static void main(String[] args) {
        Random random = new Random();
       Animal[] animals = new Animal[100];
        for (int i = 0; i < animals.length; i++) {

            int r = random.nextInt(3);
            switch (r){
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Hamster();
                    break;
            }

        }

        System.out.print("W kojcu nr " + PEN_NUMBER + " znajduje się ");
        System.out.println(animals[PEN_NUMBER-1].getType());
        System.out.print("Wszystkich jest ");
        System.out.println(animals[PEN_NUMBER-1].getInstanceNumber());

    }
}
