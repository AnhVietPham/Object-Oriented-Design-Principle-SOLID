package com.avp.pattern.factorypattern;

public class VideoView extends View {

    //attributes
    String source,trimLength;

    VideoView(String source){
        super();
        this.source = source;
        trimLength = "0 - 0:30";
    }

    @Override
    public void displayMedia() {
        //to display the video view
        System.out.println("Source : " + source + "Duration: " + trimLength + "Filter : " + filter + " width: " + width + " height: " + height );
    }

    @Override
    public void setContentForMedia(String content) {
        //to set the contents for the video view
        this.source = content;
    }

    public void setTrimLength(int startPoint){
        //to set the trim length for the video view
        trimLength = startPoint + " - " + Integer.toString(startPoint + 30);
    }
}
