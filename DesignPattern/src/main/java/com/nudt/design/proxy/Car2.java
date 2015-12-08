package com.nudt.design.proxy;

/**
 * Created by jeffrey on 15-12-2.
 */
public class Car2 extends Car {

    public void move(){

        long startTime = System.currentTimeMillis();
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶,用时"+(endTime - startTime)+"毫秒");
    }
}
