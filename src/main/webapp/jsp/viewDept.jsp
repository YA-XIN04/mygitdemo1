<%--
  Created by IntelliJ IDEA.
  User: lx
  Date: 2021/2/24
  Time: 2:58 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>部门信息</title>
</head>
<body>
    <form>
        <table width="100%" border="1">
            <tr>
                <td>部门编号</td>
                <td>${dept.dept_id}</td>
            </tr>
            <tr>
                <td>部门名称</td>
                <td>${dept.dept_name}</td>
            </tr>
            <tr>
                <td>部门地址</td>
                <td>${dept.dept_address}</td>
            </tr>
        </table>
    </form>
</body>
</html>
