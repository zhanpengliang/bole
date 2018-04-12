package com.bole.controller;


import com.bole.bean.BaseResponse;
import com.bole.bean.resume.OnlineResumeReq;
import org.springframework.web.bind.annotation.*;

/**
 * 简历控制器
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {

    /**
     * 创建精简简历
     * @param onlineResumeReq
     * @return
     */
    @RequestMapping(value = "/createOnlineResume", method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse createOnlineResume(@RequestBody OnlineResumeReq onlineResumeReq) {
        return null;
    }

    /**
     * 上传附件简历
     * @return
     */
    @RequestMapping(value = "/uploadDocumentResume", method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse uploadDocumentResume() {
        return null;
    }
}
