public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

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


        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "Misja specjalna";
        opportunity.speed = 5;
        opportunity.temperature = -20;
        System.out.println("Robot Opportunity");
        opportunity.showAttributes();


    }
}
