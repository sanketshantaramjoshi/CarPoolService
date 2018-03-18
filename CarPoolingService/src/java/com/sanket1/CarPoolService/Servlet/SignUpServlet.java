/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolService.Servlet;

import com.sanket1.CarPoolingService.dao.CustomerDAO;
import com.sanket1.CarPoolingService.daoimpl.CustomerDAOImpl;
import com.sanket1.CarPoolingService.entities.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sanket
 */
public class SignUpServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                 String customerName;
            long customerContact;
            String customerGender;
            String customerEmail;
            String customerAddress;
            String customerDateOfBirth;
            String customerPassword;
            customerName = request.getParameter("customerName");
            customerContact = Long.parseLong(request.getParameter("customerContact"));
            customerGender = request.getParameter("custometGender");
            customerEmail = request.getParameter("custometEmail");
            customerAddress = request.getParameter("custometAddress");
            customerDateOfBirth = request.getParameter("customerDateOfBirth");
            customerPassword= request.getParameter("custometPassword");
            CustomerDAO customerDAO = new CustomerDAOImpl();
            int count = customerDAO.addCustomer(new Customer(customerName,customerContact,customerGender,customerEmail,customerAddress,customerDateOfBirth,customerPassword));
             RequestDispatcher rd = null;
            if(count>0){
               rd = request.getRequestDispatcher("Home.jsp");
            }
            else{
                rd = request.getRequestDispatcher("SignUp.jsp");
            }
            rd.forward(request,response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
