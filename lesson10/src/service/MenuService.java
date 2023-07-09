package service;

import util.InputUtil;

public class MenuService {

    StudentManagement manageSt = new StudentManagement();
    TeacherManagement manageTc = new TeacherManagement();

    public short entryMenu() {
        System.out.println("==========University Management System==========" +
                "\n[0] Exit the system" +
                "\n[1] Teacher Management" +
                "\n[2] Student Management");

        return InputUtil.inputTypeShort("Choose one option: ");
    }

    public void entryOptions(short option) {

//        Cases for entry options
        switch (option) {
            case 0:
                System.exit(-1);
            case 1:
                manageTc.teacherOptions(manageTc.teacherMenu());
                break;
            case 2:
                manageSt.studentOptions(manageSt.studentMenu());
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

}
