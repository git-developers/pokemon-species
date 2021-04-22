<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pokemon Lista</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/slick.css" />">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/slick-theme.css" />"/>
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />">
		
		<style type="text/css">
		    html, body {
		      margin: 0;
		      padding: 0;
		      background-color: #FFFFCC;
		    }
		
		    * {
		      box-sizing: border-box;
		    }
		
		    .slider {
		        width: 100%;
		        margin: 100px auto;
		    }
		
		    .slick-slide {
		      margin: 0px 20px;
		    }
		    
		    .slick-slide img {
		      width: 100%;
		    }
		    
		    .slick-prev:before,
		    .slick-next:before {
		      color: black;
		    }
		    
		    .slick-slide {
		      transition: all ease-in-out .3s;
		      opacity: .2;
		    }
		    
		    .slick-active {
		      opacity: .5;
		    }
		
		    .slick-current {
		      opacity: 1;
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
		      <h1>Pokemon List</h1>

				<div class="regular slider">
					<c:forEach items="${species.getSpecieLst()}" var="pokemon">
						<div style="cursor:pointer;" onclick="location.href='${baseUrl}/pokemon-species-detail?url=<c:out value="${pokemon.url}"/>';">
							<img src="https://via.placeholder.com/500x350/3399FF/000000/?text=<c:out value="${pokemon.name}"/>">
						</div>
					</c:forEach>
				</div>
		    </div>
		    <div class="col-sm-2 sidenav">
		      
		    </div>
		  </div>
		</div>
		

	
		<script src="https://code.jquery.com/jquery-2.2.0.min.js"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/slick.js" />" charset="utf-8"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />" charset="utf-8"></script>
		
		<script type="text/javascript">
			$(document).ready(function() {
				$('.regular').slick({
			        dots: true,
			        infinite: true,
			        slidesToShow: 3,
			        slidesToScroll: 3
				});
				
			});
		</script>
	</body>
</html>
