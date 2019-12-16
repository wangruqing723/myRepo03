package com.wy.beans;

/**
 * @author WY
 * @date 2019/8/28
 */
public class UserInfo {

    private String userId;
    private String userName;
    private String userPwd;
    private String userSex;
    private String userGJ;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserGJ() {
        return userGJ;
    }

    public void setUserGJ(String userGJ) {
        this.userGJ = userGJ;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userGJ='" + userGJ + '\'' +
                '}';
    }
}
