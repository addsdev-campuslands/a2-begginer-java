package com.adrian.ejercicios.user;

public class User {
    protected String username;
    private String password;

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

     public String getPassword() {
        return password.hashCode()+"";
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public String showInfo() {
        return "Nombre de usuario: " + username;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
