package com.mycompany.abcrestaurantsystem.resources;

public abstract class User {
    private int userID;
    private String name;
    private String email;
    private String password;
    
    // Constructors
    public User() {}

    public User(int userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    // Getters and Setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // Abstract methods that must be implemented by subclasses
    public abstract void login();
    public abstract void register();
    
    // Common methods
    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }
    
    public void updateProfile(String newName, String newEmail, String newPassword) {
        this.name = newName;
        this.email = newEmail;
        this.password = newPassword;
    }
}


