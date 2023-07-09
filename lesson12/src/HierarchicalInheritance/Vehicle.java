package HierarchicalInheritance;

public class Vehicle {

    //Wrote String type because i thought they could have some kind of model numbers and keywords as well.
    String brand;
    String model;
    String wheels;
    String engine;
    String steering;
    String tyres;
    String brakes;
    int seats;
    int speed;
    String lights;
    boolean comfort; //it is whether yes or no.
    boolean safety;
    int insuranceDate;


    public static void drive(int speed){
        System.out.println("vin vinnnn...");
    }

    public static void beeping(){
        System.out.println("beep beep!");
    }


}
