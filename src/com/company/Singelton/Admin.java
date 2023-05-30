package com.company.Singelton;

public class Admin {

    private static final Admin INSTANCE = new Admin();
    private String name;

    private Admin() {}

    public static Admin getInstance(){return INSTANCE;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                '}';
    }
}
