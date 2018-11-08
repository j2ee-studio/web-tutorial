<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Install JSTL Library</title>
</head>
<body>

<header>
    <jsp:include page="../template/header.jsp?title=Install JSTL Library"/>
</header>

<main>
<p>To begin working with JSP tages you need to first install the JSTL library. If you are using the Apache Tomcat container, then follow these two steps −</p>
<p><b>Step 1</b> − Download the binary distribution from Apache Standard Taglib and unpack the compressed file.</p>
<p><b>Step 2</b> − To use the Standard Taglib from its <b>Jakarta Taglibs distribution</b>, simply copy the JAR files in the distribution's 'lib' directory to your application's <b>webapps\ROOT\WEB-INF\lib</b> directory.</p>
<p>To use any of the libraries, you must include a &lt;taglib&gt; directive at the top of each JSP that uses the library.</p>
</main>

<footer>
    <%@ include file="../template/footer.jsp" %>
</footer>

</body>
</html>
