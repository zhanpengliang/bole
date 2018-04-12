package com.bole.bean.common;

import com.bole.bean.BaseResponse;

import java.util.List;

public class QueryOrganizationRes extends BaseResponse {

    private List<OrganizationInfo> organizationInfoList;

    public List<OrganizationInfo> getOrganizationInfoList() {
        return organizationInfoList;
    }

    public void setOrganizationInfoList(List<OrganizationInfo> organizationInfoList) {
        this.organizationInfoList = organizationInfoList;
    }
}
