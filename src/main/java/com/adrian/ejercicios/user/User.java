package com.adrian.ejercicios.user;

public abstract class User {
    protected String username;
    protected String password;

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract void setUsername(String username);

    public abstract void setPassword(String password);

     public String getPassword() {
        return password.hashCode()+"";
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

     public String getUserName() {
        return username;
    }

    public String showInfo() {
        return "Nombre de usuario: " + username;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
