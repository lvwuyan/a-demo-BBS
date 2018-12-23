package dao;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getUser {

    public User getUser(String name){

        Connection conn=new getConn().getConn();
        User user=null;
        ResultSet set=null;
        String sql="select * from user where username=?; ";
        try {
            try (PreparedStatement pstat = conn.prepareStatement(sql)) {
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
}
