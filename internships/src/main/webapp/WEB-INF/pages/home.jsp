<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>List of offers</title>
</head>
<body>
<h1>List of offers</h1>
<p></p>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<th>Id</th>
<th>Nome da oferta</th>
<th>Sinopse</th>
<th>Data de candidatura</th>
<th></th>
</thead>
<tbody>
<c:forEach var="offer" items="${offers}">
<tr>
	<td>${offer.offerId}</td>
	<td>${offer.offerTitle}</td>
	<td>${offer.offerSynopsis}</td>
	<td>${offer.offerExpireDate}</td>
	<td>
		<a href="${pageContext.request.contextPath}/detail/${offer.offerId}.html">Ver detalhe</a> 
	</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>