package com.avp.pattern.telescopingconstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BeautifulPerson {
    private String name;
    private String lastName;
    private int age;
    private String profession;
    private List<String> hobbies;

    BeautifulPerson(String name, String lastName) {
        this(name, lastName, 0);
    }

    BeautifulPerson(String name, String lastName, int age) {
        this(name, lastName, age, null);
    }

    BeautifulPerson(String name, String lastName, int age, String profession) {
        this(name, lastName, age, profession, null);
    }

    BeautifulPerson(String name, String lastName, int age, String profession, List<String> hobbies) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.hobbies = hobbies == null ? new ArrayList<>() : new ArrayList<>(hobbies);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    @Override
    public String toString() {
        return "BeautifulPerson{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
