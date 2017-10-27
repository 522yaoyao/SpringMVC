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
操作：<%=message%><br>
<a href="<%=request.getContextPath()%>/student/preSave.do">添加</a>
<table >
<tr>
<td>学号</td>
<td>年龄</td>
<td>姓名</td>
<td>操作</td>
</tr>
<%for(int i=0;i<stList.size();i++){ %>
<tr>
<td><%=stList.get(i).getId()%></td>
<td><%=stList.get(i).getAge()%></td>
<td><%=stList.get(i).getName()%></td>
<td><a href="<%=request.getContextPath()%>/student/preSave.do?id=<%=stList.get(i).getId()%>">修改</a>&nbsp;&nbsp;
       <a href="<%=request.getContextPath()%>/student/delete.do?id=<%=stList.get(i).getId()%>">删除</a></td>
</tr>
<%} %>
</table>
</body>
</html>