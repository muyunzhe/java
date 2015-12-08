package com.nudt.design.proxyCore;

//import java.lang.reflect.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jeffrey on 15-12-3.
 */
public class TimeHandler implements com.nudt.design.proxyCore.InvocationHandler {
    Object obj;

    public TimeHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public void invoke(Object o, Method m) {

        try {
            long startTime = System.currentTimeMillis();
            m.invoke(obj);
            long endTime = System.currentTimeMillis();
            System.out.println("汽车结束行驶,用时"+(endTime - startTime)+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
