package com.bole.bean.jd;

import java.util.List;

public class CandidateLimit {
    /**
     * 应聘者公司名称
     */
    private List<String> companyNameList;
    /**
     * 应聘者工作时长，单位：年
     */
    private byte wordTimeLength;
    /**
     * 应聘者学历北京  详见：DegreeEnum
     */
    private byte degreeType;
    /**
     * 应聘者学校类型  详见：SchoolTypeEnum
     */
    private byte schoolType;

    public List<String> getCompanyNameList() {
        return companyNameList;
    }

    public void setCompanyNameList(List<String> companyNameList) {
        this.companyNameList = companyNameList;
    }

    public byte getWordTimeLength() {
        return wordTimeLength;
    }

    public void setWordTimeLength(byte wordTimeLength) {
        this.wordTimeLength = wordTimeLength;
    }

    public byte getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(byte degreeType) {
        this.degreeType = degreeType;
    }

    public byte getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(byte schoolType) {
        this.schoolType = schoolType;
    }
}
