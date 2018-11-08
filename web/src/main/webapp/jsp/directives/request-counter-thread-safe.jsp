<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isThreadSafe="false" %>

<html>
<head>
    <title>Request Counter (Thread Safe)</title>
</head>
<body>
<header>
    <jsp:include page="../template/header.jsp?title=Request Counter (Thread Safe)"/>
</header>
<main>
    <p>Directive <i>isThreadSafe</i> cause the generated servlet to implement <b>SingleThreadModel</b>.</p>
    <%! private int counter = 0;%>
    <p>Count of request on this page: <%=++counter%></p>
</main>
<footer>
    <%@include file="../template/footer.jsp" %>
</footer>
</body>
</html>
