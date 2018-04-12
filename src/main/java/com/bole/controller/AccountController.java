package com.bole.controller;

import com.bole.bean.BaseResponse;
import com.bole.bean.account.AccountInfo;
import com.bole.bean.account.*;
import org.springframework.web.bind.annotation.*;

/**
 * 账号控制器
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    /*后续要做
    1. 更新绑定的手机号
    2. 查询账号信息*/

    /**
     * 根据电话号码得到验证码
     * @param getVerificationCodeReq
     * @return
     */
    @RequestMapping(value = "/getVerificationCode", method = RequestMethod.POST)
    @ResponseBody
    private GetVerificationCodeRes getVerificationCode(@RequestBody GetVerificationCodeReq getVerificationCodeReq) {
        return null;
    }


    /**
     * 注册页面
     *
     * 注册
     * @param registerReq
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    private AccountInfo register(@RequestBody RegisterReq registerReq) {
        return null;
    }


    /**
     * 登陆页面
     *
     * 登陆
     * @param loginReq
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    private AccountInfo login(@RequestBody LoginReq loginReq) {
        return null;
    }

    /**
     * 重置密码（用户忘记密码）
     * @param resetPassWordReq
     * @return
     */
    @RequestMapping(value = "/resetPassWord", method = RequestMethod.POST)
    @ResponseBody
    private AccountInfo resetPassWord(@RequestBody ResetPassWordReq resetPassWordReq) {
        return null;
    }


    /**
     * 登陆状态下--更新密码
     * @param updatePassWordReq
     * @return
     */
    @RequestMapping(value = "/updatePassWord", method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse updatePassWord(@RequestBody UpdatePassWordReq updatePassWordReq) {
        return null;
    }

    /**
     * 登陆状态下--更新昵称
     * @param updateNickName
     * @return
     */
    @RequestMapping(value = "/updateNickName", method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse updateNickName(@RequestBody UpdateNickName updateNickName) {
        return null;
    }
}
