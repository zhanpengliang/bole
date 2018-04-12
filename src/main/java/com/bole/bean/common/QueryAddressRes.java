package com.bole.bean.common;

import com.bole.bean.BaseResponse;

import java.util.List;

public class QueryAddressRes extends BaseResponse {

    private List<AddressInfo> addressInfos;

    public List<AddressInfo> getAddressInfos() {
        return addressInfos;
    }

    public void setAddressInfos(List<AddressInfo> addressInfos) {
        this.addressInfos = addressInfos;
    }
}
