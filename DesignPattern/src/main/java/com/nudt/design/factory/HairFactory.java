package com.nudt.design.factory;

import java.util.Map;

/**
 * Created by jeffrey on 15-12-1.
 */
public class HairFactory {
    public HairInterface getHair(String key){
        if("left".equals(key)){
            return new LeftHair();
        }else if("fight".equals(key)){
            return new RightHair();
        }else
            return null;

    }

    public HairInterface getHairByClass(String className){
        try {
            HairInterface hair = (HairInterface)Class.forName(className).newInstance();
            return hair;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HairInterface getHairByClasskey(String key){
        Map<String,String> map = new PropertiesReader().getProperties();
        try {
            //System.out.print(key);
            HairInterface hair = (HairInterface) Class.forName(map.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
