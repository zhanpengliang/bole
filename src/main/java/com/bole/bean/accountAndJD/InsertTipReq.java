package com.bole.bean.accountAndJD;

import com.bole.bean.BaseRequest;

public class InsertTipReq extends BaseRequest {
    /**
     * 岗位ID
     */
    private int JDID;
    /**
     * 评论等级  详见枚举  TipLevelEnum
     */
    private byte tipLevel;
    /**
     * 评论内容
     */
    private String content;

    public int getJDID() {
        return JDID;
    }

    public void setJDID(int JDID) {
        this.JDID = JDID;
    }

    public byte getTipLevel() {
        return tipLevel;
    }

    public void setTipLevel(byte tipLevel) {
        this.tipLevel = tipLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
