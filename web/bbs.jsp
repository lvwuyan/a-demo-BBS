<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/25
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>期末</title>
    <style>
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        }

        li {
            float: left;
        }

        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li a:hover {
            background-color: #111;
        }
        .back {


            background-position: right bottom, left top;
            background-repeat: no-repeat, repeat;
            padding: 15px;
        }</style>
    <script src="../show.js"></script>
</head>

<body>
<div id="container" style="width:100%">

    <div id="header" class="back">
        <h1 align="center">BBS论坛</h1></div>

    <div id="menu">
        <ul>
            <li><a  href="#home">首页</a></li>
            <li><a onclick="show(1)">帖子</a></li>
            <li><a  href="#home">版块</a></li>
            <li><a  href="#home">帮助</a></li>
        </ul>


    </div>
    <div id="content" style=" height:600px;width: 100%">


    </div>

    <div id="footer" style="clear:both" align="center">
        版权 ©</div>

</div>

</body>
</html>
