<%@ page import="java.sql.Connection" %>
<%@ page import="dao.getConn" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/25
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%


   Connection con=new getConn().getConn();
   String sql="select * from post";
    Statement stat = con.createStatement();
    ResultSet rs = stat.executeQuery(sql);


%>
<table bgcolor="#6495ed" width="100%">
    <tr ><td>类型</td><td>标题</td><td>作者</td><td>回复</td><td>时间</td></tr>
<%
    String type,theme,user_id,reply,time;
    while (rs.next()){
type=rs.getString("type");
theme=rs.getString("theme");
user_id=rs.getString("user_id");
reply=rs.getString("reply");
time=rs.getString("time");

%>
    <tr><td><%=type%></td>

        <td><%=theme%></td>
        <td><%=user_id%></td>
        <td><%=reply%></td>
        <td><%=time%></td>
       </tr>
    <%}%>
</table>
</body>
</html>
