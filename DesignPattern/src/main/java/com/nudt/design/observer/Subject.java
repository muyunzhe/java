package com.nudt.design.observer;

/**
 * Created by jeffrey on 15-12-1.
 */
public interface Subject {

    public void attach(Observer obs);
    public void detach(Observer obd);
    public void notifyObervers();
}
