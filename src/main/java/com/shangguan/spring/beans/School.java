package com.shangguan.spring.beans;

import java.io.Serializable;

public class School implements Serializable {
    private Integer schId;

    private String schName;

    private String schAddress;

    private String schDescription;

    private static final long serialVersionUID = 1L;

    public Integer getSchId() {
        return schId;
    }

    public void setSchId(Integer schId) {
        this.schId = schId;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchAddress() {
        return schAddress;
    }

    public void setSchAddress(String schAddress) {
        this.schAddress = schAddress;
    }

    public String getSchDescription() {
        return schDescription;
    }

    public void setSchDescription(String schDescription) {
        this.schDescription = schDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schId=").append(schId);
        sb.append(", schName=").append(schName);
        sb.append(", schAddress=").append(schAddress);
        sb.append(", schDescription=").append(schDescription);
        sb.append("]");
        return sb.toString();
    }
}