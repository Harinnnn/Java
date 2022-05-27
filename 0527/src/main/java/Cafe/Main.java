package Cafe;

public class Main {
    public static void main(String[] args) {
        Cafe c1 = new Cafe();
        Cafe c2 = new Cafe("Starbucks", "Seoul");
        Cafe c3 = new Cafe("Twosomeplace", "Busan", 2021, 200);
        Cafe c4 = new Cafe("Tom And Toms", "Songdo", 2012, 70);

        c3.showInfo();
        System.out.println();
        c4.showInfo();

        c1.setBrandName("Elephent Tea");
        c1.setLocation("Dadaepo");
        System.out.println("\n" + c1.getBrandName() + ", " + c1.getLocation());

        System.out.println();

        c1.printNameLocation();
        c2.printNameLocation();

        Cafe c5 = new Cafe("Coffebean", "Nampo");
        c5.printNameLocation();

        String drink = "coffee";
        c2.order(drink);
    }
}
