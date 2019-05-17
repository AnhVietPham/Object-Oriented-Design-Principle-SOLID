package com.avp.pattern.factorypattern;

public class User {
    //attributes
    String userName, password;
    InstagramStory instagramStory;

    //Parameterized Constructor
    User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        instagramStory = new InstagramStory();
    }


    public void setUserName(String userName) {
        //to set the username
        this.userName = userName;
    }

    public void setPassword(String password) {
        //to set the password
        this.password = password;
    }

    public void setInstagramStory(String typeOfView, String source) {
        //to set the Instagram story for the user
        this.instagramStory = new InstagramStory();
        this.instagramStory.view = this.instagramStory.createViewForStory(typeOfView, source);
    }
}
