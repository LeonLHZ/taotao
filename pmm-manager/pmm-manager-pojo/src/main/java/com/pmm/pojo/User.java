package com.pmm.pojo;

public class User {
    private String userId;

    private String userUsername;

    private String userPassword;

    private String userType;

    private String userReserved2;

    private String userReserved3;

    private String userReserved4;

    private String userReserved5;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername == null ? null : userUsername.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUserReserved2() {
        return userReserved2;
    }

    public void setUserReserved2(String userReserved2) {
        this.userReserved2 = userReserved2 == null ? null : userReserved2.trim();
    }

    public String getUserReserved3() {
        return userReserved3;
    }

    public void setUserReserved3(String userReserved3) {
        this.userReserved3 = userReserved3 == null ? null : userReserved3.trim();
    }

    public String getUserReserved4() {
        return userReserved4;
    }

    public void setUserReserved4(String userReserved4) {
        this.userReserved4 = userReserved4 == null ? null : userReserved4.trim();
    }

    public String getUserReserved5() {
        return userReserved5;
    }

    public void setUserReserved5(String userReserved5) {
        this.userReserved5 = userReserved5 == null ? null : userReserved5.trim();
    }
}