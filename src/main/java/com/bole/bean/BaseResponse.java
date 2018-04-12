package com.bole.bean;

public class BaseResponse {

    /**
     * true：成功；false：失败
     */
    private boolean status;
    /**
     * 错误码
     */
    private String errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
