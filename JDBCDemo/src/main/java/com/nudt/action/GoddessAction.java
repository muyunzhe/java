package com.nudt.action;

import com.nudt.dao.GoddessDao;
import com.nudt.model.Goddess;

import java.util.Date;
import java.util.List;

/**
 * Created by jeffrey on 15-11-30.
 */
public class GoddessAction {
    public static void main(String [] args) throws Exception{
        Goddess god = new Goddess();
        god.setAge(24);
        god.setUser_name("姗姗");
        god.setBirthday(new Date());
        god.setEmail("l@sina.com");
        god.setMobile("2134234234");
        god.setCreate_user("admin");
        god.setUpdate_user("admin");
        god.setIsdel(1);
        god.setSex(1);

        GoddessDao gd = new GoddessDao();
        gd.addGoddess(god);
        List<Goddess> gs = gd.query();
        for(Goddess goddess : gs){
            System.out.println(goddess.getUser_name() +"," +goddess.getAge());
        }
    }
}
