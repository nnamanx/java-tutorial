package homework5;

//Employee classı yaradın. Və içərisində (id, full-name, company, department, position və salary) olsun
//Daha sonra bir method yaradın, məlumatları içərisinə parametr olaraq göndərək və bizə console da məlumatları
//çap etsin.

public class Employee {
    int id;
    int salary;
    String fullName;
    String companyDep;
    String position;

    static void printing(int id, int salary, String fullName, String companyDep, String position){
        System.out.println("ID: " + id);
        System.out.println("FUll name: " + fullName);
        System.out.println("Company Department: " + companyDep);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}
