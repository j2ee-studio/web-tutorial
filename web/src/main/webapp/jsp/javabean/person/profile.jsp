<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.ParseException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Person profile</title>
</head>
<body>

<header>
    <jsp:include page="../../template/header.jsp?title=Person profile"/>
</header>

<main>
    <p>This sample shows how to use java bean for encapsulate many objects is a single object</p>
    <jsp:useBean id="person" class="com.company.team.web.jsp.bean.PersonBean"/>

    <h3>Initial value (getProperty)</h3>
    <ol>
        <li><b>Name:</b>&nbsp;<i><jsp:getProperty name="person" property="name"/></i></li>
        <li><b>Birthday:</b> <i><jsp:getProperty name="person" property="birthdate"/></i></li>
        <li><b>Age: </b><i><jsp:getProperty name="person" property="age"/></i></li>
    </ol>

    <h3>Initial value (JSP Expression)</h3>
    <ol>
        <li><b>Name:</b>&nbsp;<i><%=person.getName()%></i></li>
        <li><b>Birthday:</b> <i><%=person.getBirthdate()%></i></li>
        <li><b>Age: </b><i><%=person.getAge()%></i></li>
    </ol>

    <h3>Value after setting property with setProperty</h3>
    <jsp:setProperty name="person" property="name" value="Sue"/>
    <fmt:parseDate var="birthday" value="2018-10-12 13:00:14" pattern="yyyy-MM-dd HH:mm:ss"/>
    <jsp:setProperty name="person" property="birthdate" value="${birthday}"/>
    <jsp:setProperty name="person" property="age" value="24"/>
    <ol>
        <li><b>Name:</b>&nbsp;<i><%=person.getName()%></i></li>
        <li><b>Birthday:</b> <i><%=person.getBirthdate()%></i></li>
        <li><b>Age: </b><i><%=person.getAge()%></i></li>
    </ol>

    <h3>Value after setting property with scriptlet</h3>
    <%
        try {
            person.setName("Bob");
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            person.setBirthdate(df.parse("2018-10-12 13:00:15"));
            person.setAge(31);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    %>
    <ol>
        <li><b>Name:</b>&nbsp;<i><jsp:getProperty name="person" property="name"/></i></li>
        <li><b>Birthday:</b> <i><jsp:getProperty name="person" property="birthdate"/></i></li>
        <li><b>Age: </b><i><jsp:getProperty name="person" property="age"/></i></li>
    </ol>

</main>

<footer>
    <%@include file="../../template/footer.jsp" %>
</footer>

</body>
</html>
