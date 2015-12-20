<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="false" %>
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
			
			<c:choose>
				<c:when test="${not empty pageContext.request.userPrincipal}">
			<h3>
				Welcome : ${pageContext.request.userPrincipal.name} | <a
					href="javascript:formSubmit()"> Logout</a>
			</h3>
			<a href="${pageContext.request.contextPath}/internship/list.html">Listar ofertas</a><br/>
			<a href="${pageContext.request.contextPath}/internship/create.html">Criar nova oferta</a>
				</c:when>
				<c:otherwise>
			<h3>Welcome visitor, you should login <a href="${pageContext.request.contextPath}/login">here</a></h3>
				</c:otherwise>
			</c:choose>
		</div>
	</body>
</html>