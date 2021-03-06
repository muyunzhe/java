package com.nudt.jdbc;

import java.net.ConnectException;
import java.sql.*;

public class DBUtilDemo{
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc";
    private static final String USER = "root";
    private static final String PASSWD= "nudt2013";

    private static Connection conn = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USER,PASSWD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }

    public static void main (String args[])throws Exception{

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");

        String result = null;
        while(rs.next()){
            result = "name:"+rs.getString("user_name")+";age:"+rs.getInt("age");
            System.out.println(result);
        }
    }
}
