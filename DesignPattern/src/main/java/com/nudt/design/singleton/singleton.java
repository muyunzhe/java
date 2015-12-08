package com.nudt.design.singleton;

/**
 * Created by jeffrey on 15-12-1.
 */
public class singleton {
    private singleton(){
        //return slt;
    }

    private static singleton slt = new singleton();
    public static singleton getInstance(){
        return slt;
    }
}
