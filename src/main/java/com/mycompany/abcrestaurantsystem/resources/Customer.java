/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abcrestaurantsystem.resources;

public class Customer extends User {

    public Customer() {
        super();
    }

    public Customer(int userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    @Override
    public void login() {
        // Customer-specific login logic
        System.out.println("Customer logged in: " + getName());
    }

    @Override
    public void register() {
        // Customer-specific registration logic
        System.out.println("Customer registered: " + getName());
    }

    public void makeReservation() {
        // Logic to make a reservation
        System.out.println("Reservation made by customer: " + getName());
    }

    public void submitQuery(String query) {
        // Logic to submit a query to the restaurant staff
        System.out.println("Query submitted: " + query);
    }

    public void viewMenu() {
        // Logic to view the restaurant's menu
        System.out.println("Viewing menu...");
    }

    public void makePayment(double amount) {
        // Logic for making a payment
        System.out.println("Payment made by customer: " + getName() + " Amount: " + amount);
    }
}


