package com.bole.bean.accountAndJD;

import com.bole.bean.BaseRequest;

public class InsertInterviewProcessReq extends BaseRequest {
    /**
     * 面试进程  详见枚举 InterviewProcessEnum
     */
    private String interviewProcess;
    /**
     * 面试结果  详见枚举 InterviewResultEnum
     */
    private String interviewResult;
    /**
     * 面试分数 详见枚举 EvaluateLevelEnum
     */
    private String interviewLevel;
    /**
     * 面试评语
     */
    private String interviewComment;


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

    public String getInterviewLevel() {
        return interviewLevel;
    }

    public void setInterviewLevel(String interviewLevel) {
        this.interviewLevel = interviewLevel;
    }

    public String getInterviewComment() {
        return interviewComment;
    }

    public void setInterviewComment(String interviewComment) {
        this.interviewComment = interviewComment;
    }
}
