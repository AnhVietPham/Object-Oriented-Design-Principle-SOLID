package com.avp.pattern.observer.subject;

import com.avp.pattern.observer.observer.IObserver;

public interface ISubject {
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObserver();
}
