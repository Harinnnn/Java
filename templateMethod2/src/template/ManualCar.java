package template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("Driven by person");
    }

    @Override
    public void stop() {
        System.out.println("Stop with the brake.");
    }

    @Override
    public void wiper() {
        System.out.println("A person controls the speed");
    }
}
