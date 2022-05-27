package InheritanceTest;

public class Computer {

    protected String name;
    protected int price;

    Computer() {}
    Computer(String name, int birthday){
        this.name = name;
        this.price = birthday;
        System.out.println("I'm a computer " + name + "!");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public void showInfo() {
        System.out.println("==="+ this.name + "===");
        System.out.println("price is " + this.price);
    }

    public void sendEmail(String sender, String receiver){
        System.out.println("Email is sended to " + receiver + " from " + sender + ".");
    }
    public void turnOn(){
        System.out.println(this.name + " is Turn on.");
    }
    public void turnOff(){
        System.out.println(this.name + " is Turn off.");
    }

}
