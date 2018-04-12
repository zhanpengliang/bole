package com.bole.enums;

public enum SchoolTypeEnum {
    ZK("专科", (byte) 1),
    BS("本三", (byte) 2),
    BE("本二", (byte) 3),
    EYY("211", (byte) 4),
    JBW("985", (byte) 5),
    GW("国外院校", (byte) 6);

    private String schoolTypeName;
    private byte schoolType;

    SchoolTypeEnum(String schoolTypeName, byte schoolType) {
        this.schoolTypeName = schoolTypeName;
        this.schoolType = schoolType;
    }

    public String getSchoolTypeName() {
        return schoolTypeName;
    }

    public void setSchoolTypeName(String schoolTypeName) {
        this.schoolTypeName = schoolTypeName;
    }

    public byte getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(byte schoolType) {
        this.schoolType = schoolType;
    }
}
