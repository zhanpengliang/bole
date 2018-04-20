package com.bole.service;

import com.bole.bean.BaseResponse;
import com.bole.bean.account.AccountInfo;
import com.bole.bean.account.RegisterReq;
import com.bole.dao.AccountDao;
import com.bole.enums.ErrorEnum;
import com.bole.model.AccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public AccountInfo register(RegisterReq registerReq) {
        AccountInfo accountInfo = new AccountInfo();
        if (isPassForVerificationCode(registerReq.getPhoneNumber(), registerReq.getVerificationCode())) {
            AccountModel accountModel = createAccountModel(registerReq);
            accountDao.insertAccount(accountModel);
            createAccountInfo(accountInfo, accountModel.getId(), registerReq.getNickName());
            return accountInfo;
        } else {
            BaseResponse.createFailResponse(accountInfo, ErrorEnum.PHONE_VERIFICATION_ERROR);
            return accountInfo;
        }

    }

    private void createAccountInfo(AccountInfo accountInfo, long id, String nickName) {
        accountInfo.setId(id);
        accountInfo.setNickName(nickName);
    }

    private AccountModel createAccountModel(RegisterReq registerReq) {
        return null;
    }

    private boolean isPassForVerificationCode(String phoneNumber, String verificationCode) {
        return false;
    }
}
