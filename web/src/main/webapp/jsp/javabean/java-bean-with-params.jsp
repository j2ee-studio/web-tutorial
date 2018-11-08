<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Bean and Request Parameters</title>
</head>
<body>

<header>
    <jsp:include page="../template/header.jsp?title=Java Bean"/>
</header>

<main>
    <jsp:useBean id="msg" class="com.company.team.web.jsp.bean.MessageBean"/>
    <jsp:setProperty name="msg" property="message" param="msg"/>
    <h3>Message</h3>
    <jsp:getProperty name="msg" property="message"/>

    <jsp:useBean id="person" class="com.company.team.web.jsp.bean.PersonBean"/>
    <jsp:setProperty name="person" property="*"/>
    <h3>Person Profile</h3>
    <ol>
        <li><b>Name:</b>&nbsp;<i><jsp:getProperty name="person" property="name"/></i></li>
        <li><b>Birthday:</b>&nbsp;<i><jsp:getProperty name="person" property="birthdate"/></i>&nbsp;(This value is set by default.)</li>
        <li><b>Age:</b>&nbsp;<i><jsp:getProperty name="person" property="age"/></i></li>
    </ol>

</main>

<footer>
    <%@ include file="../template/footer.jsp" %>
</footer>

</body>
</html>
