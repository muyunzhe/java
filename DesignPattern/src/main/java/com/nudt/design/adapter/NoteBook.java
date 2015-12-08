package com.nudt.design.adapter;

/**
 * Created by jeffrey on 15-12-2.
 */
public class NoteBook {
    //private Target concreteTarget;
    private Target target;
    //private Adaptee adaptee;
    public NoteBook(Target target){
        this.target = target;
    }
    public void request(){
        target.request();
    }

    public static void main(String[] args) {
        //只有一个普通的工具
        Adaptee adaptee = new Adaptee();
        //要实现特殊功能
        //方式一：采用组合的方式
        Target target = new AdapterZuhe(adaptee);
        NoteBook nb1 = new NoteBook(target);
        nb1.request();
        //方式二：采用继承的方式
        Target target2 = new AdapterExtends();
        NoteBook nb2 = new NoteBook(target2);
        nb2.request();
    }
}
