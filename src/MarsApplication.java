public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot("eksploracja",2, (-60));


        System.out.println("Robot spirit");
        spirit.showAttributes();
        System.out.println();
        System.out.println("Robot spirit");
        System.out.println("Zwiększenie prędkości do 3");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Robot spirit");
        System.out.println();

        System.out.println("Robot spirit");
        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;

        spirit.showAttributes();
        System.out.println();

        System.out.println("Robot spirit");
        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttributes();
        System.out.println();


        MarsRobot opportunity = new MarsRobot("Misja specjalna", 5 , 0);
        opportunity.status = "Misja specjalna";
               opportunity.showAttributes();


    }
}
