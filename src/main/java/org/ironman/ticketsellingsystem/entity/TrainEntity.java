package org.ironman.ticketsellingsystem.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class TrainEntity {
    private Integer id;

    /**
     * 火车型号 如 k996
     */
    private String trainCard;

    /**
     * 起点
     */
    private String startPlace;

    /**
     * 终点
     */
    private String endPlace;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 一等座位数
     */
    private String firstSeat;

    /**
     * 一等座位价格
     */
    private Integer firstSeatPrice;

    /**
     * 二等座位数
     */
    private String secondSeat;

    /**
     * 二等座位数价格
     */
    private Integer secondSeatPrice;

    /**
     * 商务座数量
     */
    private String businessSeat;

    /**
     * 商务座价格
     */
    private Integer businessPrice;

    private Date trainTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainCard() {
        return trainCard;
    }

    public void setTrainCard(String trainCard) {
        this.trainCard = trainCard == null ? null : trainCard.trim();
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace == null ? null : startPlace.trim();
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace == null ? null : endPlace.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getFirstSeat() {
        return firstSeat;
    }

    public void setFirstSeat(String firstSeat) {
        this.firstSeat = firstSeat == null ? null : firstSeat.trim();
    }

    public Integer getFirstSeatPrice() {
        return firstSeatPrice;
    }

    public void setFirstSeatPrice(Integer firstSeatPrice) {
        this.firstSeatPrice = firstSeatPrice;
    }

    public String getSecondSeat() {
        return secondSeat;
    }

    public void setSecondSeat(String secondSeat) {
        this.secondSeat = secondSeat == null ? null : secondSeat.trim();
    }

    public Integer getSecondSeatPrice() {
        return secondSeatPrice;
    }

    public void setSecondSeatPrice(Integer secondSeatPrice) {
        this.secondSeatPrice = secondSeatPrice;
    }

    public String getBusinessSeat() {
        return businessSeat;
    }

    public void setBusinessSeat(String businessSeat) {
        this.businessSeat = businessSeat == null ? null : businessSeat.trim();
    }

    public Integer getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(Integer businessPrice) {
        this.businessPrice = businessPrice;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getTrainTime() {
        return trainTime;
    }

    public void setTrainTime(Date trainTime) {
        this.trainTime = trainTime;
    }
}