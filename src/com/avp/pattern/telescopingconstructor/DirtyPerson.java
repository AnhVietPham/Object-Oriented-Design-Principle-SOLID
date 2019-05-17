package com.avp.pattern.telescopingconstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DirtyPerson {
    private final String name;
    private final String lastName;
    private final int age;
    private final String profession;
    private final List<String> hobbies;

    public DirtyPerson(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.age = 0;
        this.profession = null;
        this.hobbies = new ArrayList<>();
    }

    public DirtyPerson(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = null;
        this.hobbies = new ArrayList<>();
    }

    public DirtyPerson(String name, String lastName, int age, String profession) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.hobbies = new ArrayList<>();
    }

    public DirtyPerson(String name, String lastName, int age, String profession, List<String> hobbies) {
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
}
