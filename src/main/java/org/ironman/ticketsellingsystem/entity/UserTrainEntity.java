package org.ironman.ticketsellingsystem.entity;

import java.util.Date;


public class UserTrainEntity {
    private Integer id;

    private Integer userId;

    private Integer trainId;

    private Integer pasengerId;

    /**
     * 订单时间
     */
    private Date orderTime;

    /**
     * 座位级别，123
     */
    private String seat;

    /**
     * 价格
     */
    private String price;

    /**
     * 是否支付
     */
    private String state;

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

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public Integer getPasengerId() {
        return pasengerId;
    }

    public void setPasengerId(Integer pasengerId) {
        this.pasengerId = pasengerId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat == null ? null : seat.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}