package com.qxz.accounting.dao;

import com.qxz.accounting.model.persistence.UserInfo;

public interface UserInfoDao {
    UserInfo getUserInfoById(Long id);

    UserInfo getUserInfoByUserName(String username);
    void createNewUser(UserInfo userInfo);
}
