package dao;

import model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertUser {
    public boolean insertUser(User user){
        boolean result=false;
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
                    result = true;
                    System.out.println("插入成功" + new getUser().getUser(user.getName()));
                }

            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}