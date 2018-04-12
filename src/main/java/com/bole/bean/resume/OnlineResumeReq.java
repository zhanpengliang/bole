package com.bole.bean.resume;

import com.bole.bean.BaseRequest;

import java.util.List;

/**
 * 在线简历
 */
public class OnlineResumeReq extends BaseRequest {
    /**
     * 应聘者姓名
     */
    private String candidateName;
    /**
     * 应聘者电话
     */
    private String candidatePhone;
    /**
     * 应聘者邮箱
     */
    private String candidateEmail;
    /**
     * 应聘者当前岗位
     */
    private String candidateCurrentJob;
    /**
     * 应聘者当前公司
     */
    private String candidateCurrentCompany;
    /**
     * 工作经历
     */
    private List<JobExperience> jobExperienceList;
    /**
     * 教育经历
     */
    private List<EducationExperience> educationExperienceList;

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidatePhone() {
        return candidatePhone;
    }

    public void setCandidatePhone(String candidatePhone) {
        this.candidatePhone = candidatePhone;
    }

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }

    public String getCandidateCurrentJob() {
        return candidateCurrentJob;
    }

    public void setCandidateCurrentJob(String candidateCurrentJob) {
        this.candidateCurrentJob = candidateCurrentJob;
    }

    public String getCandidateCurrentCompany() {
        return candidateCurrentCompany;
    }

    public void setCandidateCurrentCompany(String candidateCurrentCompany) {
        this.candidateCurrentCompany = candidateCurrentCompany;
    }

    public List<JobExperience> getJobExperienceList() {
        return jobExperienceList;
    }

    public void setJobExperienceList(List<JobExperience> jobExperienceList) {
        this.jobExperienceList = jobExperienceList;
    }

    public List<EducationExperience> getEducationExperienceList() {
        return educationExperienceList;
    }

    public void setEducationExperienceList(List<EducationExperience> educationExperienceList) {
        this.educationExperienceList = educationExperienceList;
    }
}
