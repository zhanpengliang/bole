package com.bole.bean.common;

import com.bole.bean.BaseResponse;

import java.util.List;

public class QueryJobTypeRes extends BaseResponse {

    private List<JobTypeInfo> jobTypeInfos;

    public List<JobTypeInfo> getJobTypeInfos() {
        return jobTypeInfos;
    }

    public void setJobTypeInfos(List<JobTypeInfo> jobTypeInfos) {
        this.jobTypeInfos = jobTypeInfos;
    }
}
