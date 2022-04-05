package com.community.lcommunity.mapper;

import com.community.lcommunity.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author youzi530
 */
@Mapper
public interface UserMapper {

    @Insert("insert into userss (account_id,name,token,gmt_create,gmt_modified) values (#{accountId},#{name},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}