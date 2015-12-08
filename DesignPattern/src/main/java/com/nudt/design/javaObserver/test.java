package com.nudt.design.javaObserver;

//import com.nudt.design.observer.ConcreteObserve;
//import com.nudt.design.observer;

/**
 * Created by jeffrey on 15-12-1.
 */
public class test {
    public static void main(String[] args) {
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();

        ConcreteObserver girl = new ConcreteObserver();
        girl.setObserverName("girlFriend");
        ConcreteObserver mother = new ConcreteObserver();
        mother.setObserverName("mother");

        weather.addObserver(girl);
        weather.addObserver(mother);
        weather.setWeatherContend("bad day");
    }
}
