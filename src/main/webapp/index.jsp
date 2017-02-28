<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Votre réseau social a des idées</title>

<meta name="viewport" content="initial-scale=1, maximum-scale=1">

<link rel="stylesheet" href="webjars/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">

</head>
<body>

<div class="page-header">
	
		<a href="gestionUsers">Gestion des utilisateurs</a>
		<c:if test="${sessionScope.id==null}">
			<h1>Bienvenue sur Ideanoval</h1>
		</c:if>
		<c:if test="${sessionScope.id!=null}">
			<h1>Bienvenue ${user.login}</h1>
		</c:if>
		<div class="navbar">
		<c:if test="${sessionScope.id==null}">
			<ul class="nav navbar-nav navbar-left">
				<li><a href="registration">Créez votre compte</a></li>
				<li><a href="connection">Connectez-vous</a></li>
			</ul>
		</c:if>
	
		<c:if test="${sessionScope.id!=null}">
			<ul class="nav navbar-nav navbar-left">
				<li><a href="addIdeaRating">Proposez une idée avec un vote</a></li>
				<li><a href="addIdeaSurvey">Proposez une idée avec un sondage</a></li>
				<li><a href="deconnection">Se déconnecter</a></li>
			</ul>
		</c:if>
	</div>
</div>

<div class="collapse navbar-collapse">
	<ul class="nav navbar-nav">
		<li><a href="">Classement 1</a></li>
		<li><a href="">Classement 2</a></li>
		<li><a href="">Classement 3</a></li>
	</ul>
</div><br />

<c:forEach items="${ideas}" var="idea">
<br/>
<div class="thumbnail">
	<h3>Idée n°<c:out value="${idea.id}"/></h3>
	<div class="title">Titre de l'idée</div>
	<c:out value="${idea.title}" /><br/>
	<div class="title">Description de l'idée</div>
	<c:out value="${idea.description}" /><br/>
	<div class="title">Catégorie de l'idée</div>
	<c:out value="${idea.category}" /><br/>
	<c:if test="${sessionScope.id!=null}">
	<a href="rating?id=${idea.id}">Votez pour cette idée</a>
	</c:if>
</div>
</c:forEach>

<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>

</body>
</html>