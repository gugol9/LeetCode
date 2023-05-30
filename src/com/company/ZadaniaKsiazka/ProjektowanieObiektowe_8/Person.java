package com.company.ZadaniaKsiazka.ProjektowanieObiektowe_8;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate date;
    private double salary;
    private boolean isFreedom;
    private boolean haveConnect = false;
    private boolean didItWork = false;


}
