package controller;

import dao.insertUser;
import dao.userUtil;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//注册
@WebServlet(name = "insertServlet")
public class insertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Cache-Control","no-cache");
        response.setContentType("text/html;charser=utf-8");
        String id=request.getParameter("id");
        String password=request.getParameter("password");
        String name=request.getParameter("name");
        String tel=request.getParameter("tel");
        String job=request.getParameter("job");
        String sex=request.getParameter("sex");
        String sign=request.getParameter("sign");
        //生成要插入的user
        User user = new User(null,password,name,tel,job,sex,sign);
        //插入
        new insertUser().insertUser(user);
        //查询user
        userUtil userUtil=new userUtil();
        user=userUtil.getUser(-1,name);
        HttpSession session=request.getSession();
        session.setAttribute("user", user);
        System.out.println("registerSeesion:"+session.getAttribute("user"));
        System.out.println("registerUser:"+user);
        //返回的界面
        response.sendRedirect("");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
