<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Food Order Portal</title>
</head>
<jsp:include page="./fragments/header.jsp" />
<body>
<div align="center">
<form:form action="login" modelAttribute="loginForm" method="post">
<table cellpadding="2px">
<tr><td>UserName:</td><td><form:input path="userName" id="name"/></td></tr>
<tr><td>Password:</td><td><input type="password" name="password" id="password"/></td></tr>
<tr><td colspan="2" align="center"><button name="submit"><img style="width: 84px; height: 26px" alt="login" src="/img/submit.jpg"></button></td></tr>
</table>
</form:form>
</div>
</body>
<jsp:include page="./fragments/footer.jsp" />
</html>