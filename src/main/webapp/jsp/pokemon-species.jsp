<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pokemon Details</title>
		<link rel="stylesheet" type="text/css" href="https://www.jqueryscript.net/demo/Fully-Responsive-Flexible-jQuery-Carousel-Plugin-slick/css/slick.css"/>
		<link rel="stylesheet" type="text/css" href="https://www.jqueryscript.net/demo/Fully-Responsive-Flexible-jQuery-Carousel-Plugin-slick/css/style.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
		<script type="text/javascript" src="https://www.jqueryscript.net/demo/Fully-Responsive-Flexible-jQuery-Carousel-Plugin-slick/js/slick.js"></script>
	
		<style>
			h3 {
			    font-size: 36px;
			    line-height: 100px;
			    background: #ccc;
			    color: #3498db;
			    margin: 10px;
			    padding: 2%;
			    text-align: center;
			}
			.slick-dots {
			    bottom: -30px;
		    }
		</style>
	
	</head>
	<body>
	
		<h2>Pokemon-species</h2>
		
		<div class="slider multiple-items">
			<c:forEach items="${species.getSpecieLst()}" var="pokemon">
				<div class="multiple">
					<h3><c:out value="${pokemon.name}"/></h3>
				</div>
			</c:forEach>
		</div>
	
		<script type="text/javascript">
			$(document).ready(function() {
				$('.multiple-items').slick({
				  dots: true,
				  infinite: true,
				  speed: 300,
				  slidesToShow: 3,
				  slidesToScroll: 3
				});
			});
		</script>
	</body>
</html>
