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

    /**
     * 姓名
     */
    private String name;

    /**
     * 证件号
     */
    private String idCard;

    /**
     * 证件号类型
     */
    private String idCardType;

    /**
     * 电话
     */
    private String phone;

    /**
     * 乘客类型
     */
    private String type;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType == null ? null : idCardType.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public PasengerEntity toPasengerEntity(){
        PasengerEntity pasengerEntity=new PasengerEntity();
        pasengerEntity.setId(pasengerId);
        pasengerEntity.setIdCard(idCard);
        pasengerEntity.setIdCardType(idCardType);
        pasengerEntity.setName(name);
        pasengerEntity.setType(type);
        pasengerEntity.setPhone(phone);
        return pasengerEntity;
    }

}