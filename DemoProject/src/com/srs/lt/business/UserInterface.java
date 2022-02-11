package com.srs.lt.business;

public interface UserInterface {
    String 	getRole(String userId);
    boolean 	updatePassword(String userID, String newPassword);
    boolean 	verifyCredentials(String userID, String password);
}
