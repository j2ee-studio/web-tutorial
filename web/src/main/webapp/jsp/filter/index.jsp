<%--
  Created by IntelliJ IDEA.
  User: Hossein
  Date: 10/20/2018
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Filter</title>
</head>
<body>

<header>
    <jsp:include page="../template/header.jsp?title=Filter"/>
</header>

<main>
    <p><a href="download.jsp?region=IR">Download</a> (request from Iran <i><b>restricted</b></i> region)</p>
    <p><a href="download.jsp?region=US">Download</a> (request from US region)</p>
    <a href="download.jsp">Download</a>

    <p><a href="../admin/admin-console.jsp">Admin Console</a></p>

</main>

<footer>
    <%@ include file="../template/footer.jsp" %>
</footer>

</body>
</html>
