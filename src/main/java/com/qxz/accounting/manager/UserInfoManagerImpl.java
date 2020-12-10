package com.qxz.accounting.manager;

import com.qxz.accounting.model.common.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class UserInfoManagerImpl implements UserInfoManager {
    @Override
    public UserInfo getUserInfoByUserId(Long userId) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByUserName(String username) {
        return null;
    }

    @Override
    public void login(String username, String password) {

    }

    @Override
    public UserInfo register(String username, String password) {
        return null;
    }
}
