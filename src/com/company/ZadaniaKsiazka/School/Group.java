package com.company.ZadaniaKsiazka.School;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> studentList;
    private Teacher teacher;

    public Group(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.studentList = new ArrayList<>(); //pusta lista
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void removeStudent(Student student){
        studentList.remove(student);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                ", teacher=" + teacher +
                '}';
    }
}
