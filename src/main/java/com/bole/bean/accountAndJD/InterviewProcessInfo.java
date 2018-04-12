package com.bole.bean.accountAndJD;

import java.util.Date;

public class InterviewProcessInfo {
    /**
     * 投递时间
     */
    private Date deliveredTime;
    /**
     * 面试进程
     */
    private String interviewProcess;
    /**
     * 面试结果
     */
    private String interviewResult;
    /**
     * 面试评语
     */
    private String interviewerComment;

    public Date getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(Date deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public String getInterviewProcess() {
        return interviewProcess;
    }

    public void setInterviewProcess(String interviewProcess) {
        this.interviewProcess = interviewProcess;
    }

    public String getInterviewResult() {
        return interviewResult;
    }

    public void setInterviewResult(String interviewResult) {
        this.interviewResult = interviewResult;
    }

    public String getInterviewerComment() {
        return interviewerComment;
    }

    public void setInterviewerComment(String interviewerComment) {
        this.interviewerComment = interviewerComment;
    }
}
