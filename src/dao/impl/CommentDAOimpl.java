package dao.impl;

import dao.CommentDAO;
import dao.JDBCutil;
import model.Comment;
import model.Post;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommentDAOimpl implements CommentDAO {
    @Override
    public void add(Comment comment, User user, Post post) {
        Connection connection = null;
        try {
            connection = JDBCutil.getConnection();
            String sql = "insert into comment (id, content,user_id,post_id) values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,comment.getId());
            preparedStatement.setString(2,comment.getContent());
            preparedStatement.setInt(3,user.getId());
            preparedStatement.setInt(4,post.getPostid());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCutil.closeConnection(connection);
        }
    }
}
