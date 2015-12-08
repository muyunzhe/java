package com.nudt.design.proxyCore;

import com.nudt.design.proxy.Car;
import com.nudt.design.proxy.Moveable;

/**
 * Created by jeffrey on 15-12-3.
 */
public class test {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class,h);
        m.move();
    }
}
