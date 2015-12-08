package com.nudt.design.observer;

import java.util.Observable;

/**
 * Created by jeffrey on 15-12-1.
 */
public class ConcreteObserve implements Observer, java.util.Observer {
    private String observerName;
    private String weatherContent;
    private String remindThing;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }

    @Override
    public void update(Subject subject) {
        weatherContent = ((ConcreteSubject)subject).getWeatherContent();
        System.out.println(observerName+" get a message:"+weatherContent+","+remindThing);
    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
