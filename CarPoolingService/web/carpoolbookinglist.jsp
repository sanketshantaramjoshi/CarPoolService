<%-- 
    Document   : carpoolbookinglist
    Created on : 21 Mar, 2018, 4:25:29 AM
    Author     : sanket
--%>


        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
         <%@include file="header.jsp" %>
         <br><br><br><br>
          <style>
table, td, th {    
    border: 1px solid #ddd;
    text-align: left;
}
table {
    border-collapse: collapse;
    width: 100%;
}
th, td {
    padding: 15px;
}
</style>

    
        <div class ="container">
        <table style="width: 100%">
           
        </table>
       <h2>List of Car Pool Booking</h2>
<table border="1">
    <thead >
    <th>Invoice ID</th>
    <th>Invoice Date</th>
    <th>Car ID</th>
    <th>Car Pool Booking ID</th>
    <th>Car Pool Booking Date</th>
    <th>Car Pool Booking Time</th>
    <th>Customer ID</th>
    <th>Route ID</th>
    <th>Number of Passenger</th>
    </thead>
    <tbody>
       
        
        <c:forEach  var="carpoolbooking" items="${carpoolbookingList}">
        <tr>
            <td><c:out value="${carpoolbooking.invoiceID}"/></td>
            <td><c:out value="${carpoolbooking.invoiceDate}"/></td>
            <td><c:out value="${carpoolbooking.carID}"/></td>
            <td><c:out value="${carpoolbooking.carpoolbookingID}"/></td>
            <td><c:out value="${carpoolbooking.carpoolbookingDate}"/></td>
            <td><c:out value="${carpoolbooking.carpoolbookingTime}"/></td>
            <td><c:out value="${carpoolbooking.customerID}"/></td>
            <td><c:out value="${carpoolbooking.routeID}"/></td>
            <td><c:out value="${carpoolbooking.numberofPassenger}"/></td>
             <td><a href="EditCarPoolBooking.jsp?carpoolbookingID=${carpoolbooking.carpoolbookingID}">DETAILS</a></td>
        </tr>
        </c:forEach>
    
       <c:if test="${empty carpoolbookingList}" var="cpbl">
             <%out.println("No record");%>  
        </c:if>
    </tbody>
    
</table>
        </div>
    
        <br><br><br><br>
   <%@include file="Footer.jsp" %>