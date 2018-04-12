package com.bole.bean.jd;

import com.bole.bean.BaseResponse;

import java.util.List;

public class QueryJDRes extends BaseResponse {

    /**
     * JD信息
     */
    private List<JDInfo> jdInfos;

    public List<JDInfo> getJdInfos() {
        return jdInfos;
    }

    public void setJdInfos(List<JDInfo> jdInfos) {
        this.jdInfos = jdInfos;
    }
}
