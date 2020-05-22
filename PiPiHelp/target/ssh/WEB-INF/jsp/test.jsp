<%--
  Created by IntelliJ IDEA.
  User: 53245
  Date: 2020/5/19
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <h2>test</h2>
    <c:if test="${sessionScope.admin1 != null}">当前用户：${admin.account}</c:if>
</head>
<body>

</body>
</html>
