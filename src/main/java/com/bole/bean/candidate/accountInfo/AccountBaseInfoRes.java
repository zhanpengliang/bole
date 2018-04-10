package com.bole.bean.candidate.accountInfo;

import com.bole.bean.BaseResponse;

public class AccountBaseInfoRes extends BaseResponse {
    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户ID
     */
    private String userId;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
