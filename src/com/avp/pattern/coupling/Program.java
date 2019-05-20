package com.avp.pattern.coupling;

import com.avp.pattern.coupling.tight.Subject;

public class Program {
    public static void main(String args[]) {
        Subject subject = new Subject();
        subject.startReading();
    }
}
