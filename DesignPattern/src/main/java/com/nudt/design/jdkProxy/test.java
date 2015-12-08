package com.nudt.design.jdkProxy;

import com.nudt.design.proxy.Car;
import com.nudt.design.proxy.Moveable;

import java.lang.reflect.Proxy;

/**
 * Created by jeffrey on 15-12-3.
 */
public class test {
    public static void main(String[] args) {
        //定义一个被代理类
        Car car = new Car();
        //获取被代理类的类名
        Class<?> cls = car.getClass();
        //创建一个动态代理事件处理器
        TimeHandler h = new TimeHandler(car);
        //创建一个代理m
        /*参数：
        * 类加载器
        * 实现的接口
        * 事件处理器
        * 返回值：
        * 动态产生的代理对象（也实现了跟被代理对象一样的接口）
        * */
        Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),h);
        //运行代理
        m.move();
    }
}
