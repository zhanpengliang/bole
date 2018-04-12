package com.bole.bean.jd;

import com.bole.bean.BaseRequest;

public class QueryJDQeq extends BaseRequest {

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
}
