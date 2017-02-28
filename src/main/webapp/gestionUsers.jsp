<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page de gestion des utilisateurs</title>

<meta name="viewport" content="initial-scale=1, maximum-scale=1">

<link rel="stylesheet" href="webjars/bootstrap/3.2.0/css/bootstrap.min.css">

</head>
<body>
<h1>Tableau d'administration des utilisateurs</h1><br/>
<table class="table table-hover">
  	<thead>
	    <tr>
	        <th>Identifiant</th>
	        <th>Adresse mail</th>
	        <th>Login</th>
	        <th>Mot de passe</th>
	    </tr>
	</thead>
	<tbody>
	<c:forEach items="${users}" var="user">
	<tr>
		<td><c:out value="${user.id}"/></td>
		<td><c:out value="${user.email}"/></td>
		<td><c:out value="${user.login}"/></td>
		<td><c:out value="${user.password}"/></td>
		<td><a href=""><button>Nommer administrateur</button></a>
		<td><a href=""><button>Désactiver le compte</button></a>
	</tr>
	</c:forEach>
	</tbody>	
</table>

<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>