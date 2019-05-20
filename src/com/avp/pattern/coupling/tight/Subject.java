package com.avp.pattern.coupling.tight;

public class Subject {
    Topic t = new Topic();

    public void startReading() {
        t.understand();
    }
}
