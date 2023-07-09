package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FruitMap {

    Map<String, String> fruitMap = new HashMap<>();

    //    Adding a fruit to the map
    public void addFruitToMap(String key, String value) {

        fruitMap.put(key, value);
    }

    //    Remove a fruit from the map
    public void removeFruitFromMap(String key) {

        fruitMap.remove(key);

    }

    //    Print thw fruit map
    public void printFruitMap() {

        for (Map.Entry entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FruitMap fruitMap1 = new FruitMap();

        System.out.println("Enter a color and fruit when finish write 'end' (ex: red apple) ");

        while (sc.hasNext()) {

            String newEntry = sc.nextLine();

            if (newEntry.equals("end")) {
                break;
            }

            String[] splitEntry = newEntry.split(" ");
            String key = splitEntry[0];
            String value = splitEntry[1];

            fruitMap1.addFruitToMap(key, value);

        }

        fruitMap1.printFruitMap();

//        Remove a fruit
        System.out.println("Enter the fruit to remove (ex: banana)");
        String removeFruit = sc.nextLine();

        for (Map.Entry NewEntry : fruitMap1.fruitMap.entrySet()) {

            if (NewEntry.getValue().equals(removeFruit)) {
                fruitMap1.removeFruitFromMap((String) NewEntry.getKey());
            }
        }

        System.out.println("Edited fruit map: ");
        fruitMap1.printFruitMap();

    }
}
