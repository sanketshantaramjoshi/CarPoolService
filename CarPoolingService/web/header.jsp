<%-- 
    Document   : header
    Created on : 16 Mar, 2018, 7:16:35 AM
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
 <script src="js/jquery-2.1.1.min.js"></script>
         <script src="js/bootstrap.min.js"></script>
        <title>JSP Page</title>
        <style>
         .navbar-wrapper
          {
              position: relative;
              z-index: 15;
          }
          .navbar .nav > li > a
          {
              color: #000;
              text-shadow:none;
          }
          .navbar .nav > li > a:hover
          {
              color:#000;
              background: none;
          }
          .navbar .nav .active > a
          {
              color: #000;
              background: none;
          }
          .navbar .nav .active > a:hover
          {
          background: none
          }
          .navbar-wrapper
          {
              margin-top:20px;
          }
            .navbar-wrapper .navbar
            {
                border-radius: 4px;
            }
        
           .carousel-inner img {
      width: 100%;
      height: 500px;  }
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
       
        
       </style>
    </head> 
    <body>
 
         <div class="container">
    <NAVBAR>
        <div class="navbar-wrapper">
            <div class="navbar navbar-inverse navbar-static-top">
                <div class="container">
                <div class="navbar-header">
                    <button class="navbar-toggle" data-target=".navbar-collapse" data-toggle="collapse" type="button">
                    <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                        <span class="icon-bar"></span></button>
                        <a class="navbar-brand" href="#">Cars</a>
                </div>
                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                           <li class="active">
                             <a href="Home.jsp">Home</a>
                           </li>
                           <li class="active">
                             <a href="AboutUs.jsp">AboutUs</a>
                           </li>
                           <li class="active">
                             <a href="ContactUs">ContactUs</a>
                           </li>
                           <li class="active">
                             <a href="Information.jsp">Information</a>
                           </li>
                            </ul>
                    </div>
                </div>
            </div>
        </div>
         </div> 
        
    </NAVBAR>
             <div id="myCarousel" class="carousel slide" >
  <ol class="carousel-indicators">
    <li class="active" data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="image1.jpeg" alt="Los Angeles" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Los Angeles</h3>
        <p>We had such a great time in LA!</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="image2.jpeg" alt="Chicago" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Chicago</h3>
        <p>Thank you, Chicago!</p>
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
    </body>
   
</html>