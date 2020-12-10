package com.qxz.accounting.dao.mapper;

import com.qxz.accounting.model.persistence.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserInfoMapper {
    @Select("SELECT id, username, password, create_time, update_time FROM qxz_userinfo WHERE id = #{id}")
    UserInfo getUserInfoByUserId(@Param("id") Long id);
}
