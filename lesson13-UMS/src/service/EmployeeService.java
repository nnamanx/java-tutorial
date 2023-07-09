package service;

import exception.ListIsEmpty;
import exception.UserNameNotFoundException;
import model.Employee;

interface EmployeeService {
    Employee fillEmployees();

    boolean register();

    void showList() throws ListIsEmpty;

    void findByName(String name) throws UserNameNotFoundException;

    void update();

    void delete(long id);

    void getTotalEmployee();
}
