<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>首页</h1>
<%--${pageContext.request.contextPath}：EL表达式，获取上下文路径--%>
<a href="${pageContext.request.contextPath}/success">success.jsp</a>
</body>
</html>
