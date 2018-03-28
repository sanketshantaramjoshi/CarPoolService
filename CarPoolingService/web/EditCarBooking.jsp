<%-- 
    Document   : EditCarBooking
    Created on : 27 Mar, 2018, 2:39:18 PM
    Author     : sanket
--%>

<%@page import="com.sanket1.CarPoolingService.daoimpl.CarBookingDAOImpl"%>
<%@page import="com.sanket1.CarPoolingService.entities.CarBooking"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class ="container">
<p>
<form action="EditCarBookingServlet.do" method="get">
    <br><br>
<%
CarBooking carbooking = new CarBookingDAOImpl().getCarBookingByID(Integer.parseInt(request.getParameter("carbookingID")));
request.setAttribute("carbooking",carbooking);
%>  
<h1> Update Customer </h1>
              <br>
            <input type="hidden" name="carbookingID" value="${carbooking.carbookingID}" />
            
            <label class="col-md-4 control-label" > CarID</label>
            <div class="col-md-5">
            <input type="text" name="carID" value="${carbooking.carID}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >CustomerID</label>
            <div class="col-md-5">
            <input type="text" name="customerID" value="${carbooking.customerID}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >CarBooking Date</label>
            <div class="col-md-5">
            <input type="text" name="carbookingDate" value="${carbooking.carbookingDate}" />
            </div>
            <br><br>
            
            
            <label class="col-md-4 control-label" >CarBooking Time</label>
            <div class="col-md-5">
            <input type="text" name="carbookingTime" value="${carbooking.carbookingTime}" />
            </div>
            <br><br>
        
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
</p>
</div>
<%@include file="Footer.jsp" %>
