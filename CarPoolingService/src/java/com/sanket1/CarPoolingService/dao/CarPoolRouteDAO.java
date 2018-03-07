/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService.dao;

import com.sanket1.CarPoolingService.entities.CarPoolRoute;
import java.util.List;

/**
 *
 * @author sanket
 */
public interface CarPoolRouteDAO {
    int addCarPoolRoute(CarPoolRoute carpoolroute);
     int deleteCarPoolRoute(int carpoolrouteID);
     List<CarPoolRoute> getAllCarPoolRoute();
     CarPoolRoute getCarPoolRouteByID (int carpoolrouteID);
     int updateCarPoolRoute(int carpoolrouteID,CarPoolRoute carpoolroute);
}