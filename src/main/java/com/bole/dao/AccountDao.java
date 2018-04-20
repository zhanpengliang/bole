package com.bole.dao;

import com.bole.model.AccountModel;
import org.apache.ibatis.annotations.Param;

public interface AccountDao {
    int insertAccount(@Param("accountModel") AccountModel accountModel);
}
