package com.bole.bean.common;

public class CompanyInfo {
    /**
     * 公司名称
     */
    private String companyName;

    //公司信息属性存放在company_ext表
    /**
     * 公司级别（第一梯队、第二梯队、第三梯队、第四梯队、其他）
     */
    private byte level;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }
}
