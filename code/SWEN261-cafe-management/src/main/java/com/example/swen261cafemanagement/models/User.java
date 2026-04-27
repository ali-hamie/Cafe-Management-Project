package com.example.swen261cafemanagement.models;

public class User {
    public String name;
    public String email;
    public String password;
    public String role;
    private Integer selectedPlanId;

    public User(String name, String email, String password_hashed, String role) {
        this.name = name;
        this.email = email;
        this.password = password_hashed;
        this.role = role;
        this.selectedPlanId = null;
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

    public Integer getSelectedPlanId() {
        return selectedPlanId;
    }

    public void setSelectedPlanId(Integer selectedPlanId) {
        this.selectedPlanId = selectedPlanId;
    }

    public String getRole() {
        return role; 
    }

    public void setRole(String role) {
        this.role = role; 
    }
}
