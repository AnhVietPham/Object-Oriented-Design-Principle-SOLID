package com.avp.pattern.factorypattern;

abstract public class View {
    // constants
    private static final float MATCH_PARENT_WIDTH = 300.5f;
    private static final float MATCH_PARENT_HEIGHT = 600.10f;

    //attributes of visual content
    private float width, height;
    private String filter, sticker, location;

    View() {

        //default settings
        this.width = MATCH_PARENT_WIDTH;
        this.height = MATCH_PARENT_HEIGHT;
        filter = "normal";
        sticker = "none";
        location = "none";
    }

    public void setFilterEffect(String filter) {

        //to set the filter.
        this.filter = filter;
    }

    public void setSticker(String sticker) {

        //to set a sticker.
        this.sticker = sticker;
    }

    public void setLocation(String location) {

        //to set the location.
        this.location = location;
    }

    public void setSize(float height, float width) {

        //to set the width and height.
        this.width = width;
        this.height = height;
    }
}
