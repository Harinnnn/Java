package Inheritance;

public class Main {
    public static void main(String[] args) {

        Bus b1 = new Bus();
        Bus b2 = new Bus(96, 1200);

        b1.setNumber(2);
        b1.setFee(400);

        b2.payTheFee();

        b1.showInfo();

        Taxi t1 = new Taxi(33333, 5400, 30);
        t1.showInfo();

    }
}
