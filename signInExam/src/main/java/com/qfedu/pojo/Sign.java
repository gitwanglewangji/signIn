package com.qfedu.pojo;

import java.util.Date;

public class Sign {
    private Integer id;

    private Integer uid;

    private Date signmorn;

    private Date signnight;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getSignmorn() {
        return signmorn;
    }

    public void setSignmorn(Date signmorn) {
        this.signmorn = signmorn;
    }

    public Date getSignnight() {
        return signnight;
    }

    public void setSignnight(Date signnight) {
        this.signnight = signnight;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}