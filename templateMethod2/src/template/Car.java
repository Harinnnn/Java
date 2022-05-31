package template;

public abstract class Car {
        public abstract void drive();
        public abstract void stop();
        public abstract void wiper();

        public void startCar() {
            System.out.println("turn on the engine");
        }
        public void turnOff() {
            System.out.println("turn off the engine");
        }
        final public void run() {
            startCar();
            drive();
            stop();
            turnOff();
            run();
            wiper();
        }
    }
