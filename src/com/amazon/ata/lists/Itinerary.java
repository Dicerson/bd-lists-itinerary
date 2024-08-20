package com.amazon.ata.lists;

import com.amazon.ata.resources.lists.prework.Destination;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing travel itinerary. The basic functionality it supports is to add, get or remove
 * a destination. Additionally, it allows a user to get a list of locations that are going to be visited
 * and get the total number of days that will be spent in trip.
 */
public class Itinerary {
    ArrayList<Destination> destinations = new ArrayList<Destination>();
    /**
     * Add a new destination to the end of itinerary.
     *
     * @param destination destination to add to itinerary
     */
    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    /**
     * Get the destination from itinerary based on its position.
     *
     * @param position position of destination to retrieve.
     * @return Destination at position.
     */
    public Destination getDestination(int position) {
        // Implement the method here
        return destinations.get(position);
    }

    /**
     * Remove a destination from itinerary based on its position.
     *
     * @param position position of destination to remove.
     * @return destination that was removed from itinerary.
     */
    public Destination removeDestination(int position) {
        // Implement the method here
        return destinations.remove(position);
    }


    /**
     * Get list of locations (cities) in the order in which they
     * appear in the itinerary.
     *
     * @return full list of locations from itinerary.
     */
    public List<String> getListOfLocations() {
        List<String> list = new ArrayList<String>();
        for(int i = 0;i < destinations.size();i++){
            list.add(destinations.get(i).getLocation());
        }
        return list;
    }

    /**
     * Get total number of days spent on the trip planned by the
     * itinerary.
     *
     * @return total number of days spent in all locations.
     */
    public int getTotalNumberOfDays() {
        int total = 0;
        for(int i = 0;i<destinations.size();i++){
            total += destinations.get(i).getDaysAtLocation();
        }
        return total;
    }

    /**
     * Get number of destinations contained in itinerary.
     *
     * @return number of destinations contained in itinerary.
     */
    public int getNumberOfDestinations() {
        return destinations.size();
    }
}