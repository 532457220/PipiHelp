<%--
  Created by IntelliJ IDEA.
  User: 53245
  Date: 2020/5/19
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <div id="login">
        <form action="login" method=post>
            <table>
                <tr>
                    <td>账号</td>
                    <td><input type="text" name="account"></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="登录"></td>
                </tr>
                <div><p class="error"><%=request.getAttribute("error")==null?"":request.getAttribute("error")%></p></div>
            </table>
        </form>
    </div>
</head>
<body>

</body>
</html>
