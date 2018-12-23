package service;

import dao.CommentDAO;
import dao.PostDAO;
import dao.impl.CommentDAOimpl;
import dao.impl.PostDAOimpl;
import model.Comment;
import model.Post;
import model.User;

public class PostService {
    public void Published(User user, Post post){
        PostDAO postDAO=new PostDAOimpl();
        postDAO.add(post,user);
    }
    public void Reply(Post post, User user, Comment comment){
        CommentDAO commentDAO=new CommentDAOimpl();
        commentDAO.add(comment,user,post);
    }
}
