package com.nudt.design.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by jeffrey on 15-12-3.
 */
public class TimeHandler implements InvocationHandler {
    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /*
    * 参数:
    * o：被代理对象
    * method:被代理对象的方法
    * objects:被代理对象方法的参数
    * 返回：
    * object对象，即object方法method的返回值
    * */
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        long startTime = System.currentTimeMillis();
        method.invoke(target);
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶,用时"+(endTime - startTime)+"毫秒");

        return null;
    }
}
