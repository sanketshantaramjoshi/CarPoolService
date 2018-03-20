<%-- 
    Document   : carpoolbookinglist
    Created on : 21 Mar, 2018, 4:25:29 AM
    Author     : sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <body>
        <%@include file="header.jsp" %>
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
        <%--<c:if test="not employeeList equals  null" var="emp">--%>
        
        <c:forEach  var="carpoolbooking" items="${carpoolbookinglist}">
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
            <td>Details</td>
            <td>Edit</td>
            <td>Delete</td>
            
        </tr>
        </c:forEach>
        <%--</c:if>--%>
        <c:if test="carpoolbookingList equals  null" var="carpoolbooking">
            <%out.println("No record");%>
        </c:if>
    </tbody>
    
</table>
    </body>
    </body>
</html>
