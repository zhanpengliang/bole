package com.bole.bean.accountAndJD;

import com.bole.bean.BaseRequest;

public class DeliverResumeReq extends BaseRequest {
    /**
     * 岗位ID
     */
    private int JDID;

    public int getJDID() {
        return JDID;
    }

    public void setJDID(int JDID) {
        this.JDID = JDID;
    }
}
