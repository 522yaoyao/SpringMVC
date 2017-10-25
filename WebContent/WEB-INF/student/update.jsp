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
<table>
<tr>
<td>姓名：</td>
<td><input type="text" value="<%=st.getName()%>"></td>
</tr>
<tr>
<td>学号：</td>
<td><input type="text" value="<%=st.getId()%>"></td>
</tr>
<tr>
<td>年龄：</td>
<td><input type="text" value="<%=st.getAge()%>"></td>
</tr>
</table>
</body>
</html>