package com.bole.enums;

public enum EvaluateLevelEnum {

    ONE((byte)1, "一星"),
    TWO((byte)1, "二星"),
    THREE((byte)1, "三星"),
    FOUR((byte)1, "四星"),
    FIVE((byte)1, "五星"),
    SIX((byte)1, "六星"),
    SEVEN((byte)1, "七星"),
    EIGHT((byte)1, "八星"),
    NINE((byte)1, "九星"),
    TEN((byte)1, "十星"),
    ;

    private byte code;
    private String level;

    EvaluateLevelEnum(byte code, String level) {
        this.code = code;
        this.level = level;
    }

    public byte getCode() {
        return code;
    }

    public String getLevel() {
        return level;
    }
}
