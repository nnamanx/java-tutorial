package student;

public class Student {
    String fullName;
    Teacher teacher;

//    Constructors
    public Student(){}

    public Student(String fullName){
        this.fullName = fullName;

    }

    public Student(String fullName, Teacher teacher) {
        this.fullName = fullName;
        this.teacher = teacher;
    }

//    Setting fields
    public String setName(String name){
        return this.fullName = name;
    }

    public Teacher setTeacher(Teacher teacher){
        return this.teacher = teacher;
    }

//    Getting fields
    public void getName(){
        System.out.println(this.fullName);
    }

    public void getTeacher(){
        System.out.println(this.teacher);
    }
}
