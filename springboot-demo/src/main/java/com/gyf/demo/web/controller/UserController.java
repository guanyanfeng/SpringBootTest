package com.gyf.demo.web.controller;

import com.bdhubware.core.model.Page;
import com.bdhubware.web.views.ResponseVo;
import com.gyf.demo.model.User;
import com.gyf.demo.service.UserService;
import com.gyf.demo.web.constant.Urls;
import com.gyf.demo.web.vo.UserReqVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Urls.User.ROOT)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(Urls.User.GET_USER_PAGE)
    public ResponseVo<Page<User>> getUsersByPage(
            @RequestParam(required = false) Integer uid,
            @RequestParam(required = false) String name,
            @RequestParam Integer pageNum,
            @RequestParam Integer pageSize) {
        Page<User> reuslt = userService.getUsersByPage(
                new UserReqVo(uid, name),
                pageNum,
                pageSize);
        return new ResponseVo<>(reuslt);
    }

    @PostMapping(Urls.User.SAVE_USER)
    public ResponseVo saveUser(
            @RequestBody User user) {
        userService.insertUser(user);
        return new ResponseVo<>();
    }

    @PutMapping(Urls.User.UPDATE_USER)
    public ResponseVo upateUser(
            @PathVariable Integer uid,
            @RequestBody User user) {
        user.setUid(uid);
        userService.updateUser(user);
        return new ResponseVo<>();
    }

    @DeleteMapping(Urls.User.DELETE_USER)
    public ResponseVo deleteUser(
            @PathVariable Integer uid) {
        userService.deleteById(uid);
        return new ResponseVo<>();
    }

    @DeleteMapping(Urls.User.DELETE_USERS)
    public ResponseVo deleteUsers(
            @RequestBody List<Integer> uids) {
        userService.deleteUsers(uids);

        return new ResponseVo<>();
    }

}
