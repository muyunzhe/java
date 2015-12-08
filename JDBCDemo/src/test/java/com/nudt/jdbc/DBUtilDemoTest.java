package com.nudt.jdbc;

import org.junit.*;
import org.junit.Assert.*;

public class DBUtilDemoTest{
    @Test
    public void testQuery(){
        try {
            Assert.assertEquals("name:jeffrey;age:25",new DBUtilDemo().getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}