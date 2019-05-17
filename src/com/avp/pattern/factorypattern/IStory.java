package com.avp.pattern.factorypattern;

public interface IStory {
    int duration = 30;

    public View save();
    public void publish();
    public void remove();

    //factory method
    public View createViewForStory(String typeOfView,String content);
}
