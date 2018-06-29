<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="updateLoc" method="post">
		<div class="container">
		    <!-- To id den prepei na allazei -->
		    <!-- Dinontas value gemizoume apo t arxi to input field -->
			id: <input type="text" name="id" value="${location.id}" readonly> 
			<br>
			code: <input type="text" name="code" value="${location.code}"> 
			<br> 
			Name: <input type="text" name="name" value="${location.name}"> 
			<br> 
			<!-- Elegxoume poio einai tsekarismeno -->
			Type: urban <input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}> 
			      rural <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}> 
			<br> 
			<input type="submit" value="update">
		</div>
	</form>
</body>
</html>