<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Pokemon Details</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />">
		
		<style type="text/css">
		    html, body {
		      margin: 0;
		      padding: 0;
		      background-color: #FFFFCC;
		    }
		</style>
	
	</head>
	<body>
	
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>                        
		      </button>
		      <a class="navbar-brand" href="#">Pokemon</a>
		    </div>
		    <div class="collapse navbar-collapse" id="myNavbar">
		      <ul class="nav navbar-nav">
		        <li class="active"><a href="#">Home</a></li>
		        <li><a href="${baseUrl}/pokemon-species">Listar pokemon</a></li>
		      </ul>
		    </div>
		  </div>
		</nav>
		  
		<div class="container-fluid text-center">    
		  <div class="row content">
		    <div class="col-sm-2 sidenav">
		    </div>
		    <div class="col-sm-8 text-left"> 
		      <h1>Pokemon Details</h1>
		      
		      <img src="https://via.placeholder.com/500x350/3399FF/000000/?text=${specieDetail.getName()}" alt="" class="img-thumbnail">
		      
				<table class="table table-striped">
				  <thead>
				    <tr>
				      <th scope="col">property</th>
				      <th scope="col">value</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th scope="row">#</th>
				      <td>${specieDetail.getId()}</td>
				    </tr>
				    <tr>
				      <th scope="row">Name</th>
				      <td>${specieDetail.getName()}</td>
				    </tr>
				    <tr>
				      <th scope="row">base_happiness</th>
				      <td>${specieDetail.getBase_happiness()}</td>
				    </tr>
				    <tr>
				      <th scope="row">base_happiness</th>
				      <td>${specieDetail.getBase_happiness()}</td>
				    </tr>
				    <tr>
				      <th scope="row">capture_rate</th>
				      <td>${specieDetail.getCapture_rate()}</td>
				    </tr>
					<tr>
				      <th scope="row">color</th>
				      <td>${specieDetail.getColor().getName()}</td>
				    </tr>
					<tr>
				      <th scope="row">egg_groups</th>
				      <td>
				      	<ul>
						<c:forEach items="${specieDetail.getEgg_groups()}" var="egg_groups">
							<li>
								<c:out value="${egg_groups.name}"/>
							</li>
						</c:forEach>
				      	<ul/>
				      	</td>
				    </tr>
				    <tr>
				      <th scope="row">evolves_from_species</th>
				      <td>${specieDetail.getEvolves_from_species().getName()}</td>
				    </tr>
				    
				    <tr>
				      <th scope="row">flavor_text_entries</th>
				      <td>
				      	<ul>
						<c:forEach items="${specieDetail.getFlavor_text_entries()}" var="obj">
							<li>
								<c:out value="${obj.getFlavor_text()}"/>
							</li>
						</c:forEach>
				      	<ul/>
				      	</td>
				    </tr>
				    
				    
				  </tbody>
				</table>
		      
		    </div>
		    <div class="col-sm-2 sidenav">
		      
		    </div>
		  </div>
		</div>
		
		<footer class="container-fluid text-center">
		  <p>Pokemon &copy 2021</p>
		</footer>
	
		<script src="https://code.jquery.com/jquery-2.2.0.min.js"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />" charset="utf-8"></script>
		
		<script type="text/javascript">
			$(document).ready(function() {
								
			});
		</script>
	</body>
</html>
