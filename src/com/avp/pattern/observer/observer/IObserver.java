package com.avp.pattern.observer.observer;

import com.avp.pattern.observer.domain.Employee;

public interface IObserver {
    void callMe(Employee employee, String msg);
}
