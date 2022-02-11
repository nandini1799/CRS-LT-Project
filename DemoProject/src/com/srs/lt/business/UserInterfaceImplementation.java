package com.srs.lt.business;

public class UserInterfaceImplementation implements UserInterface {

    @Override
    public String getRole(String userId) {
        return null;
    }

    @Override
    public boolean updatePassword(String userID, String newPassword) {
        return false;
    }

    @Override
    public boolean verifyCredentials(String userID, String password) {
        return false;
    }
}
