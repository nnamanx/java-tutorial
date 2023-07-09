package service;

import model.Employee;
import global.GlobalData;
import exception.ListIsEmpty;
import exception.UserNameNotFoundException;
import static util.InputUtil.inputTypeLong;
import static util.InputUtil.inputTypeShort;
import static util.InputUtil.inputTypeString;

public class EmployeeServiceImpl implements EmployeeService {

    static long id = 1;

    @Override
    public Employee fillEmployees() {

        String fullName = inputTypeString("Enter the employee's full name: ");
        String birthDate = inputTypeString("Enter the birthdate: ");
        String profession = inputTypeString("Enter the profession: ");

        return new Employee(fullName, birthDate, id++, profession);
    }

    @Override
    public boolean register() {

        short employeeSize = inputTypeShort("Enter the number of employees: ");
        GlobalData.employees = new Employee[employeeSize];

        for (int i = 0; i < employeeSize; i++) {

            System.out.println(i + 1 + ". Employee");
            GlobalData.employees[i] = fillEmployees();
            System.out.println("====================");
        }

        return true;

    }

    @Override
    public void showList() throws ListIsEmpty{
        for (int i = 0; i < GlobalData.employees.length; i++) {

            System.out.println("==========" + (i + 1) + ". Employee==========");
            System.out.println(GlobalData.employees[i]);
        }
    }

    @Override
    public void findByName(String name) throws UserNameNotFoundException{

        if (GlobalData.employees == null) {
            System.err.println("Employee does not exist.");
        } else {
            for (int i = 0; i < GlobalData.employees.length; i++) {
                if (GlobalData.employees[i].getFullName().contains(name)) {
                    System.out.println(GlobalData.employees[i]);
                } else throw new UserNameNotFoundException();
            }
        }

    }

    @Override
    public void update() {

        if (GlobalData.employees == null) {
            System.err.println("Employee does not exist.");
        } else {
            EmployeeManagement manageEmployee = new EmployeeManagementImpl();

            long id = inputTypeLong("Enter the id of an employee wanted to delete: ");

            for (int i = 0; i < GlobalData.employees.length; i++) {
                if (GlobalData.employees[i].getId() == id) {
                    manageEmployee.employeesUpdateOptions(manageEmployee.employeesUpdateMenu(), i);
                }
            }
        }
    }

    @Override
    public void delete(long id) {

        if (GlobalData.employees == null) {
            System.err.println("Employee does not exist.");
        } else {
            Employee[] temp = new Employee[GlobalData.employees.length - 1];

            for (int i = 0, k = 0; i < GlobalData.employees.length; i++) {
                if (i != (id - 1)) {
                    temp[k] = GlobalData.employees[i];
                    k++;
                }
            }

            GlobalData.employees = temp;
        }
    }

    @Override
    public void getTotalEmployee() {
        if (GlobalData.employees == null) {
            System.err.println("There is no employee yet.");
        } else System.out.println(GlobalData.employees.length + " employees exist.");
    }
}
