package comparableAndComparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<EmployeeComparable> {


    @Override
    public int compare(EmployeeComparable e1, EmployeeComparable e2) {

        if (e1.getAge() == e2.getAge()) {
            return 0;
        } else if (e1.getAge() > e2.getAge()) {
            return 1;
        } else return -1;
    }
}
