package Inheritance;

public class Taxi extends Bus {

    private int meter;

    Taxi(){}
    Taxi(int number, int fee, int meter) {
        super(number, fee);
        this.meter = meter;
    }

    public void setfee(int price){
        this.fee = fee;
    }
    public int getfee() {
        return this.fee;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("meter is working." + "(" + this.meter + ")");
    }
}
