<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/3/29
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add User</title>


    <script type="text/javascript">
        //添加用户
        function addUser() {
            var form = document.forms[0];
            form.action = "${pageContext.request.contextPath}/api/v3/city/addUser1";
            //form.action = "${pageContext.request.contextPath}/addUser2";
            //form.action = "${pageContext.request.contextPath}/addUser3";
            form.method = "post";
            form.submit();
        }
    </script>

</head>
<body>
<form>
    <table>
        <tr>
            <td>账号</td>
            <td>
                <input type="text" name="userName">
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input type="password" name="password">
            </td>
        </tr>
        <tr>
            <td> </td>
            <td>
                <input type="button" value="提交" onclick="addUser()">
            </td>
        </tr>
    </table>
</form>
</body>
</html>