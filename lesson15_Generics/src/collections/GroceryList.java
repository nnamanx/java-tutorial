package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItemToGroceryList(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {

        System.out.println("In the list you have " + groceryList.size() + " items:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void removeFromGroceryList(int position) {

        String theItem = groceryList.get(position);
        groceryList.remove(position - 1);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GroceryList groceryList1 = new GroceryList();

//        Creating list
        System.out.println("Enter items to the list when finish write 'end': ");
        while (sc.hasNext()) {

            String newItem = sc.nextLine();
            if (newItem.equals("end")) {
                break;
            }
            groceryList1.addItemToGroceryList(newItem);

        }

//        Printing the list
        groceryList1.printGroceryList();
        System.out.println();

//        Removing an item from the list
        System.out.println("Enter the item position to remove from the grocery list: ");
        groceryList1.removeFromGroceryList(sc.nextInt());
        System.out.println();

        System.out.println("Edited version of the grocery list: ");
        groceryList1.printGroceryList();
    }
}
