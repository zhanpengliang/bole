package com.bole.enums;

public enum ErrorEnum {

    SYSTEM_ERROR("100", "系统异常"),
    PHONE_VERIFICATION_ERROR("101", "手机验证码错误"),
    ;

    /**
     * 错误码
     */
    private String errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;

    ErrorEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
