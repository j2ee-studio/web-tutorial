<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p>See the jsp source code these two tags are equal</p>

<p><%out.print(new Date());%></p>

<p>
    <%=new Date()%>
</p>

</body>
</html>
