<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Jsp Overview</title>

    <script type="text/javascript" src="<%=request.getContextPath()%>/scripts/common.js"></script>
</head>
<body>

<header>
    <jsp:include page="template/header.jsp?title=Jsp Overview"/>
</header>

<main>
    <p><a href="request-counter.jsp">Request Counter</a></p>
    <p><a href="directives/index.jsp">Jsp Directives</a></p>
    <p><a href="javabean/index.jsp">Java Bean</a></p>
    <p><a href="jstl/index.jsp">JSTL (JSP Standard Tag Library)</a></p>
    <p><a href="tags/index.jsp">JSP Custom Tags</a></p>
    <p><a href="filter/index.jsp">Filter</a></p>
</main>

<footer>
    <%@ include file="template/footer.jsp" %>
</footer>

</body>
</html>
