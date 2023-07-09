package service;

import model.Student;
import util.InputUtil;

public class StudentManagement {

    StudentService studentService = new StudentService();

    public short studentMenu() {
        System.out.println("=====Student Management System=====" +
                "\n[0] Exit the system" +
                "\n[1] Registration" +
                "\n[2] Show list" +
                "\n[3] Update student");

        return InputUtil.inputTypeShort("Choose on option: ");
    }


    //        cases for student management options
    public void studentOptions(short option) {

//        Cases for student options
        switch (option) {
            case 0:
                System.exit(-1);
            case 1:
                if(studentService.registerStudent() == true){
                    System.out.println("Successfully completed. Continue with another option");
                }
                break;
            case 2:
                studentService.getListStudents();
                break;
            case 3:
                studentService.updateStudent();
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    public short studentUpdateMenu() {

        System.out.println("=====Student Management System=====" +
                "\n[0] Exit the system" +
                "\n[1] Edit full name" +
                "\n[2] Edit birth date" +
                "\n[3] Edit major");

        return InputUtil.inputTypeShort("Choose an option: ");
    }


    public void studentUpdateOptions(short option) {
        Student student = new Student();

//        Cases for teacher update menu options
        switch (option) {
            case 0:
                System.exit(-1);
            case 1:
                student.setFullName(InputUtil.inputTypeString("Enter a new name: "));
                break;
            case 2:
                student.setBirthDate(InputUtil.inputTypeString("Enter a new birth date: "));
                break;
            case 3:
                student.setMajor(InputUtil.inputTypeString("Enter a new major: "));
                break;
            default:
                System.out.println("Invalid option");
        }
    }


}
