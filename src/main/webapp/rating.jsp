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
<title>Votez pour cette idée</title>
</head>
<body>
<h1>Votez pour l'idée n°${ideaToVote.id}</h1>
<h3>Titre de l'idée : ${ideaToVote.title}</h3>
<h3>Description de l'idée : ${ideaToVote.description}</h3>
<form method="POST" action="rating">
<div>
	<input type="radio" name="top"> Top</input>
</div>
<div>
	<input type="radio" name="flop"> Flop</input>
</div><br />
<div>
	<input type="submit" value="Soumettez votre vote"/>
</div>
</form>
<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>

</body>
</html>