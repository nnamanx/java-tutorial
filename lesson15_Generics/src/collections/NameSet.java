package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NameSet {

    Set<String> nameSet = new HashSet<>();

    //    Adding a new name to the set
    public void addNameToSet(String name) {

        nameSet.add(name);
    }

    //    Removing a new from the set
    public void removeNameFromList(String name) {

        nameSet.remove(name);
    }

    //    Printing the set
    public void printNameSet() {

        System.out.println("In the set you have " + nameSet.size() + " names:");

//        for (String name : nameSet) {
//            System.out.println(name);
//        }

        Iterator <String> nameIterator = nameSet.iterator();
        while(nameIterator.hasNext()){
            System.out.println(nameIterator.next());
        }
    }


    //    Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NameSet nameSet = new NameSet();

//        Creating a set
        System.out.println("Enter names when finish write 'end': ");
        while(sc.hasNext()){
            String newName = sc.nextLine();

            if(newName.equals("end")){
                break;
            }

            nameSet.addNameToSet(newName);
        }

        nameSet.printNameSet();
        System.out.println();

//        Remove a name from the set
        System.out.println("Enter a name you want to remove from the set: ");
        nameSet.removeNameFromList(sc.nextLine());
        System.out.println();
        nameSet.printNameSet();
    }
}
