package homework6_laman;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter your name: ");
        employee.name = sc.nextLine();
        System.out.print("Enter your surname: ");
        employee.surname = sc.nextLine();
        System.out.print("Enter your department: ");
        employee.department = sc.nextLine();
        System.out.print("Enter your position: ");
        employee.position = sc.nextLine();
        System.out.print("Enter your salary: ");
        employee.salary = sc.nextDouble();

//        Printing
        employee.setValues(employee.name, employee.surname, employee.department, employee.position, employee.salary);



//        Creating n times employee
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();


        //couldnt take input from user n times while creating new objects
//        for (int i = 0; i < n; i++)
//        {
//            employee[i] = new Employee(employee.name, employee.surname, employee.department, employee.position, employee.salary);
//        }



//        STUDENT PART
        System.out.println("1. Enter your name: \nEnter your surname: \nEnter your major: ");
        Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());

    }
}