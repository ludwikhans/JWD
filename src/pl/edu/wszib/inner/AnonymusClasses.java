package pl.edu.wszib.inner;

public class AnonymusClasses {
    public static class Robot{
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }
        public void saySomething(){
            greetingModule.sayHello();
        }
    }
    public interface GreetingModule{
        void sayHello();
    }

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("dzień dobry");
            }
        });
        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        });
        Robot johan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("guten morgen");
            }
        });

        Robot[] robots = {jan, john, johan};
        for (Robot robot :
                robots) {
            robot.saySomething();
        }


    }
}
