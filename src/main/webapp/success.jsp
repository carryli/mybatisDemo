<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<a>Login success !!!!</a>
	<c:if test="${users != null}">
		<tr>
			<td>User List</td>
		</tr>
		<c:forEach items="${users}" var="guest">
			<li><tr>
				<td>${guest.username}</td>
				<td>${guest.password}</td>
				<td><a href="remove.html?userid=${guest.id}">Remove</a></td>
			</tr></li>
		</c:forEach>
	</c:if>
</body>
</html>