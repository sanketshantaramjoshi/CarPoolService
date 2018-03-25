<%-- 
    Document   : PickUp
    Created on : 24 Mar, 2018, 2:08:36 AM
    Author     : sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>JSP Page</title>
        <style>
            
            
        </style>
    </head>
    <body>
         <div class="container">
	<div class="row">
            <form class="form-horizontal" action="PickUp.do" method="post">
            <br>
             <a href="Home.jsp">
    <img src="carpoollogo.png" alt="logo" style="width:40px;">
             </a>
            <br><br>
<fieldset>

<legend>Select pickup Route For Car Pooling on Transport your world</legend>
 
<div class="form-group">
  <label class="col-md-4 control-label" for="PickUpPoint">PickUpPoint</label>  
  <div class="col-md-5">
      <select name="pickupPoint" >
         <option value="Borivali">Borivali</option>
         <option value="Kandivali">Kandivali</option>
         <option value="Mald">Malad</option>
          <option value="Goregaon">Goregaon</option>
         <option value="Jogeshwari">Jogeshwari</option>
         <option value="Andheri">Andheri</option>
          <option value="Vile Parle">Vile Parle</option>
         <option value="Santacruz">Santacruz</option>
         <option value="Khar Road">Khar Road</option>
          <option value="Bandra">Bandra</option>
         <option value="Mahim Junction">Mahim</option>
         <option value="Matunga">Matunga</option>
          <option value="Dadar">Dadar</option>
         <option value="Elphinston">Elphinston</option>
         <option value="Lower Parel">Lower Parel</option>
          <option value="Mumbai Central">Mumbai Central</option>
         <option value="Grant Road">Grant Road</option>
         <option value="Charni Road">Charni Road</option>
          <option value="Marine Lines">Marine Lines</option>
         <option value=" Churchgate"> Churchgate</option>
         
      </select>                             
  
  </div>
</div>
         
 

             
          <div class="form-group">
  <label class="col-md-4 control-label" for="submit"></label>
  <div class="col-md-6">
    <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
  </div>
</div>       
      
            </form>
           <div class="col-lg-12 text-center">
                    <br> <br> <br>  <br>  <br>
                        <p>
                            &COPY; 2010 Transport your World Pvt Ltd, Inc.
                            &middot; <a href="Privacy">Privacy</a>
                            &middot; <a href="Terms and condition">Terms & condition</a>
                        </p>
                    </div>
          
    </body>
    </body>
</html>
