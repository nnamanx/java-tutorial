package planets;

import java.util.Scanner;

import static planets.Planets.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a planet name: ");
        String userPlanet = sc.nextLine().toUpperCase();

        switch (userPlanet){
            case "MERCURY":
                System.out.println(Planets.MERCURY.name());
                for (int i = 0; i < 8; i++) {
                    if(Planets.MERCURY.ordinal() == i){
                        System.out.println("Length of a day: " + Planets.lengthOfDay[i]);
                        System.out.println("Distance from the Sun: " + Planets.distanceFromSun[i]);
                        System.out.println("The area: " + Planets.area[i]);
                    }
                }
                break;
            case "VENUS":
                System.out.println(Planets.VENUS.name());
                for (int i = 0; i < 8; i++) {
                    if(Planets.VENUS.ordinal() == i){
                        System.out.println("Length of a day: " + Planets.lengthOfDay[i]);
                        System.out.println("Distance from the Sun: " + Planets.distanceFromSun[i]);
                        System.out.println("The area: " + Planets.area[i]);
                    }
                }
                break;
            case "EARTH":
                System.out.println(Planets.EARTH.name());
                for (int i = 0; i < 8; i++) {
                    if(Planets.EARTH.ordinal() == i){
                        System.out.println("Length of a day: " + Planets.lengthOfDay[i]);
                        System.out.println("Distance from the Sun: " + Planets.distanceFromSun[i]);
                        System.out.println("The area: " + Planets.area[i]);
                    }
                }
                break;
            case "MARS":
                System.out.println(Planets.MARS.name());
                for (int i = 0; i < 8; i++) {
                    if(Planets.MARS.ordinal() == i){
                        System.out.println("Length of a day: " + Planets.lengthOfDay[i]);
                        System.out.println("Distance from the Sun: " + Planets.distanceFromSun[i]);
                        System.out.println("The area: " + Planets.area[i]);
                    }
                }
                break;
            case "JUPITER":
                System.out.println(Planets.JUPITER.name());
                for (int i = 0; i < 8; i++) {
                    if(Planets.JUPITER.ordinal() == i){
                        System.out.println("Length of a day: " + Planets.lengthOfDay[i]);
                        System.out.println("Distance from the Sun: " + Planets.distanceFromSun[i]);
                        System.out.println("The area: " + Planets.area[i]);
                    }
                }
                break;
            case "SATURN":
                System.out.println(Planets.SATURN.name());
                for (int i = 0; i < 8; i++) {
                    if(Planets.SATURN.ordinal() == i){
                        System.out.println("Length of a day: " + Planets.lengthOfDay[i]);
                        System.out.println("Distance from the Sun: " + Planets.distanceFromSun[i]);
                        System.out.println("The area: " + Planets.area[i]);
                    }
                }
                break;
            case "URANUS":
                System.out.println(Planets.URANUS.name());
                for (int i = 0; i < 8; i++) {
                    if(Planets.URANUS.ordinal() == i){
                        System.out.println("Length of a day: " + Planets.lengthOfDay[i]);
                        System.out.println("Distance from the Sun: " + Planets.distanceFromSun[i]);
                        System.out.println("The area: " + Planets.area[i]);
                    }
                }
                break;
            case "NEPTUNE":
                System.out.println(Planets.NEPTUNE.name());
                for (int i = 0; i < 8; i++) {
                    if(Planets.NEPTUNE.ordinal() == i){
                        System.out.println("Length of a day: " + Planets.lengthOfDay[i]);
                        System.out.println("Distance from the Sun: " + Planets.distanceFromSun[i]);
                        System.out.println("The area: " + Planets.area[i]);
                    }
                }
                break;
            default:
                System.out.println("Please, enter a valid name.");
        }

    }
}
