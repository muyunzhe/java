package com.nudt.design.javaObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jeffrey on 15-12-1.
 */
public class ConcreteObserver implements Observer {
    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(Observable observable, Object o) {
        //推的方式
        System.out.println(observerName + "get:"+ o);
        //拉的方式
        //System.out.println(observerName +"get:" + ((ConcreteWeatherSubject)observable).getWeatherContend();
    }
}
