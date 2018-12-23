package dao;


import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class userUtil {
    public User getUser(int id, String  name){

        Connection conn=new getConn().getConn();
        User user=null;
        ResultSet set=null;
        String sql="select * from user where ";
        if (name==null)
            sql+=" id=?;";
        else
            sql+=" name=?;";
        try {
            try (PreparedStatement pstat = conn.prepareStatement(sql)) {
                if (name==null)
                    pstat.setInt(1,id);
                else
                    pstat.setString(1, name);
                set = pstat.executeQuery();

                if (set.next()) {
                    String idS = String.valueOf(set.getInt(1));
                    String passwordS = set.getString(2);
                    String nameS=set.getString(3);
                    String telS=set.getString(4);
                    String jobS=set.getString(5);
                    String sexS=set.getString(6);
                    String signS=set.getString(7);
                    user = new User(idS, passwordS, nameS, telS, jobS, sexS, signS);

                }
            }
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public ArrayList<User> getAllUser(){
        ArrayList<User> userArrayList=new ArrayList<>();
        User user=null;
        Connection conn=new getConn().getConn();
        ResultSet set=null;
        String sql="select * from user;";
        try{
            try(PreparedStatement pstat=conn.prepareStatement(sql)) {
                set=pstat.executeQuery();

                while (set.next()){
                    user=new User(String.valueOf(set.getInt(1)),set.getString(2),set.getString(3),set.getString(4),set.getString(5),set.getString(6),set.getString(7));
                    userArrayList.add(user);
                }
            }
            conn.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return userArrayList;
    }

    public boolean insertUser(User user){

        int i=0;
        Connection conn=new getConn().getConn();
        System.out.println(user.toString());
        String sql="insert into user (id,password,name,tel,job,sex,sign) values(?,?,?,?,?,?,?);";
        try{
            try(PreparedStatement pstat=conn.prepareStatement(sql)) {
                pstat.setString(1,user.getId());
                pstat.setString(2, user.getPassword());
                pstat.setString(3,user.getName());
                pstat.setString(4,user.getTel());
                pstat.setString(5,user.getJob());
                pstat.setString(6,user.getSex());
                pstat.setString(7,user.getSign());
                i = pstat.executeUpdate();

                if (i > 0) {
                    System.out.println("插入成功" + new getUser().getUser(user.getName()));
                    return true;

                }

            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}