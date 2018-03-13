<%-- 
    Document   : Header
    Created on : 12 Mar, 2018, 7:13:34 AM
    Author     : sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
        <style>
           .carousel 
           {
               position: relative; 
               top:0; 
           }
           .carousel-inner 
           {
               position: relative; 
               width: 100%;
               overflow: hidden;}
           
         .navbar 
          {
        
    position:absolute;
    top:30px;
    z-index:10;
    width:60%;
    opacity: 0.5;
   
         }
         body
         {
             font-size-adjust:20;
         }
       </style>
    </head> 
    <body>
 
         <div class="container">
     <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="#">
    <img src="carpoollogo.png" alt="logo" style="width:40px;">
  </a>
  
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item active">
        <a class="nav-link" href="Home.jsp">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="ContactUs">ContactUs</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="AboutUs">AboutUs</a>
    </li>
     <li class="nav-item">
      <a class="nav-link" href="Information">Information</a>
    </li>
  </ul>
</nav>
         </div>
                
        
        
        
        
<div id="demo" class="carousel slide" data-ride="carousel">
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
   
  <div class="carousel-inner">
    <div class="carousel-item active">  
        <img src="image4.jpg" alt="image"  height="800px" width="100%">
      <div class="container">
      <div class="carousel-caption">
    <h1>CarPool</h1>
    <p>Lets ride today</p>
    <p>
        <a class="btn btn-large btn-primary" href="#">Sign Up</a></p>
  </div>
    </div>
    </div>
    <div class="carousel-item">
      <img src="image2.jpg" alt="Chicago" height="800px" width="100%"  >
       <div class="container">
      <div class="carousel-caption">
    <h1>CarPool</h1>
    <p>Lets ride today</p>
    <p>
        <a class="btn btn-large btn-primary" href="#">Sign in</a></p>
  </div>
    </div>
    </div>
    </div>
    <div class="carousel-item">
      <img src="image3.jpg" alt="New York"  height="800px" width="100%" >
      <div class="carousel-caption">  
    </div>
  </div>
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div> 

  
  
  
</div>

    </body>
   
</html>