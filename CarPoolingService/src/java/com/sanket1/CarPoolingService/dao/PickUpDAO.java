/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService.dao;

import com.sanket1.CarPoolingService.entities.PickUp;
import java.util.List;

/**
 *
 * @author sanket
 */
public interface PickUpDAO {
     int addPickUp(PickUp pickup);
     int deletePickUp(int pickupID);
     List<PickUp> getAllPickUp();
     PickUp getPickUpByID (int pickupID);
     int updatePickUp(int pickupID,PickUp pickup);
    
}
