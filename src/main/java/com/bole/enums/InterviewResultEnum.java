package com.bole.enums;

public enum InterviewResultEnum {

    PASS((byte)1, "通过"),
    NOT_PASS((byte)2, "不通过"),
    UNDETERMINED((byte)3, "待定"),
    ;

    private byte code;
    private String result;

    InterviewResultEnum(byte code, String result) {
        this.code = code;
        this.result = result;
    }

    public byte getCode() {
        return code;
    }

    public void setCode(byte code) {
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
