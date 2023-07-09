package student;

public class Teacher {
    String fullName;
    String subject;
    Student student;


//    Constructors
    public Teacher(){}

    public Teacher(String fullName, String subject){
        this.fullName =  fullName;
        this.subject = subject;
    }

    public Teacher(String fullName, String subject, Student student) {
        this.fullName = fullName;
        this.subject = subject;
        this.student = student;
    }

//    Setting fields
    public String setName(String name){
        return this.fullName = name;
    }

    public String setSubject (String subject){
        return this.subject = subject;
    }

    public Student setTeacher(Student student){
        return this.student = student;
    }

//    Getting fields
    public void getName(){
        System.out.println(this.fullName);
    }

    public void getSubject(){
        System.out.println(this.subject);
    }

    public void getStudent(){
        System.out.println(this.student);
    }
}
