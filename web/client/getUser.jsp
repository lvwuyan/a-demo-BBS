<%@ page import="model.User" %>
<%@ page import="dao.getUser" %><%--
  Created by IntelliJ IDEA.
  User: 16670
  Date: 2018/12/23
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String name=request.getParameter("name");
    String password=request.getParameter("password");
    User user=new getUser().getUser(name);
    if (user!=null&&user.getPassword().equals(password)){
        session.setAttribute("user",user);
        System.out.println(session.getAttribute("user").toString());
%>
<jsp:forward page="登陆后的界面"></jsp:forward>
<%
    }
    else
        //登陆错误的界面
        response.sendRedirect("登陆错误的界面");
%>
</body>
</html>
