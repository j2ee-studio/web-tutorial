<%--
  Created by IntelliJ IDEA.
  User: Hossein
  Date: 10/12/2018
  Time: 8:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://npci.com/taglib" prefix="t" %>
<html>
<head>
    <title>JSP - Custom Tags</title>
</head>
<body>

<header>
    <jsp:include page="../template/header.jsp?title=JSP - Custom Tags"/>
</header>

<main>
    <p>
        The line below is a simple taglib result<br/>
        <t:simple/>
    </p>

    <p>The random generated number which you can see below is a taglib result</p>
    <ul>
        <li>20-Digit: <t:prime length="20"/></li>
        <li>40-Digit: <t:prime length="40"/></li>
        <li>80-Digit: <t:prime length="80"/></li>
        <li>50-Digit (default): <t:prime/></li>
    </ul>

    <t:title>Hello</t:title>

    <t:ascii>H</t:ascii>
</main>

<footer>
    <%@ include file="../template/footer.jsp" %>
</footer>

</body>
</html>
