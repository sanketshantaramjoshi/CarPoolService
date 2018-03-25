/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService1;
;

import com.sanket1.CarPoolingService.dao.CarBookingDAO;
import com.sanket1.CarPoolingService.daoimpl.CarBookingDAOImpl;
import com.sanket1.CarPoolingService.entities.CarBooking;
import java.util.List;

/**
 *
 * @author sanket
 */
public class ApplicationCarBookingClass {
     public static void main(String[] args){
        CarBookingDAO carbookingDAO = new CarBookingDAOImpl();
       int count;
       count = carbookingDAO.addCarBooking(new CarBooking(1001,1,"10/10/2010","12:00:00"));
      if(count>0)System.out.println("Record Added Successfully");
        else System.out.println("Record Failed to get added");
         //count=carbookingDAO.deleteCarBooking(100004);
        //if(count>0)System.out.println("Record Deleted Successfully");
        //else System.out.println("Record Failed to get deleted");
//        CarBooking carbooking = new CarBooking(100006,1003,4,"11/10/2012","5:00:00");
//       count=carbookingDAO.updateCarBooking(100006,carbooking);
//        if(count>0)System.out.println("Record Updated Successfully");
//       else System.out.println("Record Failed to get updated");
//      List<CarBooking> carbookinglist = carbookingDAO.getAllCarBooking();
//        for(CarBooking cr: carbookinglist){
//            System.out.println(cr.getCarbookingID()+ "|" + cr.getCarID()+ "|" + cr.getCustomerID()+ "|" + cr.getCarbookingDate()+ "|" + cr.getCarbookingTime());
//       }
//       CarBooking cr = carbookingDAO.getCarBookingByID(100005);
//         System.out.println(cr.getCarbookingID()+ "|" + cr.getCarID()+ "|" + cr.getCustomerID()+ "|" + cr.getCarbookingDate()+ "|" + cr.getCarbookingTime());
       }
    }

