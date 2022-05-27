package Cafe;

public class Cafe {

    //멤버변수 - 생성자 - 게터세터 - 함수

    //커피숍 정보
    private String brandName;
    private String location;
    private int openingYear;
    private int sqpt;
    private String drinkable;
    private int seat;

    //생성자
    Cafe(){};

    Cafe(String brandName, String location) {
        this.brandName = brandName;
        this.location = location;
    }

    Cafe(String brandName, String location, int openingYear, int sqpt){
        this.brandName = brandName;
        this.location = location;
        this.openingYear = openingYear;
        this.sqpt = sqpt;
    }

    //getter setter
    public String getDrinkable(){
        return this.drinkable;
    }
    public void setDrinkable(String drinkable){
        this.drinkable = drinkable;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }
    public String getBrandName(){
        return this.brandName;
    }

    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }

    public void setOpeningYear(String location){
        this.location = location;
    }
    public int getOpeningYear(){
        return this.openingYear;
    }

    public void setSqpt(int sqpt){
        this.sqpt = sqpt;
    }
    public int getSqpt(){
        return this.sqpt;
    }

    //method
    public void showInfo(){
        System.out.println("===" + brandName + " in " + location + "===");
        System.out.println("This cafe is opened in " + openingYear + ".");
        System.out.println("The size of the cafe is " + sqpt +"pt.");
    }

    public void printNameLocation(){
        System.out.println(this.brandName + " is in " + this.location + ".");
    }

    public void order(String drinkable){
        System.out.println("yes," + drinkable + " order is completed");
    }

}
