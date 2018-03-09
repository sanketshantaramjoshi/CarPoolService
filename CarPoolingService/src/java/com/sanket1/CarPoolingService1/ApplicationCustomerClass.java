/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService1;

import com.sanket1.CarPoolingService.dao.CustomerDAO;
import com.sanket1.CarPoolingService.daoimpl.CustomerDAOImpl;
import com.sanket1.CarPoolingService.entities.Customer;
import java.util.List;







/**
 *
 * @author sanket
 */
public class ApplicationCustomerClass {

    public static void main(String[] args){
        CustomerDAO customerDAO = new CustomerDAOImpl();
     //  int count;
//       count = customerDAO.addCustomer(new Customer("Amit",1235578900,"male","Amit123@","borivali","09/12/2014","sanket1244555"));
//       if(count>0)System.out.println("Record Added Successfully");
//        else System.out.println("Record Failed to get added");
//          count=customerDAO.deleteCustomer(2);
//        if(count>0)System.out.println("Record Deleted Successfully");
//          else System.out.println("Record Failed to get deleted");
       // Customer customer = new Customer(1,"sanjaya",720897045,"female","sanjaya@gmail.com","borivali","13/12/2014");
        // count=customerDAO.updateCustomer(1, customer);
       // if(count>0)System.out.println("Record Updated Successfully");
       //else System.out.println("Record Failed to get updated");
//        List<Customer> customerlist = customerDAO.getAllCustomer();
//        for(Customer cust: customerlist){
//            System.out.println(cust.getCustomerID()+ "|" + cust.getCustomName()+ "|" + cust.getCustomerContact() + "|" + cust.getCustomerGender()+ "|" + cust.getCustomerEmail()+ "|" + cust.getCustomerAddress() + "|" + cust.getCustomerDateOfBirth());
//        }
//        Customer cust = customerDAO.getCustomerByID(1);
//           System.out.println(cust.getCustomerID()+ "|" + cust.getCustomName()+ "|" + cust.getCustomerContact() + "|" + cust.getCustomerGender()+ "|" + cust.getCustomerEmail()+ "|" + cust.getCustomerAddress() + "|" + cust.getCustomerDateOfBirth());
//    
       boolean result=customerDAO.isValidate("sanke@","sanket23");
           
    }
}
      
    



