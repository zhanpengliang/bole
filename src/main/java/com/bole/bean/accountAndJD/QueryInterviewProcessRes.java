package com.bole.bean.accountAndJD;

import com.bole.bean.BaseResponse;

import java.util.List;

public class QueryInterviewProcessRes extends BaseResponse {

    List<InterviewProcessInfo> interviewProcessInfos;

    public List<InterviewProcessInfo> getInterviewProcessInfos() {
        return interviewProcessInfos;
    }

    public void setInterviewProcessInfos(List<InterviewProcessInfo> interviewProcessInfos) {
        this.interviewProcessInfos = interviewProcessInfos;
    }
}
