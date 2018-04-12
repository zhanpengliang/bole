package com.bole.bean.resume;

/**
 * 工作经历
 */
public class JobExperience {
    /**
     * 开始日期
     */
    private ExperienceDate beginJobDate;
    /**
     * 结束日期
     */
    private ExperienceDate endJobDate;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 岗位名称
     */
    private String jobName;
    /**
     * 工作描述
     */
    private String jobDescription;

    public ExperienceDate getBeginJobDate() {
        return beginJobDate;
    }

    public void setBeginJobDate(ExperienceDate beginJobDate) {
        this.beginJobDate = beginJobDate;
    }

    public ExperienceDate getEndJobDate() {
        return endJobDate;
    }

    public void setEndJobDate(ExperienceDate endJobDate) {
        this.endJobDate = endJobDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
}
