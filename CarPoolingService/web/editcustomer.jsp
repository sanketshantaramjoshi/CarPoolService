<%-- 
    Document   : editcustomer
    Created on : 24 Mar, 2018, 3:52:57 AM
    Author     : sanket
--%>

<%@page import="com.sanket1.CarPoolingService.daoimpl.CustomerDAOImpl"%>
<%@page import="com.sanket1.CarPoolingService.entities.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<p>
<form action="EditCustomer.do" method="get">

<%
Customer customer = new CustomerDAOImpl().getCustomerByID(Integer.parseInt(request.getParameter("customerID")));
request.setAttribute("customer",customer);
%>
<input type="hidden" name="customerID" value="${customer.customerID}" />
            Customer Name :<input type="text" name="customerName" value="${customer.customerName}" />
            <br/>
            Customer Contact :<input type="text" name="customerContact" value="${customer.customerContact}" />
            <br/>
            Customer Gender :<input type="text" name="customerGender" value="${customer.customerGender}" />
            <br/>
            Customer Email :<input type="text" name="customerEmail" value="${customer.customerEmail}" />
            <br/>
            Customer Address:<input type="text" name="customerAddress" value="${customer.customerAddress}" />
            <br/>
            Customer DateOFBirth :<input type="text" name="cuatomer DateOfBirth" value="${customer.customerDateOfBirth}" />
            <br/>
            Customer Password :<input type="text" name="customerPasword" value="${customer.customerPassword}"/>
            <br/>
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
   </p>
<%@include file="Footer.jsp" %>