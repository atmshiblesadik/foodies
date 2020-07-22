package com.shiblesadik.foodies.models.users;

public class Registration {
    private String phone;
    private String email;
    private String password;
    private String confirmPassword;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        if (this.phone.length() != 11) return false;
        for (int i = 0; i < this.phone.length(); ++i) {
            if (this.phone.charAt(i) < '0' || this.phone.charAt(i) > '9') return false;
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
                "username='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
