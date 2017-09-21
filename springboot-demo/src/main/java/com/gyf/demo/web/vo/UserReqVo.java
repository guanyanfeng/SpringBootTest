package com.gyf.demo.web.vo;

import java.io.Serializable;

public class UserReqVo implements Serializable {

    private static final long serialVersionUID = 651770051307025946L;

    private Integer uid;
    private String name;

    public UserReqVo() {
    }

    public UserReqVo(Integer uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
