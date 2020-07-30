<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin create</title>
</head>
<body>
	<h1>create a new admin</h1>
	<form action="/samplemavenproj/admin/login" method="post">
	username:<input type="text" name="un"/><br/>
	password:<input type="password" name="pass"/><br/>
	phone:<input type="text" name="phone"/><br/>
	<button>Login</button>
	</form>
	<h1>${message}</h1>
</body>
</html>