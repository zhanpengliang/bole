package com.bole.controller.Common;

import com.bole.bean.common.QueryJobTypeReq;
import com.bole.bean.common.QueryJobTypeRes;
import org.springframework.web.bind.annotation.*;

/**
 * 岗位类型--控制器
 * 岗位类型是树结构
 */
@RestController
@RequestMapping("/jobType")
public class JobTypeController {

    //todo
    /*岗位类型 增、删、改的操作  第一版不做  运营人员操作*/

    /**
     * 父岗位类型查子岗位类型
     * @param queryJobTypeReq
     * @return
     */
    @RequestMapping(value = "/queryJobType", method = RequestMethod.POST)
    @ResponseBody
    private QueryJobTypeRes queryJobType(@RequestBody QueryJobTypeReq queryJobTypeReq) {
        return null;
    }
}
