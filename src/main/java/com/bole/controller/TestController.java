package com.bole.controller;

import com.bole.bean.BaseResponse;
import com.bole.dao.TestDao;
import com.bole.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestDao testDao;

    @RequestMapping(value = "/testInsert", method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse testInsert(@RequestBody TestModel testModel) {
        int result = testDao.insertTestInfo(testModel);
        BaseResponse baseResponse = new BaseResponse();
        if (result == 1) {
            baseResponse.setStatus(true);
        } else {
            baseResponse.setStatus(false);
        }
        return baseResponse;
    }
}
