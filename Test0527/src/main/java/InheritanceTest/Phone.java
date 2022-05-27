package InheritanceTest;

public class Phone extends Computer{

    private String phoneNumber;

    Phone(String name, int price, String phoneNumber){
        super(name, price);
        this.phoneNumber = phoneNumber;
    }

    public void call() {
        System.out.println(this.name + " is calling!");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("phone number is " + this.phoneNumber + ".");
    }

    @Override
    public void turnOn() {
        super.turnOn();

    }
}
