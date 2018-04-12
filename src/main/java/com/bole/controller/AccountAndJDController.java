package com.bole.controller;

import com.bole.bean.BaseRequest;
import com.bole.bean.BaseResponse;
import com.bole.bean.accountAndJD.DeliverResumeReq;
import org.springframework.web.bind.annotation.*;

/**
 * 账号与岗位互动--控制器
 */
@RestController
@RequestMapping("/accountAndJD")
public class AccountAndJDController {

    /**
     * 应聘者--投递简历
     * @param deliverResumeReq
     * @return
     */
    @RequestMapping(value = "/deliverResume", method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse deliverResume(@RequestBody DeliverResumeReq deliverResumeReq) {
        return null;
    }

    /**
     * 应聘者--查看已经投递的岗位
     * @param baseRequest
     * @return
     */
    @RequestMapping(value = "/queryDeliveredJD", method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse queryDeliveredJD(@RequestBody BaseRequest baseRequest) {
        return null;
    }

    //todo
    /*招聘者--填写面试进度
    应聘者--查看面试进度

    应聘者--填写评语
    招聘者--查看评语*/
}
