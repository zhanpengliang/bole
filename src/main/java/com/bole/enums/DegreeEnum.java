package com.bole.enums;

public enum DegreeEnum {

    ZZ("中专", (byte) 1),
    DZ("大专", (byte) 2),
    BK("本科", (byte) 3),
    BE("硕士", (byte) 4),
    EYY("博士", (byte) 5),
    ;

    private String degreeName;
    private byte degreeType;

    DegreeEnum(String degreeName, byte degreeType) {
        this.degreeName = degreeName;
        this.degreeType = degreeType;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public byte getDegreeType() {
        return degreeType;
    }
}
