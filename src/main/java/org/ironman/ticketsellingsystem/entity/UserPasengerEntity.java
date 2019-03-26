package org.ironman.ticketsellingsystem.entity;


public class UserPasengerEntity {
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 旅客id
     */
    private Integer pasengerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPasengerId() {
        return pasengerId;
    }

    public void setPasengerId(Integer pasengerId) {
        this.pasengerId = pasengerId;
    }
}