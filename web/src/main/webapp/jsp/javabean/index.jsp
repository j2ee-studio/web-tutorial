<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Bean</title>
</head>
<body>

<header>
    <jsp:include page="../template/header.jsp?title=Java Bean"/>
</header>

<main>
    <p><a href="person/profile.jsp">Introducing to java bean</a></p>
    <p><a href="java-bean-with-params.jsp?msg=Everything is successful.&name=Sandy&age=12">Java bean with request parameters</a></p>
</main>

<footer>
    <%@ include file="../template/footer.jsp" %>
</footer>

</body>
</html>
