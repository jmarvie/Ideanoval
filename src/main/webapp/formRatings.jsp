<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="initial-scale=1, maximum-scale=1">

<link rel="stylesheet" href="webjars/bootstrap/3.2.0/css/bootstrap.min.css">

<title>Ajoutez votre idée</title>
</head>
<body>
	<h1>Proposez votre idée</h1>
	<form:form action="addIdeaRating" method="POST" modelAttribute="idea">
		<br/>
		<div class="form-group">
			<h4>Titre de l'idée</h4>
			<form:input type="text" path="title"/>
		</div>
		<br/>
		<div class="form-group">
			<h4>Description de l'idée</h4>
			<form:input type="textarea" path="description" />
		</div>
		<br/>
		<div class="form-group">
			<h4>Catégorie de l'idée</h4>
				<select name="id_category">
					<c:forEach items="${categories}" var="category">
						<option name="category" value="${category.id}">
						${category.name}
						</option>
					</c:forEach>
				</select>
		</div>
		<br/>
		<input type="submit" class="btn btn-default" value="Créez votre idée"/>
		</form:form>
<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>