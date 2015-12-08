package com.nudt.design.singleton;

/**
 * Created by jeffrey on 15-12-1.
 */
public class singleton_lazy {
    private singleton_lazy(){}

    private static singleton_lazy instance;

    public static singleton_lazy getInstance(){
        if(instance == null)
            instance = new singleton_lazy();
        return instance;
    }
}
