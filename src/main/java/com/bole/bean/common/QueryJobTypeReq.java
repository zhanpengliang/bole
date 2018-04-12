package com.bole.bean.common;

import com.bole.bean.BaseRequest;

public class QueryJobTypeReq extends BaseRequest {

    /**
     * 父岗位类型ID
     */
    private int parentJobTypeID;

    public int getParentJobTypeID() {
        return parentJobTypeID;
    }

    public void setParentJobTypeID(int parentJobTypeID) {
        this.parentJobTypeID = parentJobTypeID;
    }
}
