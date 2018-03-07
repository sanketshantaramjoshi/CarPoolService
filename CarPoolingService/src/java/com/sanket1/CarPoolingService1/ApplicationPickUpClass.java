/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService1;

import com.sanket1.CarPoolingService.dao.PickUpDAO;
import com.sanket1.CarPoolingService.daoimpl.PickUpDAOImpl;
import com.sanket1.CarPoolingService.entities.PickUp;
import java.util.List;

/**
 *
 * @author sanket
 */
public class ApplicationPickUpClass {
     public static void main(String[] args){
        PickUpDAO pickupDAO = new PickUpDAOImpl();
       //int count;
       //count = pickupDAO.addPickUp(new PickUp(4,"kandivali",1015));
       //if(count>0)System.out.println("Record Added Successfully");
       // else System.out.println("Record Failed to get added");
        // count=pickupDAO.deletePickUp(50);
        //if(count>0)System.out.println("Record Deleted Successfully");
        // else System.out.println("Record Failed to get deleted");
       // PickUp pickup = new PickUp(52,"kandivali",1014);
       //count=pickupDAO.updatePickUp(52, pickup);
        //if(count>0)System.out.println("Record Updated Successfully");
       //else System.out.println("Record Failed to get updated");
      List<PickUp> pickuplist = pickupDAO.getAllPickUp();
        for(PickUp cr: pickuplist){
            System.out.println(cr.getPickupID()+ "|" + cr.getPickupPoint()+ "|" + cr.getRouteID());
        }
         PickUp cr = pickupDAO.getPickUpByID(52);
           System.out.println(cr.getPickupID()+ "|" + cr.getPickupPoint()+ "|" + cr.getRouteID());
     }
}
