package org.hrtool.models;

import jakarta.validation.constraints.NotBlank;

public class UserCredentials {
    @NotBlank(message = "Username or email is required and must not be blank")
    private String username;
    @NotBlank(message = "Password is required and must not be blank")
    private String password;

    public UserCredentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}