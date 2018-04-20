package com.bole.enums;

public enum AccountTypeEnum {

    CANDIDATE((byte) 1, "应聘者"),
    INTERVIEWER((byte) 2, "招聘者"),
    BOTH((byte) 3, "应聘者和招聘者"),
    ;

    private byte code;
    private String name;

    AccountTypeEnum(byte code, String name) {
        this.code = code;
        this.name = name;
    }

    public byte getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
