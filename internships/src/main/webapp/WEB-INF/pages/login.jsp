<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<%@ include file="/WEB-INF/pages/includes/head.jsp" %>
	<body>
		<div class="container-fluid">
			<h1>Login Form</h1>
			<div id="login-box">
				<c:if test="${not empty error}">
					<p>${error}</p>
				</c:if>
				<c:if test="${not empty msg}">
					<p>${msg}</p>
				</c:if>
				<form name="login-action"  action="<c:url value='j_spring_security_check'/>" method='post'>
				  <div class="form-group">
				    <label for="usernameInput">Username</label>
				    <input type="text" class="form-control" id="usernameInput" placeholder="username" name="username" />
				  </div>
				  <div class="form-group">
				    <label for="passwordInput">Password</label>
				    <input type="password" class="form-control" id="passwordInput" placeholder="password" name="password" />
				  </div>
				  <button type="submit" class="btn btn-default" value="submit" name="submit">Submit</button>
				</form>
			</div>
			<hr></hr>
			<a href="${pageContext.request.contextPath}/">Home</a>
		</div>
	</body>
</html>