package com.bole.bean.candidate.accountInfo;

import com.bole.bean.BaseRequest;

public class UpdatePassWordReq extends BaseRequest {
    /**
     * 老密码
     */
    private String oldPassWord;
    /**
     * 新密码
     */
    private String newPassWord;

    public String getOldPassWord() {
        return oldPassWord;
    }

    public void setOldPassWord(String oldPassWord) {
        this.oldPassWord = oldPassWord;
    }

    public String getNewPassWord() {
        return newPassWord;
    }

    public void setNewPassWord(String newPassWord) {
        this.newPassWord = newPassWord;
    }
}
