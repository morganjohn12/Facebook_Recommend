<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="/favicon.png">

    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/slider.css" rel="stylesheet">
    <link rel="stylesheet" href="css/main.css" />

    <title>Facebook Recommend</title>




<title>fb login</title>
</head>


<body>
	<a href="signin"> Click here to log in with fb</a>
	<br /><br />
	<a href="ShowFriends">Show Friends after logging in</a>

  	<section>  
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand"href="wv.html"><img src=""/></a>
        </div>
        <div class="collapse navbar-collapse">
         

      <div class="move_menu">
      	
            <ul class="nav navbar-nav">
        <img class="home_img" src="img/facebook.png"/>
              <li> 
                  <form>                      
                      <h3 class="h3"> Email: </h3>
                      <input type="text" name="email" />
                      
                      <h3 class="h3">Password:</h3> 
                      <input type="password"/> <br />
                      <a href="signin">login</a>
                      <a href="ShowFriends">Show Friends after logging in</a>
                      ${map}
                  </form>
                </li>
            </ul>
          </div>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    </section>
    <section>
    <div class="body_content">
    	
    	<h1 class="h1_body">login, like, <h1 class="h1_strong"> explore</h1></h1>
    	<h1 class="h3_body">See what your friends are recommending to you on Facebook.</h1>
    </div>
    <img class="like" src="img/like.png" />
    </section>
    
      <div class="panel-footer">
        <p class="text-muted">Facebook Recommend | John Morgan | Nate Harman</p>
      </div>	
</body>
</html>