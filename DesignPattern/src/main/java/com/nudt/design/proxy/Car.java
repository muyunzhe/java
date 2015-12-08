package com.nudt.design.proxy;

import java.util.Random;

/**
 * Created by jeffrey on 15-12-2.
 */
public class Car implements Moveable{
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //System.out.println("");
}
