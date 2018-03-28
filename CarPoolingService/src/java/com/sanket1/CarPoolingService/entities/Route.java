/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanket1.CarPoolingService.entities;

/**
 *
 * @author sanket
 */
public class Route {
    int routeID;
    String startLocation;
    String Destination;
    int Distance;

    public Route(int routeID, String startLocation, String Destination, int Distance) {
        this.routeID = routeID;
        this.startLocation = startLocation;
        this.Destination = Destination;
        this.Distance = Distance;
    }

    public Route(String startLocation, String Destination, int Distance) {
         this.startLocation = startLocation;
        this.Destination = Destination;
        this.Distance = Distance;
    }

    public Route() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public void setDistance(int Distance) {
        this.Distance = Distance;
    }

    public int getRouteID() {
        return routeID;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public String getDestination() {
        return Destination;
    }

    public int getDistance() {
        return Distance;
    }
    
}
