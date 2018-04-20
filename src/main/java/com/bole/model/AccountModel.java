package com.bole.model;

public class AccountModel {

    /**
     * 主键ID
     */
    private long id;

    /**
     * 昵称，可修改
     */
    private String nickName;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 登陆密码
     */
    private String passWord;

    /**
     * 应聘者类型 详见枚举 AccountTypeEnum
     */
    private byte accountType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public byte getAccountType() {
        return accountType;
    }

    public void setAccountType(byte accountType) {
        this.accountType = accountType;
    }
}
