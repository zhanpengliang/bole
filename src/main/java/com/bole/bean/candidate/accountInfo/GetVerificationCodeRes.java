package com.bole.bean.candidate.accountInfo;

import com.bole.bean.BaseResponse;

public class GetVerificationCodeRes extends BaseResponse {

    private String verificationCode;

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
