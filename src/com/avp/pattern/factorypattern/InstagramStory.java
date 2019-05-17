package com.avp.pattern.factorypattern;

public class InstagramStory implements IStory {

    //attributes
    String viewGroup;
    View view;

    //default setting of story visibility
    InstagramStory() {
        viewGroup = "public";
    }

    public void setViewGroup(String viewGroup){
        this.viewGroup = viewGroup;
    }


    @Override
    public View save() {
        //to save the content of the Story, which is of type View.
        System.out.println("Your story has been saved in gallery!");
        return view;
    }

    @Override
    public void publish() {
        //to share the story content with the world.
        System.out.println("Your story has been published!");
    }

    @Override
    public void remove() {
        //to remove the story content.
        view = null;
        System.out.println("Your story has been removed!");
    }

    @Override
    public View createViewForStory(String typeOfView, String content) {
        View view;
        typeOfView = typeOfView.trim().toLowerCase();

        if (typeOfView.equals("image")) {
            view = new ImageView(content);
        } else {
            if (typeOfView.equals("video")) {
                view = new VideoView(content);
            } else if (typeOfView.equals("text")) {
                view = new TextView(content);
            } else {
                view = null;
            }
        }
        return view;
    }
}
