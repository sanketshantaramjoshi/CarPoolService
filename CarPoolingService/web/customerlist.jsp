<%-- 
    Document   : customerlist
    Created on : 24 Mar, 2018, 3:24:07 AM
    Author     : sanket
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<h2>List of Employees</h2>
<table border="1">
    <thead >
    
    <th>Customer Name</th>
    <th>Customer Contact</th>
     <th>Customer Gender</th>
    <th>Customer Email</th>
    <th>Customer Address</th>
    <th>Customer DateOfBirth</th>
    <th>Customer Password</th>
</thead>
    <tbody>
    <input type="hidden" name="cutomerList" value="${customerList}" />
      
        <%--<c:if test="not employeeList equals  null" var="emp">--%>
        <c:forEach  var="customer" items="${customerList}">
             <tr>
           
            <td><c:out value="${customer.customerName}"/></td>
            <td><c:out value="${customer.customerContact}"/></td>
            <td><c:out value="${customer.customerGender}"/></td>
            <td><c:out value="${customer.customerEmail}"/></td>
             <td><c:out value="${customer.customerAddress}"/></td>
            <td><c:out value="${customer.customerDateOfBirth}"/></td>
            <td><c:out value="${customer.cutomerPassword}"/></td>
        
            <td><a href="editCustomer.jsp?customerID=${customer.customerID}">Details</a></td>
        
        </tr>
        </c:forEach>
        <%--</c:if>--%>
        <c:if test="${empty customerList}" var="cst">
            <%out.println("No record");%>
        </c:if>
    </tbody>
    
</table>
   
<%@include file="Footer.jsp" %>