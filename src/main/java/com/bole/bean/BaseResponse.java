package com.bole.bean;

import com.bole.enums.ErrorEnum;

public class BaseResponse {

    /**
     * true：成功；false：失败
     */
    private boolean status = true;
    /**
     * 错误码
     */
    private String errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;

    public static void createFailResponse(BaseResponse baseResponse, ErrorEnum errorEnum) {
        baseResponse.setStatus(false);
        baseResponse.setErrorCode(errorEnum.getErrorCode());
        baseResponse.setErrorMsg(errorEnum.getErrorMsg());
    }

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
