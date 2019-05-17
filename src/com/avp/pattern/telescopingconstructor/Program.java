package com.avp.pattern.telescopingconstructor;

import java.util.Arrays;

public class Program {
    public static void main(String args[]) {

        /**
         * Using telescoping constructor
         * */
        BeautifulPerson beautifulPerson = new BeautifulPerson("BeautifulPerson name", "BeautifulPerson lastName");
        System.out.println(beautifulPerson);
        beautifulPerson = new BeautifulPerson("BeautifulPerson name", "BeautifulPerson lastName", 20);
        System.out.println(beautifulPerson);
        beautifulPerson = new BeautifulPerson("BeautifulPerson name", "BeautifulPerson lastName", 20, "BeautifulPerson Engineer");
        System.out.println(beautifulPerson);
        beautifulPerson = new BeautifulPerson("BeautifulPerson name", "BeautifulPerson lastName", 20, "BeautifulPerson Engineer", Arrays.asList("BeautifulPerson Fishing"));
        System.out.println(beautifulPerson);

        /**
         * No using telescoping constructor
         * */
        DirtyPerson dirtyPerson = new DirtyPerson("DirtyPerson name", "DirtyPerson lastName");
        System.out.println(dirtyPerson);
        dirtyPerson = new DirtyPerson("DirtyPerson name", "DirtyPerson lastName", 20);
        System.out.println(dirtyPerson);
        dirtyPerson = new DirtyPerson("DirtyPerson name", "DirtyPerson lastName", 20, "DirtyPerson Engineer");
        System.out.println(dirtyPerson);
        dirtyPerson = new DirtyPerson("DirtyPerson name", "DirtyPerson lastName", 20, "DirtyPerson Engineer", Arrays.asList("DirtyPerson Fishing"));
        System.out.println(dirtyPerson);
    }
}
