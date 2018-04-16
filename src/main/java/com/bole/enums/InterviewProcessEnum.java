package com.bole.enums;

public enum InterviewProcessEnum {

    SUBMIT((byte)1, "提交"),
    HR_SCAN((byte)2, "HR查看"),
    PROFESSION_SCAN((byte)3, "业务评审"),
    ONE_INTERVIEW((byte)4, "一面"),
    TWO_INTERVIEW((byte)5, "二面"),
    THREE_INTERVIEW((byte)6, "三面"),
    FOUR_INTERVIEW((byte)7, "四面"),
    FIVE_INTERVIEW((byte)8, "五面"),
    SIX_INTERVIEW((byte)9, "六面"),
    HR_INTERVIEW((byte)10, "HR面"),
    OFFER((byte)11, "offer"),
    ;

    private byte code;
    private String process;

    InterviewProcessEnum(byte code, String process) {
        this.code = code;
        this.process = process;
    }

    public byte getCode() {
        return code;
    }

    public String getProcess() {
        return process;
    }
}
