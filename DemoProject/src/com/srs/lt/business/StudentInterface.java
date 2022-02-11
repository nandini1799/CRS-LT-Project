/**
 * 
 */
package com.srs.lt.business;

/**
 * @author user208
 *
 */
public interface StudentInterface {
    int getStudentId(String userId);
    boolean isApproved(int studentId);
    void register(String name, String userID, String password, String gender, int batch,
                      String branch, String address, String country);

}
