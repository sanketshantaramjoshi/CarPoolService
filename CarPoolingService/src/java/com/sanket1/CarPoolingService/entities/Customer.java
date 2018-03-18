/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService.entities;

import java.util.Date;


public class Customer {
            int customerID  ;
            String customerName;
            long customerContact;
            String customerGender;
            String customerEmail;
            String customerAddress;
            String customerDateOfBirth; 
            String customerPassword;

    

    

    public Customer(String customerName, long customerContact, String customerGender, String customerEmail, String customerAddress, String customerDateOfBirth,String customerPassword) {
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerGender = customerGender;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerDateOfBirth = customerDateOfBirth;
         this.customerPassword = customerPassword;
    }
   
            

    public Customer(int customerID, String customerName, long customerContact, String customerGender, String customerEmail, String customerAddress, String customerDateOfBirth,String customerPassword) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerGender = customerGender;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerDateOfBirth = customerDateOfBirth;
        this.customerPassword = customerPassword;
       
    }

    public Customer(String customerName, long customerContact, String customerGender, String customerEmail, String customerAddress, String customerDateOfBirth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customName) {
        this.customerName = customerName;
    }

    public void setCustomerContact(long customerContact) {
        this.customerContact = customerContact;
    }
    
    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerDateOfBirth(String customerDateOfBirth) {
        this.customerDateOfBirth = customerDateOfBirth;
    }
    
     public void setCustomerPassword(String customerPassword) {
        this.customerPassword =customerPassword;
    }
    
  
    
    
    public int getCustomerID() {
        return customerID;
    }
    
    public String getCustomerName() {
        return customerName;
    }

  public long getCustomerContact() {
        return customerContact;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerDateOfBirth() {
        return customerDateOfBirth;
    }

   public String getCustomerPassword() {
        return customerPassword;
    }

   
}