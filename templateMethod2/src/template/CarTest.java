package template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("=== autonomous driving car ===");
        Car myCar = new AICar();
        myCar.run();

        System.out.println("=== car ===");
        Car hisCar = new ManualCar();
        hisCar.run();
    }
}
