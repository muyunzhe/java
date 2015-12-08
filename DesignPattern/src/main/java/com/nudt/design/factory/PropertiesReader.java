package com.nudt.design.factory;

/**
 * Created by jeffrey on 15-12-1.
 */
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesReader {
    public Map<String, String> getProperties() {

        Properties props = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        //InputStream in = getClass().getClassLoader().getResourceAsStream("type.properties");
        InputStream in = getClass().getResourceAsStream("type.properties");
        // InputStream in = getClass().getResource("type.properties");
        try {
            props.load(in);
            //props.load(new FileInputStream("type.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Enumeration en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = props.getProperty(key);
                map.put(key, property);
				//System.out.println(key + "  " + property);
            }
        return map;
    }
}