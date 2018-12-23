package dao;

import model.Comment;
import model.Post;
import model.User;

public interface CommentDAO {
    public void add(Comment comment, User user, Post post);
}
