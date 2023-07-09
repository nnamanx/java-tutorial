package comparableAndComparator;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

    private String name;
    private int age;

    public EmployeeComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    Setters

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(EmployeeComparable e) {

        if (age == e.age) {
            return 0;
        } else if (age > e.age) {
            return 1;
        } else return -1;
    }


    public static void main(String[] args) {

        EmployeeComparable employee1 = new EmployeeComparable("Laman", 20);
        EmployeeComparable employee2 = new EmployeeComparable("Turan", 7);
        EmployeeComparable employee3 = new EmployeeComparable("Nazrin", 21);

//        Comparable
        System.out.println(employee1.compareTo(employee2));
        System.out.println(employee1.compareTo(employee3));
        System.out.println(employee2.compareTo(employee3));

        System.out.println();

//        Comparator
        AgeComparator ageComparator = new AgeComparator();

        System.out.println(ageComparator.compare(employee1, employee2));
        System.out.println(ageComparator.compare(employee3, employee2));
        System.out.println(ageComparator.compare(employee3, employee3));


    }
}
