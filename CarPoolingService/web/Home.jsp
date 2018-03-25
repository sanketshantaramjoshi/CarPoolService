<%-- 
    Document   : home
    Created on : 12 Mar, 2018, 8:01:17 AM
    Author     : sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
    <head>
         <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
           <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <style>
          .carousel
            {
                margin-bottom: 60px;
                margin-top: 90px;
            }
            .carousel-caption
            {
                z-index: 10;
            }
            .carousel .item
            {
                height: 50px;
                background-color: #777;
            }
            .carousel-inner > .item > img
            {
                position: absolute;
                top: 0;
                left:0;
                min-width: 100%;
                height: 500px;
            }
            .carousel-caption p
            {
             margin-bottom: 20px;
             font-size: 21px;
             line-height: 1.4;
            }
        
    </style>
    <body>
       
        
            <div id="demo" class="carousel slide" data-ride="carousel">
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
   
  </ul>
   
  <div class="carousel-inner">
    <div class="carousel-item active">  
        <img src="image1.jpeg" alt="image"  height="100%" width="100%">
      <div class="container">
      <div class="carousel-caption">
    <h1>Transport Your World</h1>
    <p>Lets ride today</p>
    <p>
        <a class="btn btn-large btn-primary" href="SignIn.jsp">SignIn</a></p>
  </div>
    </div>
    </div>
    <div class="carousel-item">
      <img src="image2.jpeg" alt="Chicago" height="100%" width="100%"  >
       <div class="container">
      <div class="carousel-caption">
    <h1>Transport Your World</h1>
    <p>Lets ride today</p>
    <p>
        <a class="btn btn-large btn-primary" href="SignUp.jsp">SignUp</a></p>
      </div>
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

        
        <br><br>
        <div class="container">
    <div class="row">
         <div class="container-marketing">
            <div class="row">
                <div class="col-lg-6">
                   <img src="image4.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="236"> 
                    <p><a class="btn btn-default" href="SignIn.jsp">Book your car</a></p>
                </div>
            </div>
         </div>


            <div class="row">
                <div class="col-lg-6">
                    <img src="image2.jpeg" class="rounded-circle" alt="Cinque Terre" width="304" height="236"> 
                    <p><a class="btn btn-default" href="SignUp.jsp">Book your carpoolservice</a></p>
                </div>
            </div>

  </div>
        </div>
        <%@include file="Footer.jsp" %>
    </body>
</html>
