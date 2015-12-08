package com.nudt.design.singleton;

/**
 * Created by jeffrey on 15-12-1.
 */
public class test{
    public static void main(String[] args) {
        singleton slt = singleton.getInstance();
        singleton slt2 = singleton.getInstance();
        System.out.println(slt == slt2);

        singleton_lazy sing3 = singleton_lazy.getInstance();
        singleton_lazy sing4 = singleton_lazy.getInstance();

        System.out.println(sing3 == sing4);
    }
}
