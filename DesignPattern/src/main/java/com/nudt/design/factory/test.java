package com.nudt.design.factory;

import java.lang.reflect.Method;

/**
 * Created by jeffrey on 15-12-1.
 */
public class test {
    public static void main(String[] args) {
/*        HairInterface left = new LeftHair();
        left.draw();
        HairInterface right = new RightHair();
        right.draw();
        HairFactory hf = new HairFactory();
        HairInterface left1 = hf.getHair("left");
        left1.draw();*/

       /* HairFactory factory = new HairFactory();
        HairInterface left = factory.getHairByClass("com.nudt.design.factory.LeftHair");
        left.draw();*/
        HairFactory factory = new HairFactory();
        HairInterface in = factory.getHairByClasskey("in");
        in.draw();
    }
}
