/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService1;

import com.sanket1.CarPoolingService.dao.CarPoolBookingDAO;
import com.sanket1.CarPoolingService.daoimpl.CarPoolBookingDAOImpl;
import com.sanket1.CarPoolingService.entities.CarPoolBooking;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public class ApplicationCarPoolBookingClass {
    public static void main(String[] args){
  CarPoolBookingDAO carpoolbookingDAO = new CarPoolBookingDAOImpl();
      int count;
     //  count = carpoolbookingDAO.addCarPoolBooking(new CarPoolBooking(101,"10/10/2015",1003,0001,"10/10/2015","10:00:00",3,1003,5));
   // if(count>0)System.out.println("Record Added Successfully");
    //  else System.out.println("Record Failed to get added");
      
      
      
  // count=carpoolbookingDAO.deleteCarPoolBooking(003);
    //if(count>0)System.out.println("Record delete Successfully");
    //else System.out.println("Record Failed to get delete");
     
     CarPoolBooking carpoolbooking = new CarPoolBooking(10,"12/11/2015",1003,0005,"11/11/2016","8:00",3,1003,10);
     count=carpoolbookingDAO.updateCarPoolBooking(0005, carpoolbooking);
      if(count>0)System.out.println("Record Updated Successfully");
      else System.out.println("Record Failed to get updated");
       
       
      //  List<CarPoolBooking> carpoolbookinglist = carpoolbookingDAO.getAllCarPoolBooking();
        //for(CarPoolBooking cpb: carpoolbookinglist){
      // System.out.println(cpb.getInvoiceID()+ "|" + cpb.getInvoiceDate()+ "|" + cpb.getCarID()+ "|" + cpb.getCarpoolbookingID()+ "|" + cpb.getCarpoolbookingDate()+ "|" +cpb.getCarpoolbookingTime()+ "|" + cpb.getCustomrID()+ "|" + cpb.getRouteID()+ "|" + cpb.getNumberofPassenger());
    //}
   // CarPoolBooking cpb = carpoolbookingDAO.getCarPoolBookingByID(0003);
   // System.out.println(cpb.getInvoiceID()+ "|" + cpb.getInvoiceDate()+ "|" + cpb.getCarID()+ "|" + cpb.getCarpoolbookingID()+ "|" + cpb.getCarpoolbookingDate()+ "|" +cpb.getCarpoolbookingTime()+ "|" + cpb.getCustomrID()+ "|" + cpb.getRouteID()+ "|" + cpb.getNumberofPassenger());
       }
      
}


