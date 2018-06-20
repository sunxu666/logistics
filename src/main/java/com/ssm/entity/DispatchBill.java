package com.ssm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * dispatch_bill
 * @author 
 */
public class DispatchBill implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 卡号
     */
    private Integer cardNumber;

    /**
     * 票号
     */
    private Integer ticketNumber;

    /**
     * 发货人
     */
    private String consigner;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 直达站
     */
    private String toStand;

    /**
     * 收货人电话
     */
    private String consigneePhoto;

    /**
     * 货物名称
     */
    private String cargoName;

    /**
     * 包装
     */
    private String packaging;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 运费
     */
    private String freight;

    /**
     * 重量
     */
    private Double weight1;

    /**
     * 体积
     */
    private String volume;

    /**
     * 结算方式
     */
    private String clearingForm;

    /**
     * 代收货款
     */
    private String cod;

    /**
     * 中转费
     */
    private String transhipmentCharges;

    /**
     * 保险金额
     */
    private String insurance;

    /**
     * 保费
     */
    private String premium;

    /**
     * 送货费
     */
    private String deliveryExpense;

    /**
     * 送货方式
     */
    private String shippingMethod;

    /**
     * 需要回单
     */
    private String needReceipt;

    /**
     * 返款
     */
    private String refund;

    /**
     * 起站
     */
    private String inetialStation;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 发货人电话
     */
    private String consignerPhoto;

    /**
     * 中转至
     */
    private String transferTo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getConsigner() {
        return consigner;
    }

    public void setConsigner(String consigner) {
        this.consigner = consigner;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getToStand() {
        return toStand;
    }

    public void setToStand(String toStand) {
        this.toStand = toStand;
    }

    public String getConsigneePhoto() {
        return consigneePhoto;
    }

    public void setConsigneePhoto(String consigneePhoto) {
        this.consigneePhoto = consigneePhoto;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public Double getWeight1() {
        return weight1;
    }

    public void setWeight1(Double weight1) {
        this.weight1 = weight1;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getClearingForm() {
        return clearingForm;
    }

    public void setClearingForm(String clearingForm) {
        this.clearingForm = clearingForm;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getTranshipmentCharges() {
        return transhipmentCharges;
    }

    public void setTranshipmentCharges(String transhipmentCharges) {
        this.transhipmentCharges = transhipmentCharges;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getDeliveryExpense() {
        return deliveryExpense;
    }

    public void setDeliveryExpense(String deliveryExpense) {
        this.deliveryExpense = deliveryExpense;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getNeedReceipt() {
        return needReceipt;
    }

    public void setNeedReceipt(String needReceipt) {
        this.needReceipt = needReceipt;
    }

    public String getRefund() {
        return refund;
    }

    public void setRefund(String refund) {
        this.refund = refund;
    }

    public String getInetialStation() {
        return inetialStation;
    }

    public void setInetialStation(String inetialStation) {
        this.inetialStation = inetialStation;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getConsignerPhoto() {
        return consignerPhoto;
    }

    public void setConsignerPhoto(String consignerPhoto) {
        this.consignerPhoto = consignerPhoto;
    }

    public String getTransferTo() {
        return transferTo;
    }

    public void setTransferTo(String transferTo) {
        this.transferTo = transferTo;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DispatchBill other = (DispatchBill) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
            && (this.getTicketNumber() == null ? other.getTicketNumber() == null : this.getTicketNumber().equals(other.getTicketNumber()))
            && (this.getConsigner() == null ? other.getConsigner() == null : this.getConsigner().equals(other.getConsigner()))
            && (this.getConsignee() == null ? other.getConsignee() == null : this.getConsignee().equals(other.getConsignee()))
            && (this.getToStand() == null ? other.getToStand() == null : this.getToStand().equals(other.getToStand()))
            && (this.getConsigneePhoto() == null ? other.getConsigneePhoto() == null : this.getConsigneePhoto().equals(other.getConsigneePhoto()))
            && (this.getCargoName() == null ? other.getCargoName() == null : this.getCargoName().equals(other.getCargoName()))
            && (this.getPackaging() == null ? other.getPackaging() == null : this.getPackaging().equals(other.getPackaging()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getFreight() == null ? other.getFreight() == null : this.getFreight().equals(other.getFreight()))
            && (this.getWeight1() == null ? other.getWeight1() == null : this.getWeight1().equals(other.getWeight1()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getClearingForm() == null ? other.getClearingForm() == null : this.getClearingForm().equals(other.getClearingForm()))
            && (this.getCod() == null ? other.getCod() == null : this.getCod().equals(other.getCod()))
            && (this.getTranshipmentCharges() == null ? other.getTranshipmentCharges() == null : this.getTranshipmentCharges().equals(other.getTranshipmentCharges()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getPremium() == null ? other.getPremium() == null : this.getPremium().equals(other.getPremium()))
            && (this.getDeliveryExpense() == null ? other.getDeliveryExpense() == null : this.getDeliveryExpense().equals(other.getDeliveryExpense()))
            && (this.getShippingMethod() == null ? other.getShippingMethod() == null : this.getShippingMethod().equals(other.getShippingMethod()))
            && (this.getNeedReceipt() == null ? other.getNeedReceipt() == null : this.getNeedReceipt().equals(other.getNeedReceipt()))
            && (this.getRefund() == null ? other.getRefund() == null : this.getRefund().equals(other.getRefund()))
            && (this.getInetialStation() == null ? other.getInetialStation() == null : this.getInetialStation().equals(other.getInetialStation()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getConsignerPhoto() == null ? other.getConsignerPhoto() == null : this.getConsignerPhoto().equals(other.getConsignerPhoto()))
            && (this.getTransferTo() == null ? other.getTransferTo() == null : this.getTransferTo().equals(other.getTransferTo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getTicketNumber() == null) ? 0 : getTicketNumber().hashCode());
        result = prime * result + ((getConsigner() == null) ? 0 : getConsigner().hashCode());
        result = prime * result + ((getConsignee() == null) ? 0 : getConsignee().hashCode());
        result = prime * result + ((getToStand() == null) ? 0 : getToStand().hashCode());
        result = prime * result + ((getConsigneePhoto() == null) ? 0 : getConsigneePhoto().hashCode());
        result = prime * result + ((getCargoName() == null) ? 0 : getCargoName().hashCode());
        result = prime * result + ((getPackaging() == null) ? 0 : getPackaging().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getFreight() == null) ? 0 : getFreight().hashCode());
        result = prime * result + ((getWeight1() == null) ? 0 : getWeight1().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getClearingForm() == null) ? 0 : getClearingForm().hashCode());
        result = prime * result + ((getCod() == null) ? 0 : getCod().hashCode());
        result = prime * result + ((getTranshipmentCharges() == null) ? 0 : getTranshipmentCharges().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getPremium() == null) ? 0 : getPremium().hashCode());
        result = prime * result + ((getDeliveryExpense() == null) ? 0 : getDeliveryExpense().hashCode());
        result = prime * result + ((getShippingMethod() == null) ? 0 : getShippingMethod().hashCode());
        result = prime * result + ((getNeedReceipt() == null) ? 0 : getNeedReceipt().hashCode());
        result = prime * result + ((getRefund() == null) ? 0 : getRefund().hashCode());
        result = prime * result + ((getInetialStation() == null) ? 0 : getInetialStation().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getConsignerPhoto() == null) ? 0 : getConsignerPhoto().hashCode());
        result = prime * result + ((getTransferTo() == null) ? 0 : getTransferTo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", ticketNumber=").append(ticketNumber);
        sb.append(", consigner=").append(consigner);
        sb.append(", consignee=").append(consignee);
        sb.append(", toStand=").append(toStand);
        sb.append(", consigneePhoto=").append(consigneePhoto);
        sb.append(", cargoName=").append(cargoName);
        sb.append(", packaging=").append(packaging);
        sb.append(", number=").append(number);
        sb.append(", freight=").append(freight);
        sb.append(", weight1=").append(weight1);
        sb.append(", volume=").append(volume);
        sb.append(", clearingForm=").append(clearingForm);
        sb.append(", cod=").append(cod);
        sb.append(", transhipmentCharges=").append(transhipmentCharges);
        sb.append(", insurance=").append(insurance);
        sb.append(", premium=").append(premium);
        sb.append(", deliveryExpense=").append(deliveryExpense);
        sb.append(", shippingMethod=").append(shippingMethod);
        sb.append(", needReceipt=").append(needReceipt);
        sb.append(", refund=").append(refund);
        sb.append(", inetialStation=").append(inetialStation);
        sb.append(", remark=").append(remark);
        sb.append(", createDate=").append(createDate);
        sb.append(", consignerPhoto=").append(consignerPhoto);
        sb.append(", transferTo=").append(transferTo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}