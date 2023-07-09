package service;

import global.GlobalData;
import model.Student;
import util.InputUtil;


public class StudentService {

    static long id = 1;

    public Student fillStudent() {

        String fullName = InputUtil.inputTypeString("Enter the student name: ");
        String birthDate = InputUtil.inputTypeString("Enter the birth date: ");
        String major = InputUtil.inputTypeString("Enter the major: ");

        return new Student(id++, fullName, birthDate, major);

    }

    //    Register a student
    public boolean registerStudent() {

        short studentSize = InputUtil.inputTypeShort("Enter the number of students: ");
        GlobalData.students = new Student[studentSize];

        for (int i = 0; i < studentSize; i++) {

            System.out.println(i + 1 + ". Student");
            GlobalData.students[i] = fillStudent();
            System.out.println("====================");
        }

        return true;
    }

    //    Show list of Students
    public void getListStudents() {

        for (int i = 0; i < GlobalData.students.length; i++) {

            System.out.println("==========" + (i + 1) + ". Student==========");
            System.out.println(GlobalData.students[i]);
        }
    }

    //    Update Student
    public void updateStudent() {
        StudentManagement manageStudent = new StudentManagement();

        long id = InputUtil.inputTypeLong("Enter id of a student: ");

        for (int i = 0; i < GlobalData.students.length; i++) {
            if (GlobalData.students[i].getId() == id) {

                manageStudent.studentUpdateOptions(manageStudent.studentUpdateMenu());
            }
        }
    }


}
