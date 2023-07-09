package UsingSuperKeyword;

public class Student extends Person{
    String grades;
    String major;

    public Student(String grades, String major, String name, String surname, String birthDate){
        super(name, surname, birthDate); // why do we need to write super then fields of this class? I mean why do we need an order?
        this.grades = grades;
        this.major = major;
    }
    
}
