<%--
  Created by IntelliJ IDEA.
  User: Hossein
  Date: 10/20/2018
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<header>
    <jsp:include page="../template/header.jsp?title=Login"/>
</header>

<main>
    <form action="j_security_check" method="post">
        <table>
            <tr>
                <td><label for="username">User name:&nbsp;</label></td>
                <td><input type="text" name="j_username" id="username"></td>
            </tr>
            <tr>
                <td><label for="password">Password:&nbsp;</label></td>
                <td><input type="text" name="j_password" id="password"></td>
            </tr>
            <tr><td><input type="submit" value="Login"></td></tr>
        </table>
    </form>
</main>

<footer>
    <%@ include file="../template/footer.jsp" %>
</footer>

</body>
</html>
