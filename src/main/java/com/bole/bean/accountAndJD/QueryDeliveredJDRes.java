package com.bole.bean.accountAndJD;

import com.bole.bean.BaseResponse;
import com.bole.bean.jd.JDInfo;

import java.util.List;

public class QueryDeliveredJDRes extends BaseResponse {

    private List<JDInfo> jdInfos;

    public List<JDInfo> getJdInfos() {
        return jdInfos;
    }

    public void setJdInfos(List<JDInfo> jdInfos) {
        this.jdInfos = jdInfos;
    }
}
