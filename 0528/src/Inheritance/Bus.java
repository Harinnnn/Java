package Inheritance;

import java.util.Stack;

public class Bus {

    protected int number;
    protected int fee;

    Bus(){}

    Bus(int number, int fee) {
        this.number = number;
        this.fee = fee;
    }

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }

    public void setFee(int fee){
        this.fee = fee;
    }
    public int getFee(){
        return this.fee;
    }

    public void payTheFee() {
        System.out.println("A fee of " + fee+"won has been payed.");
    }

    public void busInfo() {
        System.out.println("number " + this.number + " bus's fee is " +this.fee+ "won.");
    }

}
