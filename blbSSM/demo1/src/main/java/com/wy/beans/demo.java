package com.wy.beans;

/**
 * @author WY
 * @date 2019/12/16
 */
public class demo {

    private String username;
    private String password;

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

    @Override
    public String toString() {
        return "demo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
