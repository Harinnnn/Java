package InheritanceTest;

public class Main {
    public static void main(String[] args) {

        Computer c1 = new Computer();
        Computer c2 = new Computer("Macbook Pro", 220501);

        c1.setName("Gram");
        c1.turnOn();
        c2.turnOn();
        c2.turnOff();

        Phone p1 = new Phone("iphone 12", 10, "010-0000-0000");
        p1.sendEmail("you", "me");
        p1.call();

        p1.showInfo();


    }
}
