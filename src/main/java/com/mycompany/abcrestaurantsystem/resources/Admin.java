/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abcrestaurantsystem.resources;

public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(int userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    @Override
    public void login() {
        // Admin-specific login logic
        System.out.println("Admin logged in: " + getName());
    }

    @Override
    public void register() {
        // Admin-specific registration logic
        System.out.println("Admin registered: " + getName());
    }

    public void manageUsers() {
        // Logic to manage users (e.g., add, delete, update users)
        System.out.println("Managing users...");
    }

    public void manageServices() {
        // Logic to manage services (e.g., add, delete, update services)
        System.out.println("Managing services...");
    }

    public void generateReports() {
        // Logic to generate business reports
        System.out.println("Generating reports...");
    }
}
