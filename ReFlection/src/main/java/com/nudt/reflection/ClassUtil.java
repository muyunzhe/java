package com.nudt.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class ClassUtil
{
    public static void printClassInfo(Object obj){
        Class c = obj.getClass();
        System.out.println(c.getName());
        //获取所有public方法，包括从父类继承而来的
        Method[] ms = c.getMethods(); //c.getDeclaredMethods();获取自己申明的方法
        for(Method m : ms){
            //得到方法的返回值类型的类类型，如:String.class
            Class returnType = m.getReturnType();
            System.out.print("返回："+returnType.getName()+"");
            //获取方法名
            String methodName = m.getName();
            System.out.print("方法名:"+methodName +"");
            //获取参数的类型的类类型，如int.class
            Class [] argsType = m.getParameterTypes();
            for(Class ac :argsType){
                String argsTypeName = ac.getName();
                System.out.print("参数:"+argsTypeName);
            }
            System.out.println();

        }

    }

    public static void printFields(Object obj){
        Field[] fs = obj.getClass().getDeclaredFields();
        for(Field fsd : fs){
            Class type = fsd.getType();
            String typename = type.getName();
            String name = fsd.getName();
            System.out.println("类类型："+type + "类型名：" + typename +"变量名："+ name);
        }
    }

    public static void printConstruct(Object obj){
        Class c = obj.getClass();
        Constructor[] constructors = c.getConstructors();
        for(Constructor construct : constructors){
            System.out.print(construct.getName()+":");
            Class[] paramType = construct.getParameterTypes();
            for(Class cc :paramType){
                System.out.print(cc.getName() +",");
            }
            System.out.println();
        }
    }
    public static void main( String[] args )
    {
        Class c1 = int.class;
        Class c2 = String.class;
        Class c3 = Integer.class;
        Class c4 = void.class;
        String str = "hello";
        //printClassInfo(c4);
        //printFields(c1);
        printConstruct(new Integer(1));
        //System.out.println( c4.getSimpleName() );
    }
}
