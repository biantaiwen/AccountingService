package com.qxz.accounting.dao;

import com.qxz.accounting.dao.mapper.UserInfoMapper;
import com.qxz.accounting.model.persistence.UserInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserInfoDaoImpl implements UserInfoDao {

    private final UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoById(Long id) {
        log.info("UserInfoDaoImpl.getUserInfoById");
        return userInfoMapper.getUserInfoByUserId(id);
    }

    @Override
    public UserInfo getUserInfoByUserName(String username) {
        return null;
    }

    @Override
    public void createNewUser(UserInfo userInfo) {

    }
}
