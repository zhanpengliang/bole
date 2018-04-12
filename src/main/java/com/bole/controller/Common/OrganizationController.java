package com.bole.controller.Common;

import com.bole.bean.common.QueryOrganizationReq;
import com.bole.bean.common.QueryOrganizationRes;
import org.springframework.web.bind.annotation.*;

/**
 * 组织结构--控制器
 * 组织是树结构
 */
@RestController
@RequestMapping("/organization")
public class OrganizationController {
    //todo
    //组织 增、删、改 第一版不做，运营人员操作*/
    //用户 根据公司类型，查找公司 第一版不做
    //用户 模糊匹配公司 第一版不做

    /**
     * 父组织查子组织
     * @param queryOrganizationReq
     * @return
     */
    @RequestMapping(value = "/queryOrganization", method = RequestMethod.POST)
    @ResponseBody
    private QueryOrganizationRes queryOrganization(@RequestBody QueryOrganizationReq queryOrganizationReq) {
        return null;
    }
}