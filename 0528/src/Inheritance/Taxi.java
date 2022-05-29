package Inheritance;

public class Taxi extends Bus {

    private int meter;

    Taxi(){}
    Taxi(int number, int fee, int meter) {
        super(number, fee);
        this.meter = meter;
    }

    public void taxiInfo(){
        super.busInfo();
        System.out.println("meter is working." + "(" + this.meter + ")");
    }
}
