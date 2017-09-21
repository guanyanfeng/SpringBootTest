package com.gyf.demo.service;

import com.bdhubware.core.model.Page;
import com.github.pagehelper.PageHelper;
import com.gyf.demo.mapper.UserMapper;
import com.gyf.demo.model.User;
import com.gyf.demo.web.vo.UserReqVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Page<User> getUsersByPage(UserReqVo cond, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.selectByCondSelective(cond);
        int count = userMapper.countByCondSelective(cond);
        return new Page<>(users, count);
    }

    public void insertUser(User user){
        userMapper.insert(user);
    }
    public  void deleteById(Integer uid){
        userMapper.deleteByPrimaryKey(uid);
    }
    public  void updateUser(User user){
        userMapper.updateByPrimaryKeySelective(user);
    }
    public void deleteUsers(List<Integer> uids){
        userMapper.deleteUsers(uids);
    }
}
