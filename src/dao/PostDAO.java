package dao;

import model.Post;
import model.User;

public interface PostDAO {
    public void add(Post post, User user);
}
