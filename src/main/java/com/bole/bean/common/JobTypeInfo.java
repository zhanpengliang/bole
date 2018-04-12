package com.bole.bean.common;

public class JobTypeInfo {
    /**
     * 数据库唯一标志
     */
    private int jobTypeID;
    /**
     * 岗位类型名称
     */
    private String jobTypeName;

    public int getJobTypeID() {
        return jobTypeID;
    }

    public void setJobTypeID(int jobTypeID) {
        this.jobTypeID = jobTypeID;
    }

    public String getJobTypeName() {
        return jobTypeName;
    }

    public void setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
    }
}
