package com.nudt.design.adapter;

/**
 * Created by jeffrey on 15-12-2.
 */
public class AdapterExtends extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("after extends");
        this.commonRequest();
    }
}
