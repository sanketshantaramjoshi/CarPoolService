/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService1;

import com.sanket1.CarPoolingService.dao.CarPoolRouteDAO;
import com.sanket1.CarPoolingService.daoimpl.CarPoolRouteDAOImpl;
import com.sanket1.CarPoolingService.entities.CarPoolRoute;
import java.util.List;

/**
 *
 * @author sanket
 */
public class ApplicationCarPoolRoute {
  public static void main(String[] args){
        CarPoolRouteDAO carpoolrouteDAO = new CarPoolRouteDAOImpl();
       int count;
     count = carpoolrouteDAO.addCarPoolRoute(new CarPoolRoute(1,10000,5,100));
      if(count>0)System.out.println("Record Added Successfully");
       else System.out.println("Record Failed to get added");
      
     // count=carpoolrouteDAO.deleteCarPoolRoute(2);
      //if(count>0)System.out.println("Record deleted Successfully");
       //else System.out.println("Record Failed to get deleted");
      
//       CarPoolRoute carpoolroute = new CarPoolRoute(3,1003,5,500);
//         count=carpoolrouteDAO.updateCarPoolRoute(3, carpoolroute);
//      if(count>0)System.out.println("Record Updated Successfully");
//     else System.out.println("Record Failed to get updated");
//       
//       
//       List<CarPoolRoute> carpoolroutelist = carpoolrouteDAO.getAllCarPoolRoute();
//        for(CarPoolRoute cpr: carpoolroutelist){
//        System.out.println(cpr.getCarPoolrouteID()+ "|" + cpr.getRouteID()+ "|" + cpr.getPassengerCapacity()+ "|" + cpr.getPrice());
//       }
//     //CarPoolRoute cpr = carpoolrouteDAO.getCarPoolRouteByID(3);
//     //System.out.println(cpr.getCarPoolrouteID()+ "|" + cpr.getRouteID()+ "|" + cpr.getPassengerCapacity()+ "|" + cpr.getPrice());
//      
 }
}
      


