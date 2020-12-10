package com.qxz.accounting.converter.p2c;

import com.google.common.base.Converter;
import com.qxz.accounting.model.persistence.UserInfo;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class UserInfoP2CConverter extends Converter<UserInfo, com.qxz.accounting.model.common.UserInfo> {

    @Override
    protected com.qxz.accounting.model.common.UserInfo doForward(UserInfo userInfo) {
        return com.qxz.accounting.model.common.UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .password(userInfo.getPassword())
                .salt(userInfo.getSalt())
                .build();

    }

    @Override
    protected UserInfo doBackward(com.qxz.accounting.model.common.UserInfo userInfo) {
        return null;
    }
}
