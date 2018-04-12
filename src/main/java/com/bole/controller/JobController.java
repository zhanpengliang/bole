package com.bole.controller;

import com.bole.bean.jd.QueryJDQeq;
import com.bole.bean.jd.QueryJDRes;
import org.springframework.web.bind.annotation.*;

/**
 * 岗位--控制器
 */
@RestController
@RequestMapping("/job")
public class JobController {

    //todo
    //岗位 增、删、改的操作  第一版不做  公司操作
    /**
     * 查询岗位信息
     * @return
     */
    @RequestMapping(value = "/queryJob", method = RequestMethod.POST)
    @ResponseBody
    private QueryJDRes queryJob(@RequestBody QueryJDQeq queryJDQeq) {
        return null;
    }
}
