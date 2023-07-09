package model;

import global.GlobalData;

public class Student {

    String fullName;
    String birthDate;
    String major;
    long id;


    //    Constructors
    public Student() {
    }
    public Student(long id, String fullName, String birthDate, String major) {

        this.fullName = fullName;
        this.birthDate = birthDate;
        this.major = major;
        this.id = id;
    }


    //    Setters
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setId(long id) {
        this.id = id;
    }

    //    Getters
    public String getFullName() {
        return this.fullName;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getMajor() {
        return this.major;
    }

    public long getId() {
        return this.id;
    }


    @Override
    public String toString() {

        String getInfo = null;

        for (int i = 0; i < GlobalData.students.length; i++) {
            getInfo = (i + 1) + ". Student" +
                    "\nFull name: " + this.fullName +
                    "\nProfession: " + this.major +
                    "\nBirth Date: " + this.birthDate +
                    "\nID: " + this.id;
        }

        return getInfo;
    }
}
