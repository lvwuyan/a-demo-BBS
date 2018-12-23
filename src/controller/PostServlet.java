package controller;

import model.Comment;
import model.Post;
import model.User;
import service.PostService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PostServlet")
public class PostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("user");
        String method=request.getParameter("method");
        if(user == null){
            PrintWriter out=response.getWriter();
            out.print("<script>" +
                    "alert('请登录后进行操作！')" +
                    "</script>");
            out.flush();
            out.close();
        }
        else if(method=="publish"){
            Post post=new Post();
            post.setName(request.getParameter("name"));
            post.setTheme(request.getParameter("theme"));
            post.setContent(request.getParameter("content"));
            PostService postService=new PostService();
            postService.Published(user,post);
        }
        else if(method=="reply"){
            Comment comment=new Comment();
            comment.setContent(request.getParameter("content"));
            PostService postService=new PostService();
            postService.Reply(post,user,comment);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
