package com.avp.pattern.factorypattern;

public interface IStory {
    int duration = 30;

    View save();
    void publish();
    void remove();

    //factory method
    View createViewForStory(String typeOfView, String content);
}
