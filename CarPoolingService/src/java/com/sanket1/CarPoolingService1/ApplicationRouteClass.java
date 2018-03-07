/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService1;

import com.sanket1.CarPoolingService.dao.RouteDAO;
import com.sanket1.CarPoolingService.daoimpl.RouteDAOImpl;
import com.sanket1.CarPoolingService.entities.Route;
import java.util.List;

/**
 *
 * @author sanket
 */
public class ApplicationRouteClass {
    public static void main(String[] args){
       RouteDAO routeDAO = new RouteDAOImpl();
       int count;
      // count = routeDAO.addRoute (new Route(5,"andheri","dadar",5));
       //if(count>0)System.out.println("Record Added Successfully");
       // else System.out.println("Record Failed to get added");
        //count=routeDAO.deleteRoute(1000);
        //if(count>0)System.out.println("Record Deleted Successfully");
        // else System.out.println("Record Failed to get deleted");
      // Route route = new Route(1015,"virar","dahisar",5);
       //count=routeDAO.updateRoute(1015, route);
      // if(count>0)System.out.println("Record Updated Successfully");
       //else System.out.println("Record Failed to get updated");
       //List<Route> routelist = routeDAO.getAllRoute();
       //for(Route rt: routelist){
       //System.out.println(rt.getRouteID()+ "|" + rt.getStartLocation()+ "|" + rt.getDestination() + "|" + rt.getDistance());
      //  }
           Route rt = routeDAO.getRouteByID(1015);
        System.out.println(rt.getRouteID()+ "|" + rt.getStartLocation()+ "|" + rt.getDestination() + "|" + rt.getDistance());
        }
    }
    