<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="webjars/bootstrap/3.2.0/css/bootstrap.min.css">
<title>Inscrivez-vous et partagez vos idées</title>
</head>
<body>
	<h1>Inscription</h1><br />
		<form:form action="registration" method="POST" modelAttribute="user">
		<div class="form-group">
			<h3>Votre adresse mail</h3>
			<form:input type="email" placeholder="Adresse mail" path="email" />
		</div>
		<div class="form-group">
			<h3>Votre identifiant</h3>
			<form:input type="login" placeholder="Identifiant" path="login" />
		</div>
		<div class="form-group">
			<h3>Votre mot de passe</h3>
			<form:input type="password" placeholder="Mot de passe" path="password"/>
		</div><br />
		<div class="form-group">
			<input type="submit" value="Inscription" name="REGISTRATION" class="button" />
		</div>
		</form:form>
		
<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>