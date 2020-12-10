package com.qxz.accounting.converter.c2s;

import com.google.common.base.Converter;
import com.qxz.accounting.model.common.UserInfo;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class UserInfoC2SConverter extends Converter<UserInfo, com.qxz.accounting.model.service.UserInfo> {

    @Override
    protected com.qxz.accounting.model.service.UserInfo doForward(UserInfo userInfo) {
        return com.qxz.accounting.model.service.UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .build();

    }

    @Override
    protected UserInfo doBackward(com.qxz.accounting.model.service.UserInfo userInfo) {
        return null;
    }
}
