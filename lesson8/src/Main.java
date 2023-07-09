import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//Calling User class tto get data of user
        Employee employee = new Employee();
        employee.getData();

        System.out.println("Enter the number of employees: ");
        int cnt = sc.nextInt();

        //array of employees
        Employee[] employees = new Employee[cnt];

        for (int i = 0; i < cnt; i++) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println(i + 1 + ". EMPLOYEE");

            System.out.print("Enter fullName: ");
            String fullName = sc2.nextLine().toLowerCase();
            System.out.print("Enter company: ");
            String company = sc2.nextLine().toLowerCase();
            System.out.print("Enter position: ");
            String position = sc2.nextLine().toLowerCase();
            System.out.print("Enter phone: ");
            String phone = sc2.nextLine();
            System.out.print("Enter salary: ");
            double salary = sc2.nextDouble();
            System.out.print("Enter age: ");
            int age = sc2.nextInt();

            employee = new Employee(fullName, company, position, phone, salary, age);

            //adding each employee to the array
            employees[i] = employee;
            System.out.println();
        }


        Scanner sc3 = new Scanner(System.in);

        while (true) {

            System.out.println("Chose one of the options \n1. Search an employee\n2. Exit progrom");
            int op = sc.nextInt();

            if (op == 2) {
                System.exit(-1);
            } else{
                //Printing the array
                System.out.print("Enter the name of employee: ");
                String name = sc3.nextLine().toLowerCase();

                for (int i = 0; i < cnt; i++) {
                    if(employees[i].fullName.equals(name)){
                        employees[i].getInfo();
                    }else System.out.println("This employee does not exist.");
                    System.out.println("===========");
                }
                break;
            }

        }

    }
}