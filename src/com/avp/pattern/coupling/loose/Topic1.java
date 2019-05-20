package com.avp.pattern.coupling.loose;

public class Topic1 implements Topic {
    @Override
    public void understand() {
        System.out.println("Got it");
    }
}
