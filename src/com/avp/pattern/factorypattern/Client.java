package com.avp.pattern.factorypattern;

import java.util.Scanner;

public class Client {
    public static void main(String args[]){
        String userName, password, answer;

        Scanner scanner = new Scanner(System.in);

        //to accept the username and password from user for logging in
        System.out.println("Enter username:");
        userName = scanner.next();
        scanner.nextLine();
        System.out.println("Enter password:");
        password = scanner.next();
        scanner.nextLine();

        User userOne = new User(userName, password);

        System.out.println("You are now logged in!");

        //to take an input from the user whether s/he wants to share a story.
        System.out.println("Share your story with the world?(yes/no)");
        answer = scanner.next();
        scanner.nextLine();

        String choiceOfView = "", content = "";
        View localGalleryView;

        while (answer.compareToIgnoreCase("yes") == 0) {

            //to take an input from user for what type of story s/he would like to share.
            System.out.println("Choose the type of your story :Image,Text,Video");
            choiceOfView = scanner.next();
            scanner.nextLine();

            //to take an input from the user providing the content for the story
            System.out.println("Provide the content for your story :");
            content = scanner.next();
            scanner.nextLine();

            //creating the story
            userOne.instagramStory.view = userOne.instagramStory.createViewForStory(choiceOfView, content);
            //publishing the story
            userOne.instagramStory.publish();
            //displaying the contents of the story
            userOne.instagramStory.view.displayMedia();

            //saving the instagram story content in the local gallery of the user
            localGalleryView = userOne.instagramStory.save();

            //removing the story
            userOne.instagramStory.remove();


            //to displaying the contents of the story saved in user's gallery
            System.out.println("Details of story saved in gallery :");
            localGalleryView.displayMedia();

            //to take an input from the user whether s/he wants to share another story.
            System.out.println("Do you want to post another story? (yes/no)");
            answer = scanner.next();
            scanner.nextLine();
        }

        System.out.println("Thank you!");
        System.out.println("Logged out!");
        scanner.close();
    }
}
