package com.bole.bean.account;

import com.bole.bean.BaseRequest;

public class RegisterReq extends BaseRequest {
    /**
     * 昵称，可修改
     */
    private String nickName;

    /**
     * 登陆密码
     */
    private String passWord;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 短信验证码
     */
    private String verificationCode;

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
