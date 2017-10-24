<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List" %>
<%@page import="ly.model.Student" %>
<%String message=(String)request.getAttribute("message"); 
    List<Student> stList=(List<Student>)request.getAttribute("studentList");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
操作：<%=message%>
<table >
<tr>
<td>学号</td>
<td>年龄</td>
<td>姓名</td>
</tr>
<%for(int i=0;i<stList.size();i++){ %>
<tr>
<td><%=stList.get(i).getId()%></td>
<td><%=stList.get(i).getAge()%></td>
<td><%=stList.get(i).getName()%></td>
</tr>
<%} %>
</table>
</body>
</html>