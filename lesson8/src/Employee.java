import java.util.Scanner;

public class Employee {
    String fullName;
    String company;
    String position;
    String phone;
    double salary;
    int age;

    Scanner sc = new Scanner(System.in);

//    Default constructor
    public Employee(){}

    //Constructor with all fields
    public Employee(String fullName, String company, String position, String phone, double salary, int age) {
        this.fullName = fullName;
        this.company = company;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


//    Methods for setting fields
    public void setName(String fullName){
        this.fullName = fullName;
        System.out.println(this.fullName);
    }

    public void setCompany(String company){
        this.company = company;
        System.out.println(this.company);
    }

    public void setPosition(String position){
        this.position = position;
        System.out.println(this.position);
    }

    public void setPhone(String phone){
        this.phone = phone;
        System.out.println(this.phone);
    }

    public void setSalary(Double salary){
        this.salary = salary;
        System.out.println(this.salary);
    }

    public void setAge(int age){
        this.age = age;
        System.out.println(this.age);
    }

//    End of setters


//Get data from user
    void getData(){
        System.out.print("FullName: ");
        this.fullName = sc.nextLine();

        System.out.print("Company: ");
        this.company = sc.nextLine();

        System.out.print("Position: ");
        this.position = sc.nextLine();

        System.out.print("Phone: ");
        this.phone = sc.nextLine();

        System.out.print("Salary: ");
        this.salary = sc.nextDouble();

        System.out.print("Age: ");
        this.age = sc.nextInt();
    }

    //Get Employee info
     void getInfo(){
        System.out.println(
                "fullName: " + this.fullName +
                        "\ncompany: " + this.company +
                        "\nposition: " + this.position +
                        "\nphone: " + this.phone +
                        "\nsalary: " + this.salary +
                        "\nage: " + this.age
        );
    }
}
