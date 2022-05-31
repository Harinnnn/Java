package TemplateMethod;

public class HousingMain {
    public static void main(String[] args) {
        System.out.println();

        HouseTemplate houseType = new WoodenHouse();

        houseType.buildHouse();

        //구분선
        System.out.println();
        System.out.println("***********");
        System.out.println();

        houseType = new GlassHouse();

        houseType.buildHouse();

    }
}
