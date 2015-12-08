package com.nudt.design.observer;

/**
 * Created by jeffrey on 15-12-1.
 */
public class test {
    public static void main(String[] args) {
        ConcreteSubject consub = new ConcreteSubject();

        ConcreteObserve girl = new ConcreteObserve();
        girl.setObserverName("girlFriend");
        girl.setRemindThing("appointment");
        ConcreteObserve mother = new ConcreteObserve();
        mother.setObserverName("mather");
        mother.setRemindThing("shopping");

        consub.attach(girl);
        consub.attach(mother);
        consub.setWeatherContent("good day");
        consub.notifyObervers();
    }
}
