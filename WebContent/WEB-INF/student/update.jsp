<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="ly.model.Student" %>
<%Student st=(Student)request.getAttribute("student"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="save.do" method="post">
<table>
<tr>
<td>姓名：</td>
<td><input type="text"  name="name" value="<%=st.getName()%>"></td>
</tr>
<tr>
<td>年龄：</td>
<td><input type="text"  name="age" value="<%=st.getAge()%>"></td>
</tr>
<tr>
<td><input type="hidden" name="id" value="<%=st.getId()%>"/></td>
<td><input type="submit" value="提交"/></td>
</tr>
</table>
</form>
</body>
</html>