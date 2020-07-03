package com.shiblesadik.foodies.models.users;

public class Registration {
    private String username;
    private String email;
    private String password;
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public boolean isValidUsername() {
        if (this.username.length() != 11) return false;
        for (int i = 0; i < this.username.length(); ++i) {
            if (this.username.charAt(i) < '0' || this.username.charAt(i) > '9') return false;
        }
        return true;
    }

    public boolean isValidEmail() {
        if (this.email.length() < 5) return false;

        return true;
    }

    public boolean isValidPassword() {
        if (!this.password.equals(this.confirmPassword)) return false;
        return (this.password.length() >= 6);
    }

    @Override
    public String toString() {
        return "Registration{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
