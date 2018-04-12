package com.bole.bean.account;

import com.bole.bean.BaseRequest;

public class UpdateNickName extends BaseRequest {
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
