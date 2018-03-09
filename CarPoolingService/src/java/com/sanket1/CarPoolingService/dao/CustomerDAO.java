/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService.dao;

import com.sanket1.CarPoolingService.entities.Customer;
import java.util.List;

/**
 *
 * @author sanket
 */
public interface CustomerDAO { 
    int addCustomer(Customer customer);
     int deleteCustomer(int customerID);
     List<Customer> getAllCustomer();
     Customer getCustomerByID (int customerID);
     boolean isValidate(String customerEmail ,String customerPassword);
     int updateCustomer(int customerID,Customer customer);
}
