package com.avp.pattern.coupling;

import com.avp.pattern.coupling.loose.Topic;
import com.avp.pattern.coupling.loose.Topic1;
import com.avp.pattern.coupling.loose.Topic2;
import com.avp.pattern.coupling.tight.Subject;

public class Program {
    public static void main(String args[]) {
        /**
         * Tight coupling
         * */
//        Subject subject = new Subject();
//        subject.startReading();

        /**
         * Loose coupling
         * */
        Topic topic1 = new Topic1();
        topic1.understand();
        Topic topic2 = new Topic2();
        topic2.understand();
    }
}
