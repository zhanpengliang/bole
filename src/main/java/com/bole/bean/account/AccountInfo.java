package com.bole.bean.account;

import com.bole.bean.BaseResponse;

public class AccountInfo extends BaseResponse {
    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户ID
     */
    private Long userID;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }
}
