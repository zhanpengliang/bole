package com.bole.bean.common;

public class OrganizationInfo {

    /**
     * 组织唯一标志
     */
    private int organizationID;
    /**
     * 组织名称
     */
    private String organizationName;
    /**
     * 层级
     */
    private byte depth;

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public byte getDepth() {
        return depth;
    }

    public void setDepth(byte depth) {
        this.depth = depth;
    }
}
