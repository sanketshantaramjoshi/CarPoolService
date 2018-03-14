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
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  
        <title>JSP Page</title>
        <style>
            .marketing
            {
                padding-left: 15px;
                padding-right: 15px;   
            }
            .marketing .col-lg-4
            {
                text-align:center;
                margin-bottom: 20px;
            }
            .marketing .col-lg-4 p
            {
                margin-left: 10px;
                margin-right: 10px;
                
            }
            footer
            {
               background-color: #000;
               padding: 50px;
            }
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
  <ul class=" nav navbar-nav">
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
        <img src="image1.jpeg" alt="image"  height="600px" width="100%">
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
      <img src="image2.jpeg" alt="Chicago" height="600px" width="100%"  >
       <div class="container">
      <div class="carousel-caption">
    <h1>CarPool</h1>
    <p>Lets ride today</p>
    <p>
        <a class="btn btn-large btn-primary" href="#">Sign in</a></p>
  </div>
    </div>
    </div>
    
    <div class="carousel-item">
      <img src="image3.jpeg" alt="New York"  height="600px" width="100%"      >
      <div class="carousel-caption">  
    </div>
  </div>
  </div>
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div> 
        
        
        <div class="container-marketing">
            <div class="row">
                <div class="col-lg-4">
                   <img src="image4.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="236"> 
                    <p><a class="btn btn-default" href="#">Book your car</a></p>
                </div>
            </div>
            <!-- col-lg-4 -->
            <div class="row">
                <div class="col-lg-4">
                    <img src="image5.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="236"> 
                    <p><a class="btn btn-default" href="#">Book your carpoolservice</a></p>
                </div>
            </div>
        </div> 
        <!-- col-lg-4 -->
         
        <footer>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <p class="pull-rigth"><a href="#">Back to top</a></p>
                        <p>
                            &COPY; 2018 Transport your company, Inc.
                            &middot; <a href="Privacy">Privacy</a>
                            &middot; <a href="Terms and condition">Terms & condition</a>
                        </p>
                    </div>
                </div>
            </div>
        </footer>
  
   


    </body>
   
</html>