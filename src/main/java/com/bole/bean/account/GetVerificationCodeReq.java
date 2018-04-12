package com.bole.bean.account;

import com.bole.bean.BaseRequest;

public class GetVerificationCodeReq extends BaseRequest{

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
