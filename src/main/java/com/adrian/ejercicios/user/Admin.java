package com.adrian.ejercicios.user;

public class Admin extends User{
    //private String username, password;
    private String[] permissions;

    public Admin() {
        super("root","123");
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

     public void setPermissions(String permission) {
        this.permissions = new String[]{permission};
    }

    public String showPermissions() {
        
        var concat = "";
        for (String item : permissions) {
            concat += item + ",";
        }
        return concat;
    }

    @Override
    public String showInfo() {

        return super.showInfo() + "\nPermisos: " +showPermissions();
    }

    @Override
    public void setUsername(String username) {
        this.username = "ADMIN-"+username;
    }

    @Override
    public void setPassword(String password) {
        this.password = "PASS"+ password;
    }
    

}
