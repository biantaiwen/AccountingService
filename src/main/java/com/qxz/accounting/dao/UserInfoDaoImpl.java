package com.qxz.accounting.dao;

import com.qxz.accounting.model.persistence.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {
    @Override
    public UserInfo getUserInfoById(Long id) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByUserName(String username) {
        return null;
    }

    @Override
    public void createNewUser(UserInfo userInfo) {

    }
}
