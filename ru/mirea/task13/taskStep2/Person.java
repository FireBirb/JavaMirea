package ru.mirea.task13.taskStep2;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Optional;

public class Person {
    private String lastName, firstName, thirdName;

 /*   public Person(String firstName, String thirdName, String lastName) {
        this.firstName = firstName;
        this.thirdName = thirdName;
        this.lastName = lastName;
    }*/

    public Person(@NotNull String lastName, String ...name) {
        this.lastName = lastName;
        if (name.length >= 1) {firstName = name[0];}
        if (name.length >= 2) {thirdName = name[1];}
    }

    public StringBuilder getName() {
        StringBuilder s = new StringBuilder();
        s.append(lastName).append((firstName == null)?"":" " + firstName.toUpperCase().charAt(0) + ".").append((thirdName == null)?"":thirdName.toUpperCase().charAt(0) + ".");
        return s;
    }
}
