package com.bole.bean.jd;

public class JDInfo {
    /**
     * 岗位ID
     */
    private int JDID;

    /**
     * 招聘者--账号ID
     */
    private int accountID;
    /**
     * 岗位类型ID
     */
    private int jobTypeID;
    /**
     * 组织ID
     */
    private int organizationID;
    /**
     * 地址ID
     */
    private int addressID;


    /**
     * 岗位名称
     */
    private String jobName;
    /**
     * 岗位描述
     */
    private String jobDescription;
    /**
     * 薪资范围
     */
    private SalaryRange salaryRange;


    /**
     * 录入职位需要填写，返回给应聘者不需要有值
     * 对应聘者的要求
     */
    /*private CandidateLimit candidateLimit;*/

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getJobTypeID() {
        return jobTypeID;
    }

    public void setJobTypeID(int jobTypeID) {
        this.jobTypeID = jobTypeID;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public SalaryRange getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(SalaryRange salaryRange) {
        this.salaryRange = salaryRange;
    }

    public int getJDID() {
        return JDID;
    }

    public void setJDID(int JDID) {
        this.JDID = JDID;
    }
}
