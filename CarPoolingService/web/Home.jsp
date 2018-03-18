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

        <title>JSP Page</title>
    </head>
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
               overflow: hidden;
           }
    </style>
    <body>
        <%@include file="header.jsp" %>
        
                

        
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
