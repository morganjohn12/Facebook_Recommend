<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="/favicon.png">

    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="css/main.css" />

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/show_hide.js"></script>
    <script type="text/javascript" src="js/itunes.js"></script>

    <title>Profile</title>
  </head>
  
  <body> 
  	<section>  
    <div class="navbar profile-navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand"href="#"><img src="img/recommend_small.png"/></a>
          	<input class="navbar-brand_search" value="Search Recommendations"/>
        </div>
        
        <div class="collapse mavbar-collapse">
      	</div>
      </div>
     </div>
   </section>
   <br /><br /><br /><br />
   <h3 class="h3_cat">Choose a catergory:</h3> <br/>
     	<h1 id="showMusic">Music</h1>
     		<c:forEach var="item" items="${music}">
     			<div class="alert1" > 
                   <h1 class="h1_like">${item.key}</h1><br />
                   <h3 class="h3_like">${item.count}</h3>
                   <img class="profile_like" src="img/like.png"/> 
           		</div> 
           		<br/><br/><br/><br/>     
            </c:forEach>
     	<br />
     
     <div class="moviescard">	
      <h1 id="showMovies">Movies</h1>
     		<c:forEach var="item" items="${movies}">
     		    <div class="alert2" > 
                   <h1 class="h1_like">${item.key}</h1><br />
                   <h3 class="h3_like">${item.count}</h3>
                   <img class="profile_like" src="img/like.png"/> 
           		</div>     
           		 <br/><br/><br/><br/><br/><br/><br/><br/> 
            </c:forEach>
        </div>
     	<br />
     	
     <div class="tvcard">	
      <h1 id="showTV">Tv Shows</h1>
     		<c:forEach var="item" items="${tv}">
        		<div class="alert3" >
                   <h1 class="h1_like">${item.key}</h1><br />
                   <h3 class="h3_like">${item.count}</h3>
                   <img class="profile_like" src="img/like.png"/> 
           		</div>
           		<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>   
            </c:forEach> 
    </div>
  </body>
</html>