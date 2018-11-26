package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
    private Integer id;
    private String email;
    private String nickname;
    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date createData;
    private String state;
    private String authority;
    public User() {
        super();
    }
    public User(Integer id,String email,String nickname,String password,java.util.Date createData,String state,String authority) {
        super();
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.createData = createData;
        this.state = state;
        this.authority = authority;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public java.util.Date getCreateData() {
        return this.createData;
    }

    public void setCreateData(java.util.Date createData) {
        this.createData = createData;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

}
