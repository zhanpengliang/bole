package com.bole.bean.resume;

/**
 * 教育经历
 */
public class EducationExperience {
    /**
     * 开始日期
     */
    private ExperienceDate beginEducationDate;
    /**
     * 结束日期
     */
    private ExperienceDate endEducationDate;
    /**
     * 学校名称
     */
    private String schoolName;
    /**
     * 专业
     */
    private String profession;
    /**
     * 学校类型 专科、本三、本二、211、985  详见枚举SChoolTypeEnum;
     */
    private byte schoolType;
    /**
     * 学历 中专、大专、本科、硕士、博士。  详见枚举DegreeEnum
     */
    private byte degreeType;

    public ExperienceDate getBeginEducationDate() {
        return beginEducationDate;
    }

    public void setBeginEducationDate(ExperienceDate beginEducationDate) {
        this.beginEducationDate = beginEducationDate;
    }

    public ExperienceDate getEndEducationDate() {
        return endEducationDate;
    }

    public void setEndEducationDate(ExperienceDate endEducationDate) {
        this.endEducationDate = endEducationDate;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public byte getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(byte schoolType) {
        this.schoolType = schoolType;
    }

    public byte getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(byte degreeType) {
        this.degreeType = degreeType;
    }
}
