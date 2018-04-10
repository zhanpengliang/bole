package com.bole.bean.candidate.accountInfo;

import com.bole.bean.BaseRequest;

public class LoginReq extends BaseRequest {
    /**
     * 用户昵称  或者  手机号
     */
    private String userInfo;
    /**
     * 密码
     */
    private String passWord;

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
