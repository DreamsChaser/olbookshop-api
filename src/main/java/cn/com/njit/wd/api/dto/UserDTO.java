package cn.com.njit.wd.api.dto;


import java.io.Serializable;

/**
 * Created by wangdi on 2017/3/20.
 */
public class UserDTO implements Serializable{

    private static final long serialVersionUID = -8497933756926750369L;
    private String userId;
    private String userName;
    private String userPassword;
    private String userType;
    private String userMobile;
    private String userAddr;
    private String userEmail;
    private String userBalance;

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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String useEmail) {
        this.userEmail = useEmail;
    }

    public String getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(String userBalance) {
        this.userBalance = userBalance;
    }
}
