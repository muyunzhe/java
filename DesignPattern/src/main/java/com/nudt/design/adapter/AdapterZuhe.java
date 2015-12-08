package com.nudt.design.adapter;

/**
 * Created by jeffrey on 15-12-2.
 */
public class AdapterZuhe implements Target {

    private Adaptee special;
    public AdapterZuhe(Adaptee special){
        this.special = special;
    }
    @Override
    public void request() {
        System.out.println("after zuhe!");
        special.commonRequest();
    }
}
