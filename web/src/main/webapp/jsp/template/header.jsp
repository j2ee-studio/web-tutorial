<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    function goBack() {
        window.history.back();
    }
</script>
<a href="<%=request.getContextPath()%>">Home</a>
<button type="button" name="back" onclick="goBack()">Back</button>
<%String title = request.getParameter("title");%>
<h1><%=title%></h1>
