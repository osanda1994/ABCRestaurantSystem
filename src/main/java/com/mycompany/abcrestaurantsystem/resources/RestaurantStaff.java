/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abcrestaurantsystem.resources;

public class RestaurantStaff extends User {

    public RestaurantStaff() {
        super();
    }

    public RestaurantStaff(int userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    @Override
    public void login() {
        // Staff-specific login logic
        System.out.println("Staff logged in: " + getName());
    }

    @Override
    public void register() {
        // Staff-specific registration logic
        System.out.println("Staff registered: " + getName());
    }

    public void viewReservations() {
        // Logic to view reservations
        System.out.println("Viewing reservations...");
    }

    public void respondToQueries(String response) {
        // Logic to respond to customer queries
        System.out.println("Responding to query: " + response);
    }

    public void processPayment(double amount) {
        // Logic to process payments
        System.out.println("Payment processed: " + amount);
    }
}


