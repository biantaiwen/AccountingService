package com.qxz.accounting.manager;

import com.qxz.accounting.converter.p2c.UserInfoP2CConverter;
import com.qxz.accounting.dao.UserInfoDao;
import com.qxz.accounting.model.common.UserInfo;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class UserInfoManagerImpl implements UserInfoManager {
    private final UserInfoDao userInfoDao;
    private final UserInfoP2CConverter userInfoP2CConverter;

    @Autowired
    public UserInfoManagerImpl(final UserInfoDao userInfoDao,
                               final UserInfoP2CConverter userInfoP2CConverter) {
        this.userInfoDao = userInfoDao;
        this.userInfoP2CConverter = userInfoP2CConverter;
    }

    @Override
    public UserInfo getUserInfoByUserId(Long userId) {
        log.info("UserInfoManagerImpl.getUserInfoByUserId" + userId);

        val userInfo = userInfoDao.getUserInfoById(userId);
        return userInfoP2CConverter.convert(userInfo);
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
