package dao.impl;

import dao.JDBCutil;
import dao.PostDAO;
import model.Post;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostDAOimpl implements PostDAO {
    @Override
    public void add(Post post, User user) {
        Connection connection = null;
        try {
            connection = JDBCutil.getConnection();
            String sql = "insert into post (name, theme, content,user_id) values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,post.getName());
            preparedStatement.setString(2,post.getTheme());
            preparedStatement.setString(3,post.getContent());
            preparedStatement.setInt(4,user.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCutil.closeConnection(connection);
        }
    }
}
