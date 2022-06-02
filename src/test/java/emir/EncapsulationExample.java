package emir;

public class EncapsulationExample {
//    OOP Concepts 4 encapsulation abstraction polymorphism inheritance

    /*
    Hiding Data

    By using private keyword

    How to reach and change its value
    By Getters and Setters

    this super


    protected
    default
    public
    private
     */

    private String gizliData = "emir";

    public String getGizliData() {
        return gizliData;
    }

    public void setGizliData(String gizliData) {
        this.gizliData = gizliData;
    }

    public static void asd(){
        System.out.println("asd");
    }
    public static void main(String[] args) {
        String emir = "1234567890";
        System.out.println(emir.substring(0).substring(1).substring(1).substring(1));

    }

}
