<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveLoc" method="post">
<div class="container">
  id: <input type="text" name="id">
  <br>
  code: <input type="text" name="code">
  <br>
  Name: <input type="text" name="name">
  <br>
  Type: urban <input type="radio" name="type" value="URBAN">
        rural <input type="radio" name="type" value="RURAL">
  <br>
  <input type="submit" value="save">
</div>
</form>
${msg}
</body>
</html>