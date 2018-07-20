package com.example.konstantinospolychroniadis.onefinancialgroup;

public class User {
    //variables
    int id;
    String name;
    String password;
    // Constructor with two parameters name and password
    public User (String name,String password) {
        this.name=name;
        this.password=password;
    }
    //Parameter constructor containing all three parameters
    public User (int id,String name,String psd) {
        this.id=id;
        this.name=name;
        this.password=psd;
    }
    //returning values
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
