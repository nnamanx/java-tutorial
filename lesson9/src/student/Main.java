package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanners for different data types
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);


//        Getting amount of students
        System.out.print("Enter the number of students: ");
        int sCnt = scInt.nextInt();
        Student[] students = new Student[sCnt];

//        Getting amount of teachers
        System.out.print("Enter the number of teachers: ");
        int tCnt = scInt.nextInt();
        Teacher[] teachers = new Teacher[tCnt];

//        Filling students' array
        for (int i = 0; i < sCnt; i++) {
            System.out.println(i + 1 + ". Student");
            System.out.print("Enter student name: ");
            String name = scString.nextLine();

            students[i] = new Student(name);
        }

//        Filling teachers' array
        for (int i = 0; i < tCnt; i++) {
            System.out.println(i + 1 + ". Teacher");
            System.out.print("Enter teacher name: ");
            String name = scString.nextLine();
            System.out.print("Enter subject: ");
            String subject = scString.nextLine();

            teachers[i] = new Teacher(name, subject);
        }

        System.out.println("====================================");

        System.out.println("Choose one of the options");
        System.out.println("1. Get the student's teachers \n2. Get teacher's students \n3. Exit the system");
        int op = scInt.nextInt();

        if (op == 1) {
            System.out.print("Enter the student name: ");
            String sName = scString.nextLine();

            for (int i = 0; i < sCnt; i++) {
                if (sName.equals(students[i].fullName)) {
                            for (int j = 0; j < tCnt; j++) {
                                System.out.print(teachers[j].fullName + " ");
                            }
                            break;
                        } else System.out.println("The student is not in the list");
                    }

                } else if (op == 2) {
                    System.out.print("Enter the teacher name: ");
                    String tName = scString.nextLine();

                    for (int l = 0; l < tCnt; l++) {
                        if (tName.equals(teachers[l].fullName)) {
                            for (int j = 0; j < sCnt; j++) {
                                System.out.print(students[j].fullName + " ");
                            }
                            break;
                        } else System.out.println("The teacher is not in the list");
                    }

                } else System.exit(-1);

            }
        }