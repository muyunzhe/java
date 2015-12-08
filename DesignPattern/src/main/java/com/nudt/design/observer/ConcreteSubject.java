package com.nudt.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeffrey on 15-12-1.
 */
public class ConcreteSubject implements Subject{

    private List<Observer> oblist = new ArrayList<Observer>();

    @Override
    public void attach(Observer obs) {
        oblist.add(obs);
    }

    @Override
    public void detach(Observer obd) {
        oblist.remove(obd);
    }

    @Override
    public void notifyObervers() {
        for(Observer obj:oblist){
            obj.update(this);
        }
    }

    private String WeatherContent;
    public String getWeatherContent() {
        return WeatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        WeatherContent = weatherContent;
    }

}
