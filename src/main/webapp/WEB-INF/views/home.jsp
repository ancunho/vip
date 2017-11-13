<%--
  Created by IntelliJ IDEA.
  User: Ahn
  Date: 2017/11/13
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String aaa = (String) request.getAttribute("ccccc");
    System.out.print(">>>>>");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=aaa%>
</body>
</html>
