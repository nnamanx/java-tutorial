package model;

import global.GlobalData;

public class Teacher {

    String fullName;
    String profession;
    String birthDate;
    long id;

    //    Constructors
    public Teacher() {
    }

    public Teacher(long id, String fullName, String profession, String birthDate) {

        this.fullName = fullName;
        this.profession = profession;
        this.birthDate = birthDate;
        this.id = id;
    }

    //    Setters
    public void setFullName(String name) {
        this.fullName = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    //    Getters
    public String getFullName() {
        return this.fullName;
    }

    public String getProfession() {
        return this.profession;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public long getId() {
        return this.id;
    }


    @Override
    public String toString() {

        String getInfo = null;

        for (int i = 0; i < GlobalData.teachers.length; i++) {

            getInfo = (i + 1) + ". Teacher" +
                    "\nFull name: " + this.fullName +
                    "\nProfession: " + this.profession +
                    "\nBirth Date: " + this.birthDate +
                    "\nID: " + this.id;

        }
        return getInfo;
    }
}
