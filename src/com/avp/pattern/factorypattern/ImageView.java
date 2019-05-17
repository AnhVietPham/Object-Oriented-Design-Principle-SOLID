package com.avp.pattern.factorypattern;

public class ImageView extends View {
    //attribute of ImageView
    String source;

    ImageView(String source){
        super();
        this.source = source;
    }

    @Override
    public void displayMedia() {
        //to display the image view.
        System.out.println("Source : " + source + "Filter : " + filter + " width: " + width + " height: " + height );
    }

    @Override
    public void setContentForMedia(String content) {
        //to set the content for the image view.
        this.source = content;
    }
}
