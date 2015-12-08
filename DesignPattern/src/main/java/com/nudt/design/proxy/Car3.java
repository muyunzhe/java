package com.nudt.design.proxy;

/**
 * Created by jeffrey on 15-12-2.
 */
public class Car3 implements Moveable {

    Car car;
    public Car3(Car car){
        this.car = car;
    }
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        car.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶,用时"+(endTime - startTime)+"毫秒");

    }
}
