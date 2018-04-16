package com.bole.controller;

import com.bole.bean.BaseRequest;
import com.bole.bean.BaseResponse;
import com.bole.bean.accountAndJD.*;
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

    /**
     * 招聘方--插入面试反馈
     * @param insertInterviewProcessReq
     * @return
     */
    @RequestMapping(value = "/insertInterviewProcess", method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse insertInterviewProcess(@RequestBody InsertInterviewProcessReq insertInterviewProcessReq) {
        return null;
    }

    /**
     * 应聘者--查询面试反馈
     * @param queryInterviewProcessReq
     * @return
     */
    @RequestMapping(value = "/queryInterviewProcess", method = RequestMethod.POST)
    @ResponseBody
    private QueryInterviewProcessRes queryInterviewProcess(@RequestBody QueryInterviewProcessReq queryInterviewProcessReq) {
        return null;
    }

    /**
     * 应聘者--插入面试评论
     * @param insertTipReq
     * @return
     */
    @RequestMapping(value = "/insertTip", method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse insertTip(@RequestBody InsertTipReq insertTipReq) {
        return null;
    }

    /**
     * 查看面试评论
     * @param queryTipReq
     * @return
     */
    @RequestMapping(value = "/queryTip", method = RequestMethod.POST)
    @ResponseBody
    private QueryTipRes queryTip(@RequestBody QueryTipReq queryTipReq) {
        return null;
    }
}
