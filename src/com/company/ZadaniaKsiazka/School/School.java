package com.company.ZadaniaKsiazka.School;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Teacher> teacherList5;
    private  List<Group> groupList;
    private List<Student> studentList;

    private static School INSTANCE;

    private School(String name) {
        this.name = name;
        this.teacherList5 = new ArrayList<>();
        this.groupList = new ArrayList<>();
        this.studentList = new ArrayList<>();
    }

    public static School getInstance(String name){
        if (INSTANCE == null){
            INSTANCE = new School(name);
        }
        return INSTANCE;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void removeStudent(Student student){
        studentList.remove(student);
    }

    public void addTeacher(Teacher teacher){
        teacherList5.add(teacher);
    }

    public void removeTeacher(Teacher teacher){
        teacherList5.remove(teacher);
    }

    public void addGroup(Group group){
        groupList.add(group);
    }

    public void removeGropu(Group group){
        groupList.remove(group);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", teacherList5=" + teacherList5 +
                ", groupList=" + groupList +
                ", studentList=" + studentList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeacherList5() {
        return teacherList5;
    }

    public void setTeacherList5(List<Teacher> teacherList5) {
        this.teacherList5 = teacherList5;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


}
