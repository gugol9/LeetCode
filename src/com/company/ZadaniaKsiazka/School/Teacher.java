package com.company.ZadaniaKsiazka.School;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String firstName;
    private String lastName;
    private List<Group> groups;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    public void removeGroup(Group group){
        groups.remove(group);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +

                '}';
    }
}
