/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService.daoimpl;

import com.sanket1.CarPoolingService.dao.CarBookingDAO;
import com.sanket1.CarPoolingService.entities.CarBooking;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanket
 */
public class CarBookingDAOImpl implements CarBookingDAO {

    @Override
    public int addCarBooking(CarBooking carbooking) {
         int count=0;
        try {  
            Connection con=DerbyConnection.getConnection();
            PreparedStatement preparedStatement=con.prepareStatement("insert into CarBooking(carID,customerID,carbookingDate,carbookingTime) values(?,?,?,?)");
            preparedStatement.setInt(1,carbooking.getCarID());
            preparedStatement.setInt(2,carbooking.getCustomerID());
            java.util.Date carbookingDate =new java.util.Date(carbooking.getCarbookingDate());
        preparedStatement.setDate(3, new Date(carbookingDate.getYear(),carbookingDate.getMonth(),carbookingDate.getDate()));
        preparedStatement.setString(4,carbooking.getCarbookingTime());
            
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            return count;
      
       
      
    }

    @Override
    public int deleteCarBooking(int carbookingID) {
          int count=0;
            
        try {
            Connection con=DerbyConnection.getConnection();
           PreparedStatement preparedStatement = con.prepareStatement("delete from CarBooking where carbookingID=?");
           preparedStatement.setInt(1,carbookingID);
           count=preparedStatement.executeUpdate();
        
        
        
        } catch (SQLException ex) {
            Logger.getLogger(CarBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
            
    }
      
        
    

    @Override
    public List<CarBooking> getAllCarBooking(){

         List<CarBooking> carbookingList = null;
        try {
            Connection con = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = con.prepareStatement("select * from CarBooking");
            ResultSet resultSet = preparedStatement.executeQuery();
             carbookingList = new ArrayList<CarBooking>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                   int carbookingID =resultSet.getInt(1) ;
                   int carID=resultSet.getInt(2);
                   int customerID=resultSet.getInt(3) ;
                  String carbookingDate=resultSet.getDate(4).toString();
                  String carbookingTime=resultSet.getTime(5).toString();
                  
                    
                    CarBooking carbooking= new CarBooking(carbookingID,carID,customerID,carbookingDate,carbookingTime);
                    carbookingList.add(carbooking);
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(CarBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return carbookingList;
       
    }
    
        

    @Override
    public CarBooking getCarBookingByID(int carbookingID) {
         List<CarBooking> carbookingList = null;
        try {
            Connection con = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = con.prepareStatement("select * from CarBooking where carbookingID=?");
            preparedStatement.setInt(1, carbookingID);
            ResultSet resultSet = preparedStatement.executeQuery();
              carbookingList = new ArrayList<CarBooking>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                   int carbookingId =resultSet.getInt(1) ;
                   int carID=resultSet.getInt(2);
                   int customerID=resultSet.getInt(3) ;
                    String carbookingDate=resultSet.getDate(4).toString();
                  String carbookingTime=resultSet.getTime(5).toString();
                  
                  CarBooking carbooking= new CarBooking(carbookingID,carID,customerID,carbookingDate,carbookingTime);
                    carbookingList.add(carbooking);
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(CarBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(carbookingList.size()>0) return carbookingList.get(0);
        else return null;
       
      
                  
       
       
    }

    @Override
    public int updateCarBooking(int carbookingID, CarBooking carbooking) {
      int count=0;
        try {
            Connection con  = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("update CarBooking set Carid=?,Customerid=?,CarbookingDate=?,CarbookingTime=? where CarBookingID=?");
           preparedStatement .setInt(1,carbooking.getCarID());
            preparedStatement .setInt(2,carbooking.getCustomerID());
          java.util.Date carbookingDate =new java.util.Date(carbooking.getCarbookingDate());
        preparedStatement.setDate(3, new Date(carbookingDate.getYear(),carbookingDate.getMonth(),carbookingDate.getDate()));
        java.sql.Time carbookingTime=new java.sql.Time(24,24,24);
         preparedStatement.setTime(4,new Time(carbookingTime.getHours(),carbookingTime.getMinutes(),carbookingTime.getSeconds()));
            
           preparedStatement .setInt(5,carbooking.getCarbookingID());
            count=preparedStatement.executeUpdate();
        
        
        
        } catch (SQLException ex) {
            Logger.getLogger(CarBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    

        
    }
    
}
