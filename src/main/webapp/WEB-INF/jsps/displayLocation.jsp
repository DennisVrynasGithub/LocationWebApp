<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- To taglib einai gia to JSTL  -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- M to proigoumeno tag kapoioi browsers petane sfalma kai t apofeugoume me auth ti grammi -->
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Locations:</h3>
	<!-- pinakas -->
	<table>
	    <!-- Epikefalides -->
		<tr>
			<th>id</th>
			<th>code</th>
			<th>name</th>
			<th>type</th>
		</tr>
        <!-- Automata gemizei grammes apo to locations tou Controller -->
		<c:forEach items="${locations}" var="location">
			<tr>
				<td>${location.id}</td>
				<td>${location.code}</td>
				<td>${location.name}</td>
				<td>${location.type}</td>
				<td><a href="deleteLocation?id=${location.id}">Delete</a></td>
				<td><a href="showLocation?id=${location.id}">Update</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
    <a href="showCreate">Add location</a>
</body>
</html>