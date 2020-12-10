package com.qxz.accounting.manager;

import com.qxz.accounting.model.common.UserInfo;

public interface UserInfoManager {
    UserInfo getUserInfoByUserId(Long userId);
    UserInfo getUserInfoByUserName(String username);
    void login(String username, String password);
    UserInfo register(String username, String password);
}
