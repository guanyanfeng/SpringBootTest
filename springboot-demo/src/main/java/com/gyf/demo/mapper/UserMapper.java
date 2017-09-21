package com.gyf.demo.mapper;

import com.gyf.demo.model.User;
import com.gyf.demo.web.vo.UserReqVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByCondSelective(UserReqVo cond);

    int countByCondSelective(UserReqVo cond);
    void deleteUsers(List<Integer> uids);
}