<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

	<script src="//code.jquery.com/jquery-1.10.2.js"></script>

	<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

	<link rel="stylesheet" href="/resources/demos/style.css">
<script>
	$(function() {

		$("#datepicker").datepicker();

	});
</script>


<title>Criar nova oferta</title>
</head>
<body>
	<h1>Criar nova oferta</h1>
	<form:form method="POST" commandName="offer"
		action="${pageContext.request.contextPath}/offer/create.html">
		<table>
			<tbody>
				<tr>
					<td>Titulo a apresentar:</td>
					<td><form:input path="offerTitle" /></td>
				</tr>
				<tr>
					<td>Resumo da oferta:</td>
					<td><form:input path="offerSynopsis" /></td>
				</tr>
				<tr>
					<td>Data limite de candidatura:</td>
					<td><form:input path="offerExpireDate" id="datepicker" /></td>
				</tr>
				<tr>
					<td>Detalhe da oferta:</td>
					<td><form:input path="offerDetailText" /></td>
				</tr>
				<tr>
					<td>Email de candidatura:</td>
					<td><form:input path="offerApplyEmail" type="email" /></td>
				</tr>
				<tr>
					<td>Responsável pela oferta:</td>
					<td><form:input path="offerResponsiblePersonName" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Criar Oferta" /></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</form:form>

	<p>
		<a href="${pageContext.request.contextPath}/index.html">Home page</a>
	</p>
</body>
</html>