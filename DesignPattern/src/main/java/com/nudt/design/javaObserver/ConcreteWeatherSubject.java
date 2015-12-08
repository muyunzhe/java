package com.nudt.design.javaObserver;

import java.util.Observable;

/**
 * Created by jeffrey on 15-12-1.
 */
public class ConcreteWeatherSubject extends Observable {
    private String weatherContend;

    public String getWeatherContend() {
        return weatherContend;
    }

    public void setWeatherContend(String weatherContend) {
        this.weatherContend = weatherContend;
        this.setChanged();
        this.notifyObservers(weatherContend);//推模式
        //this.notifyObservers();//拉模式
    }
}
