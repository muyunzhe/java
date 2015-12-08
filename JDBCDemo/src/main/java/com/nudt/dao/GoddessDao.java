package com.nudt.dao;

import com.nudt.jdbc.DBUtilDemo;
import com.nudt.model.Goddess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeffrey on 15-11-30.
 */
public class GoddessDao {

    private Connection conn = null;
    public GoddessDao() {
        conn = DBUtilDemo.getConnection();
    }

    public void addGoddess(Goddess god) throws SQLException {
        String sql = "INSERT INTO `imooc`.`imooc_goddess`" +
        "(`user_name`, `sex`, `age`, `birthday`, `email`,`mobile`, `create_user`, `create_date`," +
         "`update_user`, `update_date`, `isdel`)" +
         "VALUES (?,?,?,?,?,?,?,current_date(),?,current_date(),?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,god.getUser_name());
        ps.setInt(2,god.getSex());
        ps.setInt(3,god.getAge());
        ps.setDate(4,new Date(god.getBirthday().getTime()));
        ps.setString(5,god.getEmail());
        ps.setString(6,god.getMobile());
        ps.setString(7,god.getCreate_user());
        ps.setString(8,god.getUpdate_user());
        ps.setInt(9,god.getIsdel());
        ps.execute();

    }
    public void updateGoddess(){

    }
    public void delGoddess(){

    }
    public List<Goddess> query() throws Exception{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");

        String result = null;
        List<Goddess> gs= new ArrayList<Goddess>();
        Goddess god = null;
        while(rs.next()){
            god = new Goddess();
            god.setUser_name(rs.getString("user_name"));
            god.setAge(rs.getInt("age"));
            gs.add(god);

            result = "name:"+rs.getString("user_name")+";age:"+rs.getInt("age");
            System.out.println(result);
        }
        return gs;
    }
    public Goddess get(){
        return null;
    }

}
