package com.ssm.entity;

import java.io.Serializable;

/**
 * line_management
 * @author 
 */
public class LineManagement implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 城市
     */
    private String city;

    /**
     * 缩写
     */
    private String abbreviation;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 电话
     */
    private String photo;

    /**
     * 郑货总部分成比例（%）
     */
    private String totalProportion;

    /**
     * 郑货分公司分成比例（%）
     */
    private String branchProportion;

    /**
     * 返货总部分成比例（%）
     */
    private String returnTotalProportion;

    /**
     * 返货分公司分成比例（%）
     */
    private String returnBranchProportion;

    /**
     * 内线中转发货方分成比例（%）
     */
    private String proportion1;

    /**
     * 内线中转收货方分成比例（%）
     */
    private String proportion2;

    /**
     * 至郑单价（元/公斤㎏）
     */
    private String unitPrice;

    /**
     * 至郑单价（元/立方m3）
     */
    private String unitPrice2;

    public LineManagement() {
    }

    public LineManagement(Integer id, String city, String abbreviation, String contacts, String photo, String totalProportion, String branchProportion, String returnTotalProportion, String returnBranchProportion, String proportion1, String proportion2, String unitPrice, String unitPrice2, String startingFare) {
        this.id = id;
        this.city = city;
        this.abbreviation = abbreviation;
        this.contacts = contacts;
        this.photo = photo;
        this.totalProportion = totalProportion;
        this.branchProportion = branchProportion;
        this.returnTotalProportion = returnTotalProportion;
        this.returnBranchProportion = returnBranchProportion;
        this.proportion1 = proportion1;
        this.proportion2 = proportion2;
        this.unitPrice = unitPrice;
        this.unitPrice2 = unitPrice2;
        this.startingFare = startingFare;
    }

    /**
     * 至郑起步价
     */

    private String startingFare;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTotalProportion() {
        return totalProportion;
    }

    public void setTotalProportion(String totalProportion) {
        this.totalProportion = totalProportion;
    }

    public String getBranchProportion() {
        return branchProportion;
    }

    public void setBranchProportion(String branchProportion) {
        this.branchProportion = branchProportion;
    }

    public String getReturnTotalProportion() {
        return returnTotalProportion;
    }

    public void setReturnTotalProportion(String returnTotalProportion) {
        this.returnTotalProportion = returnTotalProportion;
    }

    public String getReturnBranchProportion() {
        return returnBranchProportion;
    }

    public void setReturnBranchProportion(String returnBranchProportion) {
        this.returnBranchProportion = returnBranchProportion;
    }

    public String getProportion1() {
        return proportion1;
    }

    public void setProportion1(String proportion1) {
        this.proportion1 = proportion1;
    }

    public String getProportion2() {
        return proportion2;
    }

    public void setProportion2(String proportion2) {
        this.proportion2 = proportion2;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnitPrice2() {
        return unitPrice2;
    }

    public void setUnitPrice2(String unitPrice2) {
        this.unitPrice2 = unitPrice2;
    }

    public String getStartingFare() {
        return startingFare;
    }

    public void setStartingFare(String startingFare) {
        this.startingFare = startingFare;
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
        LineManagement other = (LineManagement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAbbreviation() == null ? other.getAbbreviation() == null : this.getAbbreviation().equals(other.getAbbreviation()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getPhoto() == null ? other.getPhoto() == null : this.getPhoto().equals(other.getPhoto()))
            && (this.getTotalProportion() == null ? other.getTotalProportion() == null : this.getTotalProportion().equals(other.getTotalProportion()))
            && (this.getBranchProportion() == null ? other.getBranchProportion() == null : this.getBranchProportion().equals(other.getBranchProportion()))
            && (this.getReturnTotalProportion() == null ? other.getReturnTotalProportion() == null : this.getReturnTotalProportion().equals(other.getReturnTotalProportion()))
            && (this.getReturnBranchProportion() == null ? other.getReturnBranchProportion() == null : this.getReturnBranchProportion().equals(other.getReturnBranchProportion()))
            && (this.getProportion1() == null ? other.getProportion1() == null : this.getProportion1().equals(other.getProportion1()))
            && (this.getProportion2() == null ? other.getProportion2() == null : this.getProportion2().equals(other.getProportion2()))
            && (this.getUnitPrice() == null ? other.getUnitPrice() == null : this.getUnitPrice().equals(other.getUnitPrice()))
            && (this.getUnitPrice2() == null ? other.getUnitPrice2() == null : this.getUnitPrice2().equals(other.getUnitPrice2()))
            && (this.getStartingFare() == null ? other.getStartingFare() == null : this.getStartingFare().equals(other.getStartingFare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAbbreviation() == null) ? 0 : getAbbreviation().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getPhoto() == null) ? 0 : getPhoto().hashCode());
        result = prime * result + ((getTotalProportion() == null) ? 0 : getTotalProportion().hashCode());
        result = prime * result + ((getBranchProportion() == null) ? 0 : getBranchProportion().hashCode());
        result = prime * result + ((getReturnTotalProportion() == null) ? 0 : getReturnTotalProportion().hashCode());
        result = prime * result + ((getReturnBranchProportion() == null) ? 0 : getReturnBranchProportion().hashCode());
        result = prime * result + ((getProportion1() == null) ? 0 : getProportion1().hashCode());
        result = prime * result + ((getProportion2() == null) ? 0 : getProportion2().hashCode());
        result = prime * result + ((getUnitPrice() == null) ? 0 : getUnitPrice().hashCode());
        result = prime * result + ((getUnitPrice2() == null) ? 0 : getUnitPrice2().hashCode());
        result = prime * result + ((getStartingFare() == null) ? 0 : getStartingFare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", city=").append(city);
        sb.append(", abbreviation=").append(abbreviation);
        sb.append(", contacts=").append(contacts);
        sb.append(", photo=").append(photo);
        sb.append(", totalProportion=").append(totalProportion);
        sb.append(", branchProportion=").append(branchProportion);
        sb.append(", returnTotalProportion=").append(returnTotalProportion);
        sb.append(", returnBranchProportion=").append(returnBranchProportion);
        sb.append(", proportion1=").append(proportion1);
        sb.append(", proportion2=").append(proportion2);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", unitPrice2=").append(unitPrice2);
        sb.append(", startingFare=").append(startingFare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}