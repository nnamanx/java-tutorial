package service;

import global.GlobalData;
import util.InputUtil;
import model.Teacher;

public class TeacherService {

    static long id = 1;

    public Teacher fillTeacher() {

        String name = InputUtil.inputTypeString("Enter teacher name: ");
        String birthDate = InputUtil.inputTypeString("Enter birth date: ");
        String profession = InputUtil.inputTypeString("Enter profession: ");

        return new Teacher(id++, name, birthDate, profession);
    }

    //    Register teachers
    public short registerTeacher() {
        TeacherService fill = new TeacherService();

        short teacherSize = InputUtil.inputTypeShort("Enter the number of teachers: ");
        GlobalData.teachers = new Teacher[teacherSize];

        for (int i = 0; i < teacherSize; i++) {
            System.out.println(i + 1 + ". Teacher");
            GlobalData.teachers[i] = fillTeacher();
            System.out.println("====================");
        }
        return teacherSize;

    }

//    public Teacher[] saveRegister(short teacherSize) {
//        for (int i = 0; i < teacherSize; i++) {
//            GlobalData.temp[i] = fillTeacher(); //idiot
//        }
//        return GlobalData.temp;
//    }


    //    Show list of teachers
    public void getListTeachers() {

//        for(int j = 0; j < GlobalData.temp.length; j++){
//            System.out.println(saveRegister(registerTeacher()));
//        }

        for (int i = 0; i < GlobalData.teachers.length; i++) {
            System.out.println("==========" + (i + 1) + ". Teacher==========");
            System.out.println(GlobalData.teachers[i]);
            System.out.println("====================");
        }
    }

    //    Update Teacher
    public void updateTeacher() {
        TeacherManagement manageTeacher = new TeacherManagement();

        long id = InputUtil.inputTypeLong("Enter id of a teacher: ");

        for (int i = 0; i < GlobalData.teachers.length; i++) {
            if (GlobalData.teachers[i].getId() == id) {
                manageTeacher.teacherUpdateOptions(manageTeacher.teacherUpdateMenu());
            }
        }
    }
}

