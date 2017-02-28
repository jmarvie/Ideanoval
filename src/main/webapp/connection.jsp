<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="webjars/bootstrap/3.2.0/css/bootstrap.min.css">
<title>Connexion</title>
</head>
<body>
<h1>Connexion</h1>
<br/>
	<form:form action="connection" method="POST" modelAttribute="user">
		<div class="form-group">
			<h4>Votre adresse mail</h4>
			<form:input type="email" path="email" />
		</div>
		<div class="form-group">
			<h4>Votre mot de passe</h4>
			<form:input type="password" path="password"/>
		</div>
		<br />
		<input type="submit" value="Connection" name="CONNECTION" class="btn btn-default" />
		
	</form:form>
		
<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>