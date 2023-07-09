package homework6_laman;
import java.util.Scanner;

public class Employee {

    String name;
    String surname;
    String department;
    String position;
    double salary;

    Scanner sc = new Scanner(System.in);



//    Constructor

    public Employee(){

    }

    public Employee(String name, String surname, String department, String position, double salary){
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }
    //Printing Values
     void setValues(String name, String surname, String department, String position, double salary){

        System.out.println("Name: " + name + "\nSurname: " + surname + "\nDepartment: "
                + department + "\nPosition: " + position + "\nSalary " + salary);
    }

//    Raising salary
    void raiseSalary(double salary){
         Company company = new Company();

         if(company.budget/2 > salary){
             salary += 100;
         }

    }

//    Decrease salary
    void decreaseSalary(){
        Company company = new Company();

        if(company.budget/2 < salary){
            salary -= 50;
        }
    }

//    Change position
    void changePosition(String position){
         position = this.position;

         if(!position.isEmpty()){
             System.out.print("Enter you new position: ");
             position = sc.nextLine();
         } else System.out.println("You need to have a position.");
    }
}
