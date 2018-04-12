package com.bole.bean.common;

import com.bole.bean.BaseRequest;

public class QueryOrganizationReq extends BaseRequest {

    /**
     * 组织唯一标志
     */
    private int organizationID;

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
}
