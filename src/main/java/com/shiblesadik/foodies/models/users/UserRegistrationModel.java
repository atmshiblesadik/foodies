package com.shiblesadik.foodies.models.users;

public class UserRegistrationModel extends User {
    private String password;
    private String confirmPassword;

    public UserRegistrationModel() {
    }

    public UserRegistrationModel(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "UserRegistrationModel{" +
                "password='" + password + '\'' +
                '}';
    }
}
