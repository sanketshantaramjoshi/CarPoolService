<%-- 
    Document   : EditPickUp
    Created on : 28 Mar, 2018, 11:15:22 AM
    Author     : sanket
--%>

<%@page import="com.sanket1.CarPoolingService.daoimpl.PickUpDAOImpl"%>
<%@page import="com.sanket1.CarPoolingService.entities.PickUp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class ="container">
<p>
<form action="EditPickUpServlet.do" method="get">
    <br><br>
<%
PickUp pickup = new PickUpDAOImpl().getPickUpByID(Integer.parseInt(request.getParameter("pickupID")));
request.setAttribute("pickup",pickup);
%>  
<h1> Update Car </h1>
              <br>
            <input type="hidden" name="pickupID" value="${pickup.pickupID}" />
            
            <label class="col-md-4 control-label" > PickupPoint</label>
            <div class="col-md-5">
            <input type="text" name="pickupPoint" value="${pickup.pickupPoint}" />
            </div>
            <br><br>
            
           
            
            
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
</p>
</div>
<%@include file="Footer.jsp" %>
