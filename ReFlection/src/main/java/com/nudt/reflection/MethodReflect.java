package com.nudt.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jeffrey on 15-12-5.
 */
public class MethodReflect {
    public void print(int a,int b){
        System.out.println(a+b);
    }
    public void print (String a,String b){
        System.out.println(a.toUpperCase()+","+b.toUpperCase());
    }

    public static void main(String[] args){
        //获取类的信息
        MethodReflect obj = new MethodReflect();
        Class c = obj.getClass();
        //获取方法
        try {
            Method method = c.getMethod("print",new Class[]{int.class,int.class});
            Method method1 = c.getMethod("print",String.class,String.class);
            //方法反射
            Object o = method.invoke(obj,new Object[]{10,20});
            method1.invoke(obj,"a","b");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
