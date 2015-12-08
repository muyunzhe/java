package com.nudt.design.proxy;

/**
 * Created by jeffrey on 15-12-2.
 */
public class test {
    public static void main(String[] args) {
        Car car = new Car();
        Moveable car3 = new Car3(car);
        car3.move();
    }
}
