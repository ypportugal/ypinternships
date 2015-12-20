<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<%@ include file="/WEB-INF/pages/includes/head.jsp" %>
	<body>
		<div class="container-fluid">
			<c:url value="/j_spring_security_logout" var="logoutUrl" />
			
			<!-- csrt support -->
			<form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" 
				name="${_csrf.parameterName}"
				value="${_csrf.token}" />
			</form>
			
			<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
			</script>
			
			<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h3>
				Welcome : ${pageContext.request.userPrincipal.name} | <a
					href="javascript:formSubmit()"> Logout</a>
			</h3>
			</c:if>
		
			<h1>Create new offer</h1>
			<form:form method="POST" commandName="internship"
				action="${pageContext.request.contextPath}/internship/create.html">
				<div class="form-group">
			    	<label for="titleInput">Title</label>
			    	<form:input path="title" type="text" class="form-control" id="titleInput"/>
			  	</div>
				<div class="form-group">
			    	<label for="datepicker">Deadline</label>
			    	<form:input path="expireDate" type="text" class="form-control" id="datepicker"/>
			  	</div>
				<div class="form-group">
			    	<label for="localInput">Local</label>
			    	<form:input path="location" type="text" class="form-control" id="localInput"/>
			  	</div>
				<div class="form-group">
			    	<label for="descriptionInput">Description</label>
			    	<form:input path="description" type="text" class="form-control" id="descriptionInput"/>
			  	</div>
				<button type="submit" class="btn btn-default" value="submit" name="submit">Create offer</button>
			</form:form>
			<hr></hr>
			<p>
				<a href="${pageContext.request.contextPath}/internship/list">List</a>
			</p>
		</div>
	</body>
</html>