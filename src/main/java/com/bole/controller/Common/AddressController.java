package com.bole.controller.Common;

import com.bole.bean.common.QueryAddressReq;
import com.bole.bean.common.QueryAddressRes;
import org.springframework.web.bind.annotation.*;

/**
 * 地址--控制器
 * 地址是树结构
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    //todo
    //地址 增、删、改的操作  第一版不做，运营人员操作

    /**
     * 父地址查子地址
     *
     * @param queryAddressReq
     * @return
     */
    @RequestMapping(value = "/queryAddress", method = RequestMethod.POST)
    @ResponseBody
    private QueryAddressRes queryAddress(@RequestBody QueryAddressReq queryAddressReq) {
        return null;
    }
}
