package com.gyf.demo.web.constant;

/**
 * Created by Administrator on 2017/7/25.
 */
public interface Urls {

    interface User {
        String ROOT = "/user";
        String GET_USER_PAGE = "/page";
        String SAVE_USER="";
        String UPDATE_USER="/{uid}";
        String DELETE_USER="/{uid}";
        String DELETE_USERS="";
    }

}
