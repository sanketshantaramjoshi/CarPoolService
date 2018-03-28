<%-- 
    Document   : EditCarPoolBooking
    Created on : 28 Mar, 2018, 12:20:15 PM
    Author     : sanket
--%>

<%@page import="com.sanket1.CarPoolingService.daoimpl.CarPoolBookingDAOImpl"%>
<%@page import="com.sanket1.CarPoolingService.entities.CarPoolBooking"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class ="container">
<p>
<form action="EditCarPoolBookingServlet.do" method="get">
    <br><br>
<%
CarPoolBooking carpoolbooking = new CarPoolBookingDAOImpl().getCarPoolBookingByID(Integer.parseInt(request.getParameter("carpoolbookingID")));
request.setAttribute("carpoolbooking",carpoolbooking);
%>  
<h1> Update Customer </h1>
              <br>
            <input type="hidden" name="carpoolbookingID" value="${carpoolbooking.carpoolbookingID}" />
            
            <label class="col-md-4 control-label" >InvoiceDate</label>
            <div class="col-md-5">
            <input type="text" name="invoiceDate" value="${carpoolbookingID.invoiceDate}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >CarPoolBookingDate</label>
            <div class="col-md-5">
            <input type="text" name="carpoolbookingDate" value="${carpoolbookingID.carpoolbookingDate}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >CarPoolBookingTime</label>
            <div class="col-md-5">
            <input type="text" name="carpoolbookingTime" value="${carpoolbookingID.carpoolbookingTime}" />
            </div>
            <br><br>
            
            
            <label class="col-md-4 control-label" >No. of Passenger</label>
            <div class="col-md-5">
            <input type="text" name="numberofPassenger" value="${carpoolbookingID.numberofPassenger}" />
            </div>
            <br><br>
            
            
           
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
</p>
</div>
<%@include file="Footer.jsp" %>
