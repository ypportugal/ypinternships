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
			
			<h2>${internship.title}</h2>
			<h3>Local</h3>
			<p class="bg-info">${internship.location}</p>
			<h3>Description</h3>
			<p class="bg-info">${internship.description}</p>
			<h3>Publication date</h3>
			<p class="bg-info">${internship.publishDate}</p>
			<h3>Deadline</h3>
			<p class="bg-info">${internship.expireDate}</p>
			
			<hr></hr>
			
			<p><a href="${pageContext.request.contextPath}/internship/list">Other offers</a></p>
		</div>
	</body>
</html>