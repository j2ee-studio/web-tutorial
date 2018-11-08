<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request Counter</title>

    <script type="text/javascript" src="../scripts/common.js"></script>
</head>
<body>
<header>
    <a href="<%=request.getContextPath()%>">Home</a>
    <a href="javascript:goBack()">Back</a>
</header>
<main>
    <%! private int counter = 0;%>
    <p>Count of request on this page: <%=++counter%></p>
</main>
<footer>

</footer>
</body>
</html>
