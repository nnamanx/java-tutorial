package service;

import global.GlobalData;
import model.Teacher;

import util.InputUtil;

public class TeacherManagement {

    TeacherService teacherService = new TeacherService();
    public short teacherMenu() {

        System.out.println("=====Teacher Management System=====" +
                "\n[0] Exit the system" +
                "\n[1] Registration" +
                "\n[2] Show list" +
                "\n[3] Update teacher");

        return InputUtil.inputTypeShort("Choose an option: ");
    }

    //        cases for teacher management options
    public void teacherOptions(short option) {

//        Cases for teacher options
        switch (option) {
            case 0:
                System.exit(-1);
            case 1:
                teacherService.registerTeacher();
                break;
            case 2:
                teacherService.getListTeachers();
                break;
            case 3:
                teacherService.updateTeacher();
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    public short teacherUpdateMenu() {

        System.out.println("=====Teacher Management System=====" +
                "\n[0] Exit the system" +
                "\n[1] Edit full name" +
                "\n[2] Edit birth date" +
                "\n[3] Edit profession");

        return InputUtil.inputTypeShort("Choose on option: ");
    }
    
    public void teacherUpdateOptions(short option) {
        Teacher teacher = new Teacher();

//        Cases for teacher update menu options
        switch (option) {
            case 0:
                System.exit(-1);
            case 1:
                teacher.setFullName(InputUtil.inputTypeString("Enter a new name: "));
                break;
            case 2:
                teacher.setBirthDate(InputUtil.inputTypeString("Enter a new birth date: "));
                break;
            case 3:
                teacher.setProfession(InputUtil.inputTypeString("Enter a new profession: "));
                break;
            default:
                System.out.println("Invalid option");
        }
    }


}
