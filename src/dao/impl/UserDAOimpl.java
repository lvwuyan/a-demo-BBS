package dao.impl;

import dao.JDBCutil;
import dao.UserDAO;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAOimpl implements UserDAO {

    @Override
    public void updateUser(User user) {
        Connection connection = null;
        try {
            connection = JDBCutil.getConnection();
            String sql = "insert into user (name, password, tel, job,sex,sign) values (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setString(3,user.getTel());
            preparedStatement.setString(4,user.getJob());
            preparedStatement.setString(5,user.getSex());
            preparedStatement.setString(6,user.getSign());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCutil.closeConnection(connection);
        }
    }
}
