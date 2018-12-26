<%--
  Created by IntelliJ IDEA.
  User: 阿布c
  Date: 2018/12/22
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <style>
      .div1{margin:200px auto;width:300px;height:200px;border:5px outset #FC6}
    </style>
  </head>

  <body>
  <br />
  <br />
  <h1 align="center">BBS论坛</h1>
  <div class="div1" >
    <table>

        <br />
        <br />
      <tr>
        <form action="../client/getUser.jsp">

        <td width="100" align="center">用户名 :</td><td><input type="text"  name="name"/></td>
      <tr>

        <td width="100" align="center">密码 :</td><td><input type="password"  name="password" /></td></tr>

      <tr>
      <tr><br />
      </tr>
      <td width="100" ></td><td><input type="submit"  value="登录"/><input type="button"  value="注册" onclick="window.location.href='zc.html'" /></td></tr>
      </form>
    </table>
  </div>

  <div id="footer" style="text-align:center;">
    版权 ©唐钰慧</div>
  </body>

</html>
