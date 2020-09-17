package com.example.recycview;

public class StudentModel {
    private int ID_student;
    private String Name_student;
    private String Adress_student;

    public StudentModel(int ID_student, String name_student, String adress_student) {
        this.ID_student = ID_student;
        Name_student = name_student;
        Adress_student = adress_student;
    }

    public int getID_student() {
        return ID_student;
    }

    public void setID_student(int ID_student) {
        this.ID_student = ID_student;
    }

    public String getName_student() {
        return Name_student;
    }

    public void setName_student(String name_student) {
        Name_student = name_student;
    }

    public String getAdress_student() {
        return Adress_student;
    }

    public void setAdress_student(String adress_student) {
        Adress_student = adress_student;
    }
}
